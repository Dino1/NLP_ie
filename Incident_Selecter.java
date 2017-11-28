

//import final_project.Winnow;

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
import java.util.Arrays;
import java.util.Properties;

import edu.stanford.nlp.pipeline.*;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.util.CoreMap;
import edu.stanford.nlp.ling.CoreAnnotations.*;
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
import edu.stanford.nlp.parser.nndep.DependencyParser;
import edu.stanford.nlp.trees.GrammaticalStructure;
import edu.stanford.nlp.trees.TypedDependency;
import edu.stanford.nlp.ie.AbstractSequenceClassifier;
import edu.stanford.nlp.ie.crf.*;
import edu.stanford.nlp.ling.CoreAnnotations;

/**
 * CS 5340
 * Final Project
 *
 * @author Jacob Luke and Bernard Serbinowski
 *
 */


class Freq_tuple {
	public int numerator;
	public int denominator;

	public Freq_tuple(int n, int d){
		numerator=n;
		denominator=d;
	}
	public void inc_both(){
		numerator++;
		denominator++;
	}
	public void inc_de(){
		denominator=denominator+1;
	}
	public Double get_doub(int cut_off, double min_val){
		//System.out.println(numerator+"  "+denominator+ " "+((double)(numerator))/((double)(denominator)));
		if(numerator<cut_off){
			return 0.0;
		}
		if(((double)(numerator))/((double)(denominator))<min_val){
			return 0.0;
		}
		return ((double)(numerator))/((double)(denominator));
	}
}

public class Incident_Selecter{
	private static HashMap<String, Integer> dict=null;
/*
	private static HashMap<String, Freq_tuple> freq_weapon=new HashMap<>();
	private static HashMap<String, Freq_tuple> freq_indv=new HashMap<>();
	private static HashMap<String, Freq_tuple> freq_org=new HashMap<>();
	private static HashMap<String, Freq_tuple> freq_tar=new HashMap<>();
	private static HashMap<String, Freq_tuple> freq_vic=new HashMap<>();
*/
	private static HashMap<String, Freq_tuple> freq_arson=new HashMap<>();
	private static HashMap<String, Freq_tuple> freq_attack=new HashMap<>();
	private static HashMap<String, Freq_tuple> freq_bombing=new HashMap<>();
	private static HashMap<String, Freq_tuple> freq_kidnapping=new HashMap<>();
	private static HashMap<String, Freq_tuple> freq_robbery=new HashMap<>();

	private static ArrayList<HashMap<String, Freq_tuple> > not_arson=new ArrayList<HashMap<String, Freq_tuple> >(Arrays.asList(freq_attack, freq_bombing, freq_kidnapping, freq_robbery));
	private static ArrayList<HashMap<String, Freq_tuple> > not_attack=new ArrayList<HashMap<String, Freq_tuple> >(Arrays.asList(freq_arson, freq_bombing, freq_kidnapping, freq_robbery));
	private static ArrayList<HashMap<String, Freq_tuple> > not_bombing=new ArrayList<HashMap<String, Freq_tuple> >(Arrays.asList(freq_attack, freq_arson, freq_kidnapping, freq_robbery));
	private static ArrayList<HashMap<String, Freq_tuple> > not_kidnapping=new ArrayList<HashMap<String, Freq_tuple> >(Arrays.asList(freq_attack, freq_bombing, freq_arson, freq_robbery));
	private static ArrayList<HashMap<String, Freq_tuple> > not_robbery=new ArrayList<HashMap<String, Freq_tuple> >(Arrays.asList(freq_attack, freq_bombing, freq_kidnapping, freq_arson));


	private static ArrayList<String> ignore_arson=new ArrayList<String>(Arrays.asList(""));
	private static ArrayList<String> ignore_attack=new ArrayList<String>(Arrays.asList(""));
	private static ArrayList<String> ignore_bombing=new ArrayList<String>(Arrays.asList(""));
	private static ArrayList<String> ignore_kidnapping=new ArrayList<String>(Arrays.asList(""));
	private static ArrayList<String> ignore_robbery=new ArrayList<String>(Arrays.asList(""));

	private static AbstractSequenceClassifier<CoreLabel> classifier = null;

