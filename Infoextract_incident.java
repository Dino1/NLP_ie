//package final_project;//commented out because i'm not using packages atm. comment back in when running on JACOB


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
	public void print_ratio(){
		System.out.println("Hits: "+numerator);
		System.out.println("Misses: "+(denominator-numerator));
	}
	public Double get_doub(){
		//System.out.println(numerator+"  "+denominator+ " "+((double)(numerator))/((double)(denominator)));
		if(numerator<15){
			return 0.0;
		}
		if(((double)(numerator))/((double)(denominator))<.1){
			return 0.0;
		}
		return ((double)(numerator))/((double)(denominator));
	}
	public boolean worthless(double thresh){
		if( (((double)(numerator))/((double)(denominator))) < thresh){
			return true;
		}
		return false;
	}
}
/**
 * CS 5340
 * Final Project
 *
 * @author Jacob Luke and Bernard Serbinowski
 *
 */
public class Infoextract_incident {
	private static HashMap<String, Integer> dict=null;
  private static   HashMap<String, Double> prob_attack=null;
  private static   HashMap<String, Double> prob_arson=null;
  private static   HashMap<String, Double> prob_bombing=null;
  private static   HashMap<String, Double> prob_kidnapping=null;
  private static   HashMap<String, Double> prob_robbery=null;

  private static int hits=0;
  private static int tries=0;

	private static HashMap<String, Freq_tuple> freq_bombing=new HashMap<String, Freq_tuple>();
	private static HashMap<String, Freq_tuple> freq_arson=new HashMap<String, Freq_tuple>();
	private static HashMap<String, Freq_tuple> freq_robbery=new HashMap<String, Freq_tuple>();
	private static HashMap<String, Freq_tuple> freq_kidnapping=new HashMap<String, Freq_tuple>();
	private static HashMap<String, Freq_tuple> freq_attack=new HashMap<String, Freq_tuple>();


