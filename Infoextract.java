//package final_project;

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
	private static HashMap<String, Integer> dict = null;

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
			//input_scanner = new Scanner(new File("DEV_ALL"));
			input_scanner = new Scanner(new File("input.txt"));
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
			if(!next_article_found){
				done_with_stuff = true;
				current_article_name = next_article_name;
			}

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
							if(sub.yieldWords().size()<=4){
								if(sub.label()!=null){
									if(sub.label().value()!=null){
										if(sub.label().value().equals("NP")){
											Tree fuuu=sub.parent(t);
											if(fuuu!=null){
												fuuu.removeChild(fuuu.objectIndexOf(sub));
												noun_phrases.add(sub.yieldWords());
											}
										}
									}
								}
							}
						}
					}
				}

				Winnow weapons_winnow = new Winnow("./predict_weapon.txt");
				Winnow individuals_winnow = new Winnow("./predict_indv.txt");
				Winnow organizations_winnow = new Winnow("./predict_org.txt");
				Winnow targets_winnow = new Winnow("./predict_tar.txt");
				Winnow victims_winnow = new Winnow("./predict_vic.txt");


				ArrayList<String> weapons = new ArrayList<String>();
				ArrayList<String> individuals = new ArrayList<String>();
				ArrayList<String> organizations = new ArrayList<String>();
				ArrayList<String> targets = new ArrayList<String>();
				ArrayList<String> victims = new ArrayList<String>();

				double[] data;
				for(ArrayList<Word> np : noun_phrases){
					data = feature_maker(np);

					String noun_phrase="";
					for(Word w: np){
						noun_phrase+=" "+w.word();
					}
					noun_phrase=noun_phrase.substring(1);

					if(weapons_winnow.predict(data) == 1)
						weapons.add(noun_phrase);
					if(individuals_winnow.predict(data) == 1)
						individuals.add(noun_phrase);
					if(organizations_winnow.predict(data) == 1)
						organizations.add(noun_phrase);
					if(targets_winnow.predict(data) == 1)
						targets.add(noun_phrase);
					if(victims_winnow.predict(data) == 1)
						victims.add(noun_phrase);
				}

				// DO SOME MAGICAL WORK TO IDENTIFY WHICH NOUN PHRASES ARE ACTUALLY DUPLICATES

				// ...

				// OUTPUT THE STUFFS
				writer.println("ID:             " + ID);
				writer.println("INCIDENT:       " + "ATTACK");

				if(weapons.size() == 0)
					writer.println("WEAPON:         " + "-");
				for(int i = 0; i < weapons.size(); i++){
					if(i == 0)
						writer.println("WEAPON:         " + weapons.get(0));
					else
						writer.println("                " + weapons.get(i));
				}

				if(individuals.size() == 0)
					writer.println("PERP INDIV:     " + "-");
				for(int i = 0; i < individuals.size(); i++){
					if(i == 0)
						writer.println("PERP INDIV:     " + individuals.get(0));
					else
						writer.println("                " + individuals.get(i));
				}

				if(organizations.size() == 0)
					writer.println("PERP ORG:       " + "-");
				for(int i = 0; i < organizations.size(); i++){
					if(i == 0)
						writer.println("PERP ORG:       " + organizations.get(0));
					else
						writer.println("                " + organizations.get(i));
				}

				if(targets.size() == 0)
					writer.println("TARGET:         " + "-");
				for(int i = 0; i < targets.size(); i++){
					if(i == 0)
						writer.println("TARGET:         " + targets.get(0));
					else
						writer.println("                " + targets.get(i));
				}

				if(victims.size() == 0)
					writer.println("VICTIM:         " + "-");
				for(int i = 0; i < victims.size(); i++){
					if(i == 0)
						writer.println("VICTIM:         " + victims.get(0));
					else
						writer.println("                " + victims.get(i));
				}

				writer.println("");
			}
		}

		writer.close();
	}

	private static double[]  feature_maker(ArrayList<Word> noun_phrase){
		int size_of=dict.size();
		double[] output = new double[size_of];
		for(Word w:noun_phrase){
			if(dict.containsKey(w.word())){
				output[dict.get(w.word())]=1;
			}
		}
		/*
		for(int i=0; i<size_of; i++){
			if(output[i]==0){
				output[i+size_of]=1;
			}
		}
		*/

		return output;
	}
}