	public static void main(String[] args) {





		try {
			 FileInputStream in_file = new FileInputStream("./dict.ser");
			 ObjectInputStream in = new ObjectInputStream(in_file);
			 dict = (HashMap<String, Integer>) in.readObject();
			 in.close();
			 in_file.close();
/*
			 in_file = new FileInputStream("./sentence_probs_adv/prob_vic_adv.ser");
			 in = new ObjectInputStream(in_file);
			 dict = (HashMap<String, Integer>) in.readObject();
			 in.close();
			 in_file.close();
*/

			 classifier=CRFClassifier.getClassifier("./english.all.3class.distsim.crf.ser.gz");
		} catch (IOException e) {
			 e.printStackTrace();
			 return;
		} catch (ClassNotFoundException e) {
			 return;
		}

		Scanner input_scanner = null;
    Scanner ans_scanner = null;
		PrintWriter  writer = null;
		try {
			//input_scanner = new Scanner(new File("input.txt"));
  		//ans_scanner = new Scanner(new File("output.txt"));



			//input_scanner = new Scanner(new File("testset1-input.txt"));
      //ans_scanner = new Scanner(new File("testset1-anskeys.txt"));

			//input_scanner = new Scanner(new File("DEV_ALL"));
      //ans_scanner = new Scanner(new File("ANS_ALL"));

			input_scanner = new Scanner(new File("every.txt"));
      ans_scanner = new Scanner(new File("every_ans.txt"));

			//writer = new PrintWriter("input.txt.template");
		}
		catch (FileNotFoundException e) {e.printStackTrace();}


		MaxentTagger tagger = new MaxentTagger("./english-left3words-distsim.tagger");
		LexicalizedParser parsnip = LexicalizedParser.loadModel("englishPCFG.ser");
		Properties props = new Properties();
		props.put("annotators", "tokenize, ssplit, truecase");
		StanfordCoreNLP pipeline = new StanfordCoreNLP(props);

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
					the_article +=" "+ next_line;
			}
			if(!next_article_found){
				done_with_stuff = true;
				current_article_name = next_article_name;
			}

