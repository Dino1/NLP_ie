//package final_project;//commented out because i'm not using packages atm. comment back in when running on JACOB

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
public class Feature_set {

	public static void main(String[] args) {

		Scanner input_scanner = null;
		//try {input_scanner = new Scanner(new File(args[0]));}
		try {
			input_scanner = new Scanner(new File("input.txt"));
		}
		catch (FileNotFoundException e) {e.printStackTrace();}


		// Go through all articles
		String next_article_name = "";
		String current_article_name = "";
		boolean done_with_stuff=false;
    HashMap<String, Integer> dict=new HashMap<>();
    Integer index=0;
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
        Reader reader = new StringReader(the_article);
				DocumentPreprocessor dp = new DocumentPreprocessor(reader);

				for (List<HasWord> sentence : dp){
					for(HasWord w: sentence){
            if(dict.containsKey(w.word())){

            }
            else{
              dict.put(w.word(), index);
              index++;
            }
          }
        }
			}
		}
    try{
      FileOutputStream out_file = new FileOutputStream("./dict.ser");
      ObjectOutputStream out_stream = new ObjectOutputStream(out_file);
      out_stream.writeObject(dict);
      out_stream.close();
      out_file.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
	}
}
