package final_project;//commented out because i'm not using packages atm. comment back in when running on JACOB

//import Winnow;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.ling.SentenceUtils;
import edu.stanford.nlp.parser.lexparser.LexicalizedParser;
import edu.stanford.nlp.parser.shiftreduce.ShiftReduceParser;
import edu.stanford.nlp.process.CoreLabelTokenFactory;
import edu.stanford.nlp.process.DocumentPreprocessor;
import edu.stanford.nlp.process.PTBTokenizer;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;
import edu.stanford.nlp.trees.Constituent;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.ling.Word;

/**
 * CS 5340
 * Final Project
 *
 * @author Jacob Luke and Bernard Serbinowski
 *
 */
public class Infoextract {
	private static HashMap<String, Integer> dict=null;

	public static void main(String[] args) {

		try {
			 FileInputStream in_file = new FileInputStream("./dict.ser");
			 ObjectInputStream in = new ObjectInputStream(in_file);
			 dict = (HashMap<String, Integer>) in.readObject();
			 in.close();
			 in_file.close();
		} catch (IOException e) {
			 e.printStackTrace();
			 return;
		} catch (ClassNotFoundException e) {
			 return;
		}



		Scanner input_scanner = null;
		PrintWriter  writer = null;
		//try {input_scanner = new Scanner(new File(args[0]));}
		try {
			input_scanner = new Scanner(new File("ANS_ALL"));
			//input_scanner = new Scanner(new File("input.txt"));
			writer = new PrintWriter("input.txt.template");
		}
		catch (FileNotFoundException e) {e.printStackTrace();}

		MaxentTagger tagger = new MaxentTagger("./english-left3words-distsim.tagger");
		//LexicalizedParser parsnip = LexicalizedParser.loadModel();
		LexicalizedParser parsnip = LexicalizedParser.loadModel("englishPCFG.ser");

		// Go through all articles
		String next_article_name = "";
		String current_article_name = "";
		boolean done_with_stuff=false;
		while(!done_with_stuff){
			String the_article="";
			boolean next_article_found=false;
			while(input_scanner.hasNextLine() &&! next_article_found){
				String next_line = input_scanner.nextLine();

				if(next_line.matches("(DEV-MUC3-[0-9]{4}.*)|(TST1-MUC3-[0-9]{4}.*)|(TST2-MUC4-[0-9]{4}.*)")){
					next_article_found=true;
					current_article_name = next_article_name;
					next_article_name = next_line;
				}
				else
					the_article += next_line;
			}
			if(!next_article_found)
				done_with_stuff = true;

			if(!the_article.equals("")){

				// GET THE ID
				String ID = current_article_name.substring(0, 14);
				if(ID.charAt(0) == 'D')
					ID = ID.substring(0, 13);

				// SPLIT THE ARTICLE INTO SENTENCES
				Reader reader = new StringReader(the_article);
				DocumentPreprocessor dp = new DocumentPreprocessor(reader);
				ArrayList<Tree> tag_trees = new ArrayList<Tree>();
				ArrayList<ArrayList<Word>> noun_phrases=new ArrayList<ArrayList<Word>>();

				for (List<HasWord> sentence : dp)
					tag_trees.add(parsnip.apply(tagger.tagSentence(sentence)));


				for(Tree t : tag_trees){
					for(Tree sub: t){
						if(sub!=null){
							if(sub.label()!=null){
								if(sub.label().value()!=null){
									if(sub.label().value().equals("NP")){
										//for(Word w: sub.yieldWords()){
											//System.out.print(w.word()+" ");
										//}
										Tree fuuu=sub.parent(t);
										if(fuuu!=null){
											//fuuu.pennPrint();
											//System.out.print(fuuu.objectIndexOf(sub)+"  ");//this is the one we want
											fuuu.removeChild(fuuu.objectIndexOf(sub));
											noun_phrases.add(sub.yieldWords());
											System.out.println(sub.yieldWords());
											System.out.println("---------------------------------------");

											//fuuu.pennPrint();
											//sub.pennPrint();
										}
									}
								}
							}
						}
					}
				}

				// OUTPUT THE STUFFS
				writer.println("ID:             " + ID);
				writer.println("INCIDENT:       " + "ATTACK");

				writer.println("WEAPON:         " + "ARTILLERY FIRE");
				writer.println("                " + "EXPLOSIONS");

				writer.println("PERP INDIV:     " + "-");
				writer.println("                " + "-");

				writer.println("PERP ORG:       " + "-");
				writer.println("                " + "-");

				writer.println("TARGET:         " + "-");
				writer.println("                " + "-");

				writer.println("VICTIM:         " + "-");
				writer.println("                " + "-");

				writer.println("");
			}
		}

		writer.close();
	}

	private double[]  feature_maker(ArrayList<Word> noun_phrase){
		int size_of=dict.size();
		double[] output=new double[size_of];
		for(Word w:noun_phrase){
			if(dict.containsKey(w.word())){
				output[dict.get(w.word())]=1;
			}
		}
		return output;
		/*
		for(int i=0; i<size_of; i++){
			if(output[i]==0){
				output[i+size_of]=1;
			}
		}
		*/
	}
}