			if(!the_article.equals("")){
        String ans_id="";//0
        String ans_inc="";//1
        ArrayList<String[]> ans_weapon=new ArrayList<String[]>();//2
        ArrayList<String[]> ans_indv=new ArrayList<String[]>();//3
        ArrayList<String[]> ans_org=new ArrayList<String[]>();//4
        ArrayList<String[]> ans_tar=new ArrayList<String[]>();//5
        ArrayList<String[]> ans_vic=new ArrayList<String[]>();//6
        boolean ans_found=false;
        boolean ans_done=false;
        int ans_count=0;

				// GET THE ID
				String ID = current_article_name.substring(0, 14);
				if(ID.charAt(0) == 'D'){
					ID = ID.substring(0, 13);
        }
				//System.out.println(ID);


        while(ans_scanner.hasNextLine() &&! ans_done){
    				String next_line = ans_scanner.nextLine();
            String[] things;
            if(ans_found){
              if(next_line.trim().length()==0){
                ans_done=true;
              }
              else{
                if(next_line.charAt(0)!=' '){
                  ans_count++;
                }
                String consider=next_line.substring(16);
                switch(ans_count){
                  case 1:
                        ans_inc=consider;
                        break;
                  case 2:
                        things=consider.split("/");
                        for(int counter=0; counter<things.length; counter++){
                          ans_weapon.add((things[counter]).split(" "));
                        }
                        break;
                  case 3:
                        things=consider.split("/");
                        for(int counter=0; counter<things.length; counter++){
                          ans_indv.add((things[counter]).split(" "));
                        }
                        break;
                  case 4:
                        things=consider.split("/");
                        for(int counter=0; counter<things.length; counter++){
                          ans_org.add((things[counter]).split(" "));
                        }
                        break;
                  case 5:
                        things=consider.split("/");
                        for(int counter=0; counter<things.length; counter++){
                          ans_tar.add((things[counter]).split(" "));
                        }
                        break;
                  case 6:
                        things=consider.split("/");
                        for(int counter=0; counter<things.length; counter++){
                          ans_vic.add((things[counter]).split(" "));
                        }
                        break;
                  default:
                        ans_done=true;
                        break;

                }
              }

            }
            else{
              if(ID.equals(next_line.substring(16))){
                ans_id=ID;
                ans_found=true;
              }
            }
    		}

				// SPLIT THE ARTICLE INTO SENTENCES
				Annotation article_with_case = new Annotation(the_article.toLowerCase());
				Reader reader = new StringReader(article_with_case.toString());
				DocumentPreprocessor dp = new DocumentPreprocessor(reader);
				ArrayList<Tree> tag_trees = new ArrayList<Tree>();
				ArrayList<ArrayList<Word>> noun_phrases=new ArrayList<ArrayList<Word>>();

				//ArrayList<String> ignore_vic = new ArrayList<String>(Arrays.asList("HER", "PRESIDENTIAL", "SEVERAL", "KILLED", "10", "THAT", "ONE", "WAS",  "TWO", "FIVE", "SIX", "BY", "IS", "AS", "AT", "ON", "TO", "THIS","AND", "THE", "OF", "A", "IN", "", "-", "-LSB-", "-RSB-", "-RRB-", "-LRB-", "", ",", ";", ".", "'S", "--", "``"));

				if(ans_inc.equals("ARSON")){
					for (List<HasWord> sentence : dp){
						update_freq_count(freq_arson, sentence, not_arson);
					}
				}
				else if(ans_inc.equals("BOMBING")){
					for (List<HasWord> sentence : dp){
						update_freq_count(freq_bombing, sentence, not_bombing);
					}

				}
				else if(ans_inc.equals("KIDNAPPING")){
					for (List<HasWord> sentence : dp){
						update_freq_count(freq_kidnapping, sentence, not_kidnapping);
					}

				}
				else if(ans_inc.equals("ROBBERY")){
					for (List<HasWord> sentence : dp){
						update_freq_count(freq_robbery, sentence, not_robbery);
					}

				}
				else{//interpret this as attack
					for (List<HasWord> sentence : dp){
						update_freq_count(freq_attack, sentence, not_attack);
					}

				}


			}
		}

		//SAVE ALL THE THINGS
		/*
		HashMap<String, Double> prob_weapon=terrible_converter(freq_weapon, 0, 0);
		HashMap<String, Double> prob_vic=terrible_converter(freq_vic, 0, 0);
		HashMap<String, Double> prob_tar=terrible_converter(freq_tar, 0, 0);
		HashMap<String, Double> prob_org=terrible_converter(freq_org, 0, 0);
		HashMap<String, Double> prob_indv=terrible_converter(freq_indv, 0, 0);
		*/
		HashMap<String, Double> prob_arson=terrible_converter(freq_arson, 1, 1.01);//was previously .01
		HashMap<String, Double> prob_attack=terrible_converter(freq_attack, 1, .7);
		HashMap<String, Double> prob_bombing=terrible_converter(freq_bombing, 1, .15);
		HashMap<String, Double> prob_kidnapping=terrible_converter(freq_kidnapping, 1, .09);
		HashMap<String, Double> prob_robbery=terrible_converter(freq_robbery, 1, 1.1);//never predict robbery

		Set<String> all_now=new HashSet<String>();
		all_now.addAll(prob_arson.keySet());
		all_now.addAll(prob_attack.keySet());
		all_now.addAll(prob_bombing.keySet());
		all_now.addAll(prob_kidnapping.keySet());
		all_now.addAll(prob_robbery.keySet());
		for(String s: all_now){
			int count=0;
			if(prob_arson.containsKey(s)){
				if(prob_arson.get(s)>0){
					count++;
				}
			}
			if(prob_attack.containsKey(s)){
				if(prob_attack.get(s)>0){
					count++;
				}
			}
			if(prob_bombing.containsKey(s)){
				if(prob_bombing.get(s)>0){
					count++;
				}
			}
			if(prob_kidnapping.containsKey(s)){
				if(prob_kidnapping.get(s)>0){
					count++;
				}
			}
			if(prob_robbery.containsKey(s)){
				if(prob_robbery.get(s)>0){
					count++;
				}
			}
			if(count>1){
				prob_arson.put(s, 0.0);
				prob_attack.put(s, 0.0);
				prob_bombing.put(s, 0.0);
				prob_kidnapping.put(s, 0.0);
				prob_robbery.put(s, 0.0);
			}
		}
    try {
      FileOutputStream fileOut = new FileOutputStream("./sentence_probs_adv/prob_arson.ser");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(prob_arson);
      out.close();
      fileOut.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
		try {
			FileOutputStream fileOut = new FileOutputStream("./sentence_probs_adv/prob_attack.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(prob_attack);
			out.close();
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileOutputStream fileOut = new FileOutputStream("./sentence_probs_adv/prob_bombing.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(prob_bombing);
			out.close();
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileOutputStream fileOut = new FileOutputStream("./sentence_probs_adv/prob_kidnapping.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(prob_kidnapping);
			out.close();
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileOutputStream fileOut = new FileOutputStream("./sentence_probs_adv/prob_robbery.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(prob_robbery);
			out.close();
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static HashMap<String, Double> terrible_converter(HashMap<String, Freq_tuple> input, int cut_off, double min_val){
		HashMap<String, Double> prob=new HashMap<>();
		for(String s: input.keySet()){
			prob.put(s, input.get(s).get_doub(cut_off, min_val));
		}
		//System.out.println(prob.size()+"   "+input.size());
		return prob;
	}

	private static void update_freq_count(HashMap<String, Freq_tuple> freq, List<HasWord> sentence, List<HashMap<String, Freq_tuple> > the_rest){
		for(HasWord word: sentence){
				if(freq.containsKey(word.word().toUpperCase())){
					freq.get(word.word().toUpperCase()).inc_both();
				}
				else{
					freq.put(word.word().toUpperCase(), new Freq_tuple(1, 1));
				}
				for(HashMap<String, Freq_tuple> cur: the_rest){
					if(cur.containsKey(word.word().toUpperCase())){
						cur.get(word.word().toUpperCase()).inc_de();
					}
					else{
						cur.put(word.word().toUpperCase(), new Freq_tuple(0, 1));
					}
				}
		}
	}

	/*
	private static void update_freq_count(HashMap<String, Freq_tuple> freq, List<HasWord> sentence, String ans_, ArrayList<String> ignore_words, int range){
		for(HasWord word: sentence){
			if(ignore_words.contains(word.word().toUpperCase())){

			}
			else{
				if(freq.containsKey(word.word().toUpperCase())){
					freq.get(word.word().toUpperCase()).inc_both();
				}
				else{
					freq.put(word.word().toUpperCase(), new Freq_tuple(1, 1));
				}
			}
		}
	}
	*/

}
