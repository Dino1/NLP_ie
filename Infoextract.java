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
import java.util.Arrays;
import java.lang.Integer;
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

/**
 * CS 5340
 * Final Project
 *
 * @author Jacob Luke and Bernard Serbinowski
 *
 */
public class Infoextract {
	private static HashMap<String, Integer> dict = null;
  private static HashMap<String, Double> prob_weap=null;
  private static HashMap<String, Double> prob_tar=null;
  private static HashMap<String, Double> prob_vic=null;
  private static HashMap<String, Double> prob_org=null;
  private static HashMap<String, Double> prob_indv=null;


  private static HashMap<String, Double> term_weap=null;
  private static HashMap<String, Double> term_tar=null;
  private static HashMap<String, Double> term_vic=null;
  private static HashMap<String, Double> term_org=null;
  private static HashMap<String, Double> term_indv=null;


  private static   HashMap<String, Double> prob_attack=null;
  private static   HashMap<String, Double> prob_arson=null;
  private static   HashMap<String, Double> prob_bombing=null;
  private static   HashMap<String, Double> prob_kidnapping=null;
  private static   HashMap<String, Double> prob_robbery=null;

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

/////////////////////////////////////////////////

			 in_file = new FileInputStream("./term_terms_adv/term_indv_adv.ser");
			 in = new ObjectInputStream(in_file);
			 term_indv = (HashMap<String, Double>) in.readObject();
			 in.close();
			 in_file.close();

			 in_file = new FileInputStream("./term_terms_adv/term_org_adv.ser");
			 in = new ObjectInputStream(in_file);
			 term_org = (HashMap<String, Double>) in.readObject();
			 in.close();
			 in_file.close();

			 in_file = new FileInputStream("./term_terms_adv/term_weapon_adv.ser");
			 in = new ObjectInputStream(in_file);
			 term_weap = (HashMap<String, Double>) in.readObject();
			 in.close();
			 in_file.close();

			 in_file = new FileInputStream("./term_terms_adv/term_tar_adv.ser");
			 in = new ObjectInputStream(in_file);
			 term_tar = (HashMap<String, Double>) in.readObject();
			 in.close();
			 in_file.close();

			 in_file = new FileInputStream("./term_terms_adv/term_vic_adv.ser");
			 in = new ObjectInputStream(in_file);
			 term_vic = (HashMap<String, Double>) in.readObject();
			 in.close();
			 in_file.close();


//////////////////////////////////////////////////////

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



