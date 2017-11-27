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

import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.TrueCaseAnnotator;
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
}
/**
 * CS 5340
 * Final Project
 *
 * @author Jacob Luke and Bernard Serbinowski
 *
 */
public class Infoextract_cond {
	private static HashMap<String, Integer> dict=null;
  //private static   HashMap<String, Double> prob_weap=null;
  //private static   HashMap<String, Double> prob_tar=null;
  private static   HashMap<String, Double> prob_vic=null;
  //private static   HashMap<String, Double> prob_org=null;
  //private static   HashMap<String, Double> prob_indv=null;

  private static int hits=0;
  private static int tries=0;

	private static HashMap<String, Freq_tuple> freq=new HashMap<String, Freq_tuple>();
		private static AbstractSequenceClassifier<CoreLabel> classifier = null;


	public static void main(String[] args) {
		try {
			 FileInputStream in_file = new FileInputStream("./dict.ser");
			 ObjectInputStream in = new ObjectInputStream(in_file);
			 dict = (HashMap<String, Integer>) in.readObject();
			 in.close();
			 in_file.close();
/*
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
			 */

       in_file = new FileInputStream("./cond_probs/cond_vic.ser");
			 in = new ObjectInputStream(in_file);
			 prob_vic = (HashMap<String, Double>) in.readObject();
			 in.close();
			 in_file.close();

			 classifier=CRFClassifier.getClassifier("./english.all.3class.distsim.crf.ser.gz");

		} catch (IOException e) {
			 e.printStackTrace();
			 return;
		} catch (ClassNotFoundException e) {
			 return;
		}
		for(String s: prob_vic.keySet()){
			if(prob_vic.get(s)>0.3){
				System.out.println(s+";;;;;"+prob_vic.get(s));
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
		TrueCaseAnnotator caser = new TrueCaseAnnotator("./truecasing.fast.caseless.qn.ser.gz", TrueCaseAnnotator.DEFAULT_MODEL_BIAS, "./MixDisambiguation.list" , false, false);

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
					the_article +=(" "+next_line);
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
				/*
        List<HasWord> best_sentence=null;
        double best_val=0;

				for (List<HasWord> sentence : dp){
          double cur_best=0;
          for (HasWord word: sentence){
            if(prob_vic.containsKey(word.word())){
              if(cur_best<prob_vic.get(word.word())){
                cur_best=prob_vic.get(word.word());
              }
            }
          }
          if(best_val<cur_best){
            best_val=cur_best;
            best_sentence=sentence;
          }
        }
        update_hit_count(best_sentence, ans_vic);
				*/
				boolean no_attempt=true;
				for (List<HasWord> sentence : dp){
					String sent="";
					for(HasWord word: sentence){
						sent=sent+" "+word.word();
					}
					List<List<CoreLabel>> out = classifier.classify(sent);
					boolean sent_done=false;
		      for (List<CoreLabel> augh : out) {
						int count=-1;
		        for (CoreLabel word : augh) {
							count=count+1;
		          //System.out.print(word.word() + '/' + word.get(CoreAnnotations.AnswerAnnotation.class)+" ");
							if(word.get(CoreAnnotations.AnswerAnnotation.class).equals("PERSON")){
								for(int sub_count=count-4; sub_count<augh.size(); sub_count++){
									if(sub_count>=0){
										if(prob_vic.containsKey(augh.get(sub_count).word().toUpperCase())){
											if(prob_vic.get(augh.get(sub_count).word().toUpperCase())>.5){
							        	update_hit_count(sentence, ans_vic, word.word());
												no_attempt=false;
												sent_done=true;
												break;
											}
										}
									}
								}
							}
		        }
						if(sent_done){
							break;
						}
		      }
        }
				if(no_attempt){
					update_hit_count(null, ans_vic, "");
				}
        //
			}
		}
		for(String s: freq.keySet()){
			System.out.println(s);
			freq.get(s).print_ratio();
			System.out.println();
		}
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

	private static void update_hit_count(List<HasWord> sentence, ArrayList<String[]> ans_, String word_in){
		if(sentence==null){
			/*
			System.out.println(";"+(ans_.get(0))[0]+";");
			if(prob_vic.containsKey((ans_.get(0))[0])){
				if(prob_vic.get((ans_.get(0))[0])>0.0){
					for(String s: ans_.get(0)){
						System.out.print(s+" ");
					}
					System.out.println();
					System.out.println("WHAT THE FUCK THIS BULLSHIT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				}
			}*/

			//System.out.println("HELLOOOOO");
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
