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
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Collection;
import java.util.Collections;

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

/**
 * CS 5340
 * Final Project
 *
 * @author Jacob Luke and Bernard Serbinowski
 *
 */
public class Infoextract_V3 {
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


	public static void main(String[] args) {

						//Winnow weapons_winnow = new Winnow("./predictors/predict_weapon.txt");
						//Winnow individuals_winnow = new Winnow("./predictors/predict_indv.txt");
						//Winnow organizations_winnow = new Winnow("./predictors/predict_org.txt");
						//Winnow targets_winnow = new Winnow("./predictors/predict_tar.txt");
						//Winnow victims_winnow = new Winnow("./predictors/predict_vic.txt");

						AbstractSequenceClassifier<CoreLabel> classifier = null;
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

			 classifier=CRFClassifier.getClassifier("./english.all.3class.distsim.crf.ser.gz");
		} catch (IOException e) {
			 e.printStackTrace();
			 return;
		} catch (ClassNotFoundException e) {
			 return;
		}
		List<Double> l = new ArrayList<Double>(prob_vic.values());
		Collections.sort(l);
		/*
		for(Double d: l){
			System.out.println(d);
		}
		*/
		for(String s: prob_vic.keySet()){
			if(prob_vic.get(s)>.09){
				System.out.println(s);
			}
		}
		double top_in=0;
		//double top_adj=temp.sort();




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
    TrueCaseAnnotator caser = new TrueCaseAnnotator("./truecasing.fast.caseless.qn.ser.gz", TrueCaseAnnotator.DEFAULT_MODEL_BIAS, "./MixDisambiguation.list" , false, false);
		//DependencyParser depend= DependencyParser.loadFromModelFile("english_SD.gz");


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
                Annotation article_with_case = new Annotation(the_article.toLowerCase());
                //caser.annotate(article_with_case);
				Reader reader = new StringReader(article_with_case.toString());
				DocumentPreprocessor dp = new DocumentPreprocessor(reader);
				ArrayList<Tree> tag_trees = new ArrayList<Tree>();
				ArrayList<ArrayList<Word>> noun_phrases=new ArrayList<ArrayList<Word>>();

				//List<List<HasWord>> best_sentences=new List<List<HasWord>>();
				//List<HasWord> best_sentence=null;
				double best_val=0;
				String rel_sentences="";
				for (List<HasWord> sentence : dp){
					double cur_best=0;
					HasWord temp_debug=null;
					double cur_count=0;
					double neg_mod=(.5)/((double)sentence.size());
					for (HasWord word: sentence){
						//System.out.println(word.word());
						if(prob_vic.containsKey(word.word().toUpperCase())){
							/*
							if(cur_best<prob_vic.get(word.word().toUpperCase())){
								cur_best=prob_vic.get(word.word().toUpperCase());
								temp_debug=word;
							}
							*/
							if(prob_vic.get(word.word().toUpperCase())>.015){
								cur_count=cur_count+prob_vic.get(word.word().toUpperCase())*10;
							}
							else{
								cur_count=cur_count-neg_mod;
							}
						}
					}
					/*
					if(best_val<cur_best){
						//System.out.println(cur_best);
						//System.out.println(temp_debug.word());
						best_val=cur_best;
						best_sentence=sentence;
					}
					*/
					if(cur_count>0){
						/*
						System.out.println(cur_count);
						for(HasWord word: sentence){
							System.out.print(word.word()+" ");
						}
						System.out.println();
						*/
						//best_sentences.add(sentence);
						for(HasWord word: sentence){
							rel_sentences=rel_sentences+" "+word.word();
						}
						tag_trees.add(parsnip.apply(tagger.tagSentence(sentence)));
					}
					//tag_trees.add(parsnip.apply(tagger.tagSentence(sentence)));
				}

	      List<List<CoreLabel>> out = classifier.classify(rel_sentences);
	      for (List<CoreLabel> sentence : out) {
	        for (CoreLabel word : sentence) {
	          System.out.print(word.word() + '/' + word.get(CoreAnnotations.AnswerAnnotation.class) + ' ');
	        }
	        System.out.println();
	      }
				/*
				GrammaticalStructure g=depend.predict(tagger.tagSentence(best_sentence));
				Collection<TypedDependency> typed=g.allTypedDependencies();
				for(TypedDependency t: typed){
					System.out.println(t.toString());
				}
				Tree victim_tree=(parsnip.apply(tagger.tagSentence(best_sentence)));
				*/
				ArrayList<String> ignore_words = new ArrayList<String>(Arrays.asList("THIS","AND", "THE", "OF", "A", "IN", "", "-"));

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
												if(add_words.size() == 1 && !ignore_words.contains(add_words.get(0).word().toUpperCase())){
												}
												else{
													if(!noun_phrases.contains(add_words)){
                                                        if(add_words.get(0).word().toUpperCase().equals("THE"))
                                                            add_words.remove(0);
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
						noun_phrase+=" "+w.word().toUpperCase();
					}
					if(!noun_phrase.equals("")){

						noun_phrase=noun_phrase.substring(1);
						/*
						if(weapons_winnow.predict(data) == 1)
							weapons.add(noun_phrase);
						if(individuals_winnow.predict(data) == 1)
							individuals.add(noun_phrase);
						if(organizations_winnow.predict(data) == 1)
							organizations.add(noun_phrase);
						if(targets_winnow.predict(data) == 1){
							targets.add(noun_phrase);
						}
						*/
						//if(victims_winnow.predict(data) == 1){
							//victims.add(noun_phrase);
						//}
					}
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

		System.out.println("Finished.");
	}

	private static double[]  feature_maker(ArrayList<Word> noun_phrase){
		int size_of=dict.size();
		double[] output = new double[size_of];
		for(Word w:noun_phrase){
			if(dict.containsKey(w.word().toUpperCase())){
				output[dict.get(w.word().toUpperCase())]=1;
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