	public static void main(String[] args) {
		try {
			 FileInputStream in_file = new FileInputStream("./dict.ser");
			 ObjectInputStream in = new ObjectInputStream(in_file);
			 dict = (HashMap<String, Integer>) in.readObject();
			 in.close();
			 in_file.close();

       in_file = new FileInputStream("./sentence_probs_adv/prob_robbery.ser");
			 in = new ObjectInputStream(in_file);
			 prob_robbery = (HashMap<String, Double>) in.readObject();
			 in.close();
			 in_file.close();

       in_file = new FileInputStream("./sentence_probs_adv/prob_kidnapping.ser");
			 in = new ObjectInputStream(in_file);
			 prob_kidnapping = (HashMap<String, Double>) in.readObject();
			 in.close();
			 in_file.close();

       in_file = new FileInputStream("./sentence_probs_adv/prob_attack.ser");
			 in = new ObjectInputStream(in_file);
			 prob_attack = (HashMap<String, Double>) in.readObject();
			 in.close();
			 in_file.close();

       in_file = new FileInputStream("./sentence_probs_adv/prob_arson.ser");
			 in = new ObjectInputStream(in_file);
			 prob_arson = (HashMap<String, Double>) in.readObject();
			 in.close();
			 in_file.close();

       in_file = new FileInputStream("./sentence_probs_adv/prob_bombing.ser");
			 in = new ObjectInputStream(in_file);
			 prob_bombing = (HashMap<String, Double>) in.readObject();
			 in.close();
			 in_file.close();

		} catch (IOException e) {
			 e.printStackTrace();
			 return;
		} catch (ClassNotFoundException e) {
			 return;
		}
		/*
		System.out.println("bombing");
		for(String s: prob_bombing.keySet()){
			if(prob_bombing.get(s)>0.0){
				System.out.println(s+";;;;;"+prob_bombing.get(s));
			}
		}
		System.out.println();
		System.out.println("arson");
		for(String s: prob_arson.keySet()){
			if(prob_arson.get(s)>0.0){
				System.out.println(s+";;;;;"+prob_arson.get(s));
			}
		}
		System.out.println();
		System.out.println("kidnapping");
		for(String s: prob_kidnapping.keySet()){
			if(prob_kidnapping.get(s)>0.0){
				System.out.println(s+";;;;;"+prob_kidnapping.get(s));
			}
		}
		System.out.println();
		System.out.println("robbery");
		for(String s: prob_robbery.keySet()){
			if(prob_robbery.get(s)>0.0){
				System.out.println(s+";;;;;"+prob_robbery.get(s));
			}
		}

		System.out.println();
		System.out.println("attack");
		for(String s: prob_attack.keySet()){
			if(prob_attack.get(s)>0.0){
				System.out.println(s+";;;;;"+prob_attack.get(s));
			}
		}
		*/
		Scanner input_scanner = null;
    Scanner ans_scanner = null;
		PrintWriter  writer = null;
		//try {input_scanner = new Scanner(new File(args[0]));}

		try {
			//input_scanner = new Scanner(new File("input.txt"));
  		//ans_scanner = new Scanner(new File("output.txt"));

			//input_scanner = new Scanner(new File("DEV_ALL"));
      //ans_scanner = new Scanner(new File("ANS_ALL"));

			input_scanner = new Scanner(new File("testset1-input.txt"));
      ans_scanner = new Scanner(new File("testset1-anskeys.txt"));

  		//input_scanner = new Scanner(new File("DEV-MUC3-0169"));
      //ans_scanner = new Scanner(new File("DEV-MUC3-0169.anskey"));
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
        ArrayList<String[]> ans_attackon=new ArrayList<String[]>();//2
        ArrayList<String[]> ans_robbery=new ArrayList<String[]>();//3
        ArrayList<String[]> ans_kidnapping=new ArrayList<String[]>();//4
        ArrayList<String[]> ans_arson=new ArrayList<String[]>();//5
        ArrayList<String[]> ans_bombing=new ArrayList<String[]>();//6
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
                          ans_attackon.add((things[counter]).split(" "));
                        }
                        break;
                  case 3:
                        things=consider.split("/");
                        for(int counter=0; counter<things.length; counter++){
                          ans_robbery.add((things[counter]).split(" "));
                        }
                        break;
                  case 4:
                        things=consider.split("/");
                        for(int counter=0; counter<things.length; counter++){
                          ans_kidnapping.add((things[counter]).split(" "));
                        }
                        break;
                  case 5:
                        things=consider.split("/");
                        for(int counter=0; counter<things.length; counter++){
                          ans_arson.add((things[counter]).split(" "));
                        }
                        break;
                  case 6:
                        things=consider.split("/");
                        for(int counter=0; counter<things.length; counter++){
                          ans_bombing.add((things[counter]).split(" "));
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


				//System.out.println(ans_inc);
				int arson=0;
				int attack=0;
				int bombing=0;
				int kidnapping=0;
				int robbery=0;
				int max=0;
				for (List<HasWord> sentence : dp){
          for (HasWord word: sentence){
            if(prob_arson.containsKey(word.word().toUpperCase())){
              if(0.0<prob_arson.get(word.word().toUpperCase())){
								arson++;
								if(arson>max){
									max=arson;
								}
			        	update_hit_count(freq_arson, "ARSON", ans_inc, word.word());
              }
            }
						if(prob_bombing.containsKey(word.word().toUpperCase())){
              if(0.0<prob_bombing.get(word.word().toUpperCase())){
								bombing++;
								if(bombing>max){
									max=bombing;
								}
			        	update_hit_count(freq_bombing, "BOMBING", ans_inc, word.word());
              }
            }
						if(prob_kidnapping.containsKey(word.word().toUpperCase())){
              if(0.0<prob_kidnapping.get(word.word().toUpperCase())){
								kidnapping++;
								if(kidnapping>max){
									max=kidnapping;
								}
			        	update_hit_count(freq_kidnapping, "KIDNAPPING", ans_inc, word.word());
              }
            }
	          if(prob_attack.containsKey(word.word().toUpperCase())){
	            if(0.0<prob_attack.get(word.word().toUpperCase())){
								attack++;
								if(attack>max){
									max=attack;
								}
				      	update_hit_count(freq_attack, "ATTACK", ans_inc, word.word());
	            }
	          }
						if(prob_robbery.containsKey(word.word().toUpperCase())){
							if(0.0<prob_robbery.get(word.word().toUpperCase())){
								robbery++;
								if(robbery>max){
									max=robbery;
								}
								update_hit_count(freq_robbery, "ROBBERY", ans_inc, word.word());
							}
						}
          }
        }
				if(attack==max){
					if(ans_inc.equals("ATTACK")){
						hits++;
					}
					tries++;
				}
				else if(arson==max){
					if(ans_inc.equals("ARSON")){
						hits++;
					}
					tries++;
				}
				else if(bombing==max){
					if(ans_inc.equals("BOMBING")){
						hits++;
					}
					tries++;
				}
				else if(kidnapping==max){
					if(ans_inc.equals("KIDNAPPING")){
						hits++;
					}
					tries++;
				}
				else if(robbery==max){
					if(ans_inc.equals("ROBBERY")){
						hits++;
					}
					tries++;
				}
        //
			}
		}
		System.out.println("arson");
		for(String s: freq_arson.keySet()){
			if(freq_arson.get(s).worthless(.5)){
				System.out.print("\""+s+"\", ");
			}
		}
		System.out.println();
		System.out.println("kidnapping");
		for(String s: freq_kidnapping.keySet()){
			//System.out.println(s);
			if(freq_kidnapping.get(s).worthless(.5)){
				System.out.print("\""+s+"\", ");
			}
		}
		System.out.println();
		System.out.println("robbery");
		for(String s: freq_robbery.keySet()){
			if(freq_robbery.get(s).worthless(.5)){
				System.out.print("\""+s+"\", ");
			}
		}
		System.out.println();
		System.out.println("bombing");
		for(String s: freq_bombing.keySet()){
			if(freq_bombing.get(s).worthless(.5)){
				System.out.print("\""+s+"\", ");
			}
		}
		System.out.println();
		System.out.println("attack");
		for(String s: freq_attack.keySet()){
			//System.out.println(s);
			if(freq_attack.get(s).worthless(.75)){
				System.out.print("\""+s+"\", ");
			}
		}
		System.out.println();
		System.out.println("Hits: "+hits);
		System.out.println("Tries: "+tries);

	}

  private static double[]  feature_maker(ArrayList<Word> noun_phrase){
    int size_of=dict.size();
    double[] output=new double[size_of];
    for(Word w:noun_phrase){
      if(dict.containsKey(w.word())){
        output[dict.get(w.word())]=1;
      }
    }
    return output;
  }

	private static void update_hit_count(HashMap<String, Freq_tuple> freq, String prediction, String ans_, String word_in){
		if(prediction.equals(ans_)){
			if(freq.containsKey(word_in.toUpperCase())){
				freq.get(word_in.toUpperCase()).inc_both();
			}
			else{
				freq.put(word_in.toUpperCase(), new Freq_tuple(1, 1));
			}
		}
		else{
			if(freq.containsKey(word_in.toUpperCase())){
				freq.get(word_in.toUpperCase()).inc_de();
			}
			else{
				freq.put(word_in.toUpperCase(), new Freq_tuple(0, 1));
			}
		}
	}
}
