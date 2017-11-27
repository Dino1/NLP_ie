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
	public boolean worthless(){
		if((numerator*2)<denominator){
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
public class Infoextract_sentence_adv {
	private static HashMap<String, Integer> dict=null;
  private static   HashMap<String, Double> prob_weap=null;
  private static   HashMap<String, Double> prob_tar=null;
  private static   HashMap<String, Double> prob_vic=null;
  private static   HashMap<String, Double> prob_org=null;
  private static   HashMap<String, Double> prob_indv=null;

  private static int hits=0;
  private static int tries=0;

	private static HashMap<String, Freq_tuple> freq_vic=new HashMap<String, Freq_tuple>();
	private static HashMap<String, Freq_tuple> freq_tar=new HashMap<String, Freq_tuple>();
	private static HashMap<String, Freq_tuple> freq_indv=new HashMap<String, Freq_tuple>();
	private static HashMap<String, Freq_tuple> freq_org=new HashMap<String, Freq_tuple>();
	private static HashMap<String, Freq_tuple> freq_weap=new HashMap<String, Freq_tuple>();


	public static void main(String[] args) {
		try {
			 FileInputStream in_file = new FileInputStream("./dict.ser");
			 ObjectInputStream in = new ObjectInputStream(in_file);
			 dict = (HashMap<String, Integer>) in.readObject();
			 in.close();
			 in_file.close();

       in_file = new FileInputStream("./sentence_probs_adv/prob_indv_adv.ser");
			 in = new ObjectInputStream(in_file);
			 prob_indv = (HashMap<String, Double>) in.readObject();
			 in.close();
			 in_file.close();

       in_file = new FileInputStream("./sentence_probs_adv/prob_org_adv.ser");
			 in = new ObjectInputStream(in_file);
			 prob_org = (HashMap<String, Double>) in.readObject();
			 in.close();
			 in_file.close();

       in_file = new FileInputStream("./sentence_probs_adv/prob_weapon_adv.ser");
			 in = new ObjectInputStream(in_file);
			 prob_weap = (HashMap<String, Double>) in.readObject();
			 in.close();
			 in_file.close();

       in_file = new FileInputStream("./sentence_probs_adv/prob_tar_adv.ser");
			 in = new ObjectInputStream(in_file);
			 prob_tar = (HashMap<String, Double>) in.readObject();
			 in.close();
			 in_file.close();

       in_file = new FileInputStream("./sentence_probs_adv/prob_vic_adv.ser");
			 in = new ObjectInputStream(in_file);
			 prob_vic = (HashMap<String, Double>) in.readObject();
			 in.close();
			 in_file.close();

		} catch (IOException e) {
			 e.printStackTrace();
			 return;
		} catch (ClassNotFoundException e) {
			 return;
		}
		System.out.println("vic");
		for(String s: prob_vic.keySet()){
			if(prob_vic.get(s)>0.0){
				System.out.println(s+";;;;;"+prob_vic.get(s));
			}
		}
		System.out.println();
		System.out.println("tar");
		for(String s: prob_tar.keySet()){
			if(prob_tar.get(s)>0.0){
				System.out.println(s+";;;;;"+prob_tar.get(s));
			}
		}
		System.out.println();
		System.out.println("org");
		for(String s: prob_org.keySet()){
			if(prob_org.get(s)>0.0){
				System.out.println(s+";;;;;"+prob_org.get(s));
			}
		}
		System.out.println();
		System.out.println("indv");
		for(String s: prob_indv.keySet()){
			if(prob_indv.get(s)>0.0){
				System.out.println(s+";;;;;"+prob_indv.get(s));
			}
		}

		System.out.println();
		System.out.println("weap");
		for(String s: prob_weap.keySet()){
			if(prob_weap.get(s)>0.0){
				System.out.println(s+";;;;;"+prob_weap.get(s));
			}
		}
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


				boolean no_attempt_tar=true;
				boolean no_attempt_vic=true;
				boolean no_attempt_org=true;
				boolean no_attempt_indv=true;
				boolean no_attempt_weap=true;
				for (List<HasWord> sentence : dp){
          for (HasWord word: sentence){
            if(prob_tar.containsKey(word.word().toUpperCase())){
              if(0.0<prob_tar.get(word.word().toUpperCase())){
			        	update_hit_count(freq_tar, sentence, ans_tar, word.word());
								no_attempt_tar=false;
              }
            }
						if(prob_vic.containsKey(word.word().toUpperCase())){
              if(0.0<prob_vic.get(word.word().toUpperCase())){
			        	update_hit_count(freq_vic, sentence, ans_vic, word.word());
								no_attempt_vic=false;
              }
            }
						if(prob_org.containsKey(word.word().toUpperCase())){
              if(0.0<prob_org.get(word.word().toUpperCase())){
			        	update_hit_count(freq_org, sentence, ans_org, word.word());
								no_attempt_org=false;
              }
            }
	          if(prob_weap.containsKey(word.word().toUpperCase())){
	            if(0.0<prob_weap.get(word.word().toUpperCase())){
				      	update_hit_count(freq_weap, sentence, ans_weapon, word.word());
								no_attempt_weap=false;
	            }
	          }
						if(prob_indv.containsKey(word.word().toUpperCase())){
							if(0.0<prob_indv.get(word.word().toUpperCase())){
								update_hit_count(freq_indv, sentence, ans_indv, word.word());
								no_attempt_indv=false;
							}
						}
          }
        }
				if(no_attempt_tar){
					update_hit_count(freq_tar, null, ans_tar, "");
				}
				if(no_attempt_vic){
					update_hit_count(freq_vic, null, ans_vic, "");
				}
				if(no_attempt_org){
					update_hit_count(freq_org, null, ans_org, "");
				}
				if(no_attempt_indv){
					update_hit_count(freq_indv, null, ans_indv, "");
				}
				if(no_attempt_weap){
					update_hit_count(freq_weap, null, ans_weapon, "");
				}
        //
			}
		}
		System.out.println("target");
		for(String s: freq_tar.keySet()){
			if(freq_tar.get(s).worthless()){
				System.out.print("\""+s+"\", ");
			}
		}
		System.out.println();
		System.out.println("org");
		for(String s: freq_org.keySet()){
			//System.out.println(s);
			if(freq_org.get(s).worthless()){
				System.out.print("\""+s+"\", ");
			}
		}
		System.out.println();
		System.out.println("indv");
		for(String s: freq_indv.keySet()){
			if(freq_indv.get(s).worthless()){
				System.out.print("\""+s+"\", ");
			}
		}
		System.out.println();
		System.out.println("vic");
		for(String s: freq_vic.keySet()){
			if(freq_vic.get(s).worthless()){
				System.out.print("\""+s+"\", ");
			}
		}
		System.out.println();
		System.out.println("weap");
		for(String s: freq_weap.keySet()){
			//System.out.println(s);
			if(freq_weap.get(s).worthless()){
				System.out.print("\""+s+"\", ");
			}
		}
		System.out.println();
    System.out.println("hits: "+hits);
    System.out.println("tries: "+tries);


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

	private static void update_hit_count(HashMap<String, Freq_tuple> freq, List<HasWord> sentence, ArrayList<String[]> ans_, String word_in){
		if(sentence==null){
			if(((ans_.get(0))[0]).equals("-")){
				hits++;
			}
			tries++;
			return;
		}
		boolean seq_found=false;
    for(String[] ans: ans_){
  		int index_in_seq=0;
  		for(HasWord word: sentence){
  			if(ans[index_in_seq].equals(word.word().toUpperCase())){
  				index_in_seq=index_in_seq+1;
  				if(index_in_seq>=ans.length){
  						seq_found=true;
  						break;
  				}
  			}
  			else if(ans[0].equals(word.word().toUpperCase())){
  				index_in_seq=1;
  				if(index_in_seq>=ans.length){
  						seq_found=true;
  						break;
  				}
  			}
  			else{
  				index_in_seq=0;
  			}
  		}
    }

		if(seq_found){
			hits++;
      tries++;
			if(freq.containsKey(word_in.toUpperCase())){
				freq.get(word_in.toUpperCase()).inc_both();
			}
			else{
				freq.put(word_in.toUpperCase(), new Freq_tuple(1, 1));
			}
		}
		else{
			//System.out.println("Missed with: "+word_in);
			if(freq.containsKey(word_in.toUpperCase())){
				freq.get(word_in.toUpperCase()).inc_de();
			}
			else{
				freq.put(word_in.toUpperCase(), new Freq_tuple(0, 1));
			}
			tries++;
		}
	}
}