		Scanner input_scanner = null;
		PrintWriter  writer = null;
		try {
			input_scanner = new Scanner(new File(args[0]));
			//input_scanner = new Scanner(new File("DEV_ALL"));
			//input_scanner = new Scanner(new File("input.txt"));
			writer = new PrintWriter(args[0] + ".template");
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
					the_article += " " + next_line;
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

				// SET UP PIPELINE TO USE TRUE CASE
				the_article = the_article.toLowerCase();
				Annotation article_annotation = new Annotation(the_article);
				pipeline.annotate(article_annotation);

				// FIND WHICH WORDS NEED TO BE REPLACED
				List<CoreMap> sentences = article_annotation.get(SentencesAnnotation.class);
				String article_with_case = "";
				for(CoreMap sentence : sentences)
					for(CoreLabel token : sentence.get(TokensAnnotation.class)){
						String next_chunk = token.get(TrueCaseTextAnnotation.class);
						if(next_chunk.equals("'s"))
							article_with_case = article_with_case.substring(0, article_with_case.length() - 1) + "'s ";
						else
							article_with_case += next_chunk + " ";
					}

				Reader reader = new StringReader(article_with_case);
				DocumentPreprocessor dp = new DocumentPreprocessor(reader);

				ArrayList<Tree> tag_trees_vic = new ArrayList<Tree>();
				ArrayList<ArrayList<Word>> noun_phrases_vic=new ArrayList<ArrayList<Word>>();
				ArrayList<Tree> tag_trees_tar = new ArrayList<Tree>();
				ArrayList<ArrayList<Word>> noun_phrases_tar=new ArrayList<ArrayList<Word>>();
				ArrayList<Tree> tag_trees_weap = new ArrayList<Tree>();
				ArrayList<ArrayList<Word>> noun_phrases_weap=new ArrayList<ArrayList<Word>>();
				ArrayList<Tree> tag_trees_org = new ArrayList<Tree>();
				ArrayList<ArrayList<Word>> noun_phrases_org=new ArrayList<ArrayList<Word>>();
				ArrayList<Tree> tag_trees_indv = new ArrayList<Tree>();
				ArrayList<ArrayList<Word>> noun_phrases_indv=new ArrayList<ArrayList<Word>>();


				int arson=0;
				int attack=0;
				int bombing=0;
				int kidnapping=0;
				int robbery=0;
				int max=0;
				for (List<HasWord> sentence : dp){

					boolean no_attempt_tar=true;//these are named poorly. basically we go through each word in the sentence, check if we think it's likely
					boolean no_attempt_vic=true;
					boolean no_attempt_org=true;
					boolean no_attempt_indv=true;
					boolean no_attempt_weap=true;
          for (HasWord word: sentence){

						if(prob_arson.containsKey(word.word().toUpperCase())){
							if(0.0<prob_arson.get(word.word().toUpperCase())){
								arson++;
								if(arson>max){
									max=arson;
								}
							}
						}
						if(prob_bombing.containsKey(word.word().toUpperCase())){
							if(0.0<prob_bombing.get(word.word().toUpperCase())){
								bombing++;
								if(bombing>max){
									max=bombing;
								}
							}
						}
						if(prob_kidnapping.containsKey(word.word().toUpperCase())){
							if(0.0<prob_kidnapping.get(word.word().toUpperCase())){
								kidnapping++;
								if(kidnapping>max){
									max=kidnapping;
								}
							}
						}
						if(prob_attack.containsKey(word.word().toUpperCase())){
							if(0.0<prob_attack.get(word.word().toUpperCase())){
								attack++;
								if(attack>max){
									max=attack;
								}
							}
						}
						if(prob_robbery.containsKey(word.word().toUpperCase())){
							if(0.0<prob_robbery.get(word.word().toUpperCase())){
								robbery++;
								if(robbery>max){
									max=robbery;
								}
							}
						}




            if(prob_tar.containsKey(word.word().toUpperCase())){
              if(0.0<prob_tar.get(word.word().toUpperCase())){
			        	//update_hit_count(freq_tar, sentence, ans_tar, word.word());
								no_attempt_tar=false;
              }
            }
						if(prob_vic.containsKey(word.word().toUpperCase())){
              if(0.0<prob_vic.get(word.word().toUpperCase())){
			        	//update_hit_count(freq_vic, sentence, ans_vic, word.word());
								no_attempt_vic=false;
              }
            }
						if(prob_org.containsKey(word.word().toUpperCase())){
              if(0.0<prob_org.get(word.word().toUpperCase())){
			        	//update_hit_count(freq_org, sentence, ans_org, word.word());
								no_attempt_org=false;
              }
            }
	          if(prob_weap.containsKey(word.word().toUpperCase())){
	            if(0.0<prob_weap.get(word.word().toUpperCase())){
				      	//update_hit_count(freq_weap, sentence, ans_weapon, word.word());
								no_attempt_weap=false;
	            }
	          }
						if(prob_indv.containsKey(word.word().toUpperCase())){
							if(0.0<prob_indv.get(word.word().toUpperCase())){
								//update_hit_count(freq_indv, sentence, ans_indv, word.word());
								no_attempt_indv=false;
							}
						}
          }
					Tree temp_tree = parsnip.apply(tagger.tagSentence(sentence));
					if(no_attempt_tar==false){
						tag_trees_tar.add(temp_tree);
					}
					if(no_attempt_vic==false){
						tag_trees_vic.add(temp_tree);
					}
					if(no_attempt_org==false){
						tag_trees_org.add(temp_tree);
					}
					if(no_attempt_weap==false){
						tag_trees_weap.add(temp_tree);
					}
					if(no_attempt_indv==false){
						tag_trees_indv.add(temp_tree);
					}
				}
				String ans_inc="ATTACK";
				if(attack==max){
					ans_inc="ATTACK";
				}
				else if(arson==max){
					ans_inc="ARSON";
				}
				else if(bombing==max){
					ans_inc="BOMBING";
				}
				else if(kidnapping==max){
					ans_inc="KIDNAPPING";
				}
				else if(robbery==max){
					ans_inc="ROBBERY";
				}
				/*
				System.out.println();
				System.out.println(ans_inc);
				System.out.println(attack);
				System.out.println(arson);
				System.out.println(bombing);
				System.out.println(kidnapping);
				System.out.println(robbery);
				System.out.println(max);
				*/

				noun_phrase_extract(noun_phrases_tar, tag_trees_tar);
				noun_phrase_extract(noun_phrases_vic, tag_trees_vic);
				noun_phrase_extract(noun_phrases_org, tag_trees_org);
				noun_phrase_extract(noun_phrases_weap, tag_trees_weap);
				noun_phrase_extract(noun_phrases_indv, tag_trees_indv);

/*
				Winnow weapons_winnow = new Winnow("./predictors/predict_weapon.txt");
				Winnow individuals_winnow = new Winnow("./predictors/predict_indv.txt");
				Winnow organizations_winnow = new Winnow("./predictors/predict_org.txt");
				Winnow targets_winnow = new Winnow("./predictors/predict_tar.txt");
				Winnow victims_winnow = new Winnow("./predictors/predict_vic.txt");
*/
				ArrayList<String> weapons = new ArrayList<String>();
				ArrayList<String> individuals = new ArrayList<String>();
				ArrayList<String> organizations = new ArrayList<String>();
				ArrayList<String> targets = new ArrayList<String>();
				ArrayList<String> victims = new ArrayList<String>();

				ans_extract(noun_phrases_tar, targets, term_tar);
				ans_extract(noun_phrases_vic, victims, term_vic);
				ans_extract(noun_phrases_org, organizations, term_org);
				ans_extract(noun_phrases_weap, weapons, term_weap);
				ans_extract(noun_phrases_indv, individuals, term_indv);

				// OUTPUT THE STUFFS
				writer.println("ID:             " + ID);
				writer.println("INCIDENT:       " + ans_inc);

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

		System.out.println("Finished.");
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

	private static void ans_extract(ArrayList<ArrayList<Word>> noun_phrases, ArrayList<String> ans, HashMap<String, Double> term_prune){

		ArrayList<String> months = new ArrayList<String>(Arrays.asList("JAN", "FEB", "MARCH", "MAR", "APRIL", "MAY", "JUNE", "JUN", "JULY", "JUL", "AUG", "AUGUST", "SEP", "SEPT", "SEPTEMBER", "OCT", "OCTOBER", "NOV", "NOVEMBER", "DEC", "DECEMBER"));
		ArrayList<String> weekdays = new ArrayList<String>(Arrays.asList("MON", "MONDAY", "TUES", "TUE", "TUESDAY", "WED", "WEDNESDAY", "THUR", "THURS", "THURSDAY", "FRI", "FRIDAY", "SAT", "SATURDAY", "SUN", "SUNDAY"));

		for(ArrayList<Word> np : noun_phrases){
			String noun_phrase="";
			boolean at_least_one=false;
			for(Word w: np){
				if(term_prune.containsKey(w.word().toUpperCase())){
					if(term_prune.get(w.word().toUpperCase())>0.0){
						//carry on
						at_least_one=true;
					}
					else{
						//noun_phrase="";
						//break;
					}
				}
				else{
					//noun_phrase="";
					//break;
				}

				if(weekdays.contains(w.word().toUpperCase())){
					noun_phrase = "";
					break;
				}
				if(months.contains(w.word().toUpperCase())){
					noun_phrase = "";
					break;
				}

				if(w.word().equals("'s"))
					noun_phrase = noun_phrase.substring(0, noun_phrase.length() - 1) + "'S ";
				else
					noun_phrase+= w.word().toUpperCase() + " ";
			}
			if(at_least_one){

			}
			else{
				noun_phrase="";
			}

			if(noun_phrase.contains("-LSB-") || noun_phrase.contains("-RSB-"))
				continue;

			if(noun_phrase.contains("-LRB-") || noun_phrase.contains("-RRB-"))
				continue;

			if(noun_phrase.contains(","))
				continue;

			//data = feature_maker(np);
			if(!noun_phrase.equals("")){
				//if(weapons_winnow.predict(data) == 1)
				if(!ans.contains(noun_phrase)){
					ans.add(noun_phrase);
				}
			}
		}
	}

	private static void noun_phrase_extract( ArrayList<ArrayList<Word>> noun_phrases, ArrayList<Tree> tag_trees){

		ArrayList<String> ignore_words = new ArrayList<String>(Arrays.asList("END", "HE", "SHE", "ME", "YOU", "I", "IT", "THEY", "THEM", "THERE", "THAT", "THIS","AND", "THE", "OF", "A", "IN", "", "-"));
		ArrayList<String> first_words = new ArrayList<String>(Arrays.asList("DR", "SOME", "THE", "A", "AN", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "MONSIGNOR", "MSGR"));

		for(Tree t : tag_trees){
			for(Tree sub: t){
				if(sub!=null){
					if(sub.yieldWords().size()<=4){
						if(sub.label()!=null){
							if(sub.label().value()!=null){
								if(sub.label().value().equals("NP")){
									Tree fuuu=sub.parent(t);
									if(fuuu!=null){
										ArrayList<Word> add_words = sub.yieldWords();
										fuuu.removeChild(fuuu.objectIndexOf(sub));
										if(add_words.size() == 1 && ignore_words.contains(add_words.get(0).word().toUpperCase())){
										}
										else{
											if(!noun_phrases.contains(add_words)){
												String first_word = add_words.get(0).word().toUpperCase();
												if(first_words.contains(first_word))
													add_words.remove(0);

												try{
													int temp_int = Integer.parseInt(first_word);
													add_words.remove(0);}
												catch(Exception e){}
												noun_phrases.add(add_words);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}
}
