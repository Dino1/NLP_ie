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
public class Winnow_trainer {
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

    Winnow predict_weapon=new Winnow(dict.size(), 2, .1);
    Winnow predict_indv=new Winnow(dict.size(), 2, .1);
    Winnow predict_org=new Winnow(dict.size(), 2, .1);
    Winnow predict_tar=new Winnow(dict.size(), 2, .1);
    Winnow predict_vic=new Winnow(dict.size(), 2, .1);


		Scanner input_scanner = null;
    Scanner ans_scanner = null;
		PrintWriter  writer = null;
		//try {input_scanner = new Scanner(new File(args[0]));}
		try {
			//input_scanner = new Scanner(new File("input.txt"));
  		//ans_scanner = new Scanner(new File("output.txt"));
  		input_scanner = new Scanner(new File("DEV_ALL"));
      ans_scanner = new Scanner(new File("ANS_ALL"));
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
					/*
				for(String[] ans: ans_indv){
					for(String fuck: ans){
						System.out.print(fuck+" ");
					}
					System.out.println();
				}
				System.out.println("--------------------");
				System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
				*/
        for(ArrayList<Word> np: noun_phrases){
					/*
					for(Word w: np){
						System.out.print(w+" ");
					}
					System.out.println();
					*/
          boolean matches=false;
          double data[]=feature_maker(np);
          for(String[] ans: ans_weapon){
            if(ans.length==np.size()){
              for(int count=0; count<ans.length; count++){
                if(ans[count].equals( (np.get(count)).word() )){
                  matches=true;
                }
                else{
                  matches=false;
                  break;
                }
              }
              if(matches){
                break;
              }
            }
          }
          if(matches){
            predict_weapon.learn(data, 1);
          }
          else{
            predict_weapon.learn(data, -1);
          }
          matches=false;
          for(String[] ans: ans_indv){
            if(ans.length==np.size()){
              for(int count=0; count<ans.length; count++){
                if(ans[count].equals( (np.get(count)).word() )){
                  matches=true;
                }
                else{
                  matches=false;
                  break;
                }
              }
              if(matches){
                break;
              }
            }
          }
          if(matches){
            //System.out.println("fuck you bernie");
            predict_indv.learn(data, 1);
          }
          else{
            //System.out.println("wow you found me. good for you asshole");
            predict_indv.learn(data, -1);
          }
          matches=false;
          for(String[] ans: ans_org){
            if(ans.length==np.size()){
              for(int count=0; count<ans.length; count++){
                if(ans[count].equals( (np.get(count)).word() )){
                  matches=true;
                }
                else{
                  matches=false;
                  break;
                }
              }
              if(matches){
                break;
              }
            }
          }
          if(matches){
            predict_org.learn(data, 1);
          }
          else{
            predict_org.learn(data, -1);
          }
          matches=false;
          for(String[] ans: ans_tar){
            if(ans.length==np.size()){
              for(int count=0; count<ans.length; count++){
                if(ans[count].equals( (np.get(count)).word() )){
                  matches=true;
                }
                else{
                  matches=false;
                  break;
                }
              }
              if(matches){
                break;
              }
            }
          }
          if(matches){
            predict_tar.learn(data, 1);
          }
          else{
            predict_tar.learn(data, -1);
          }
          matches=false;
          for(String[] ans: ans_vic){
            if(ans.length==np.size()){
              for(int count=0; count<ans.length; count++){
                if(ans[count].equals( (np.get(count)).word() )){
                  matches=true;
                }
                else{
                  matches=false;
                  break;
                }
              }
              if(matches){
                break;
              }
            }
          }
          if(matches){
            predict_vic.learn(data, 1);
          }
          else{
            predict_vic.learn(data, -1);
          }
          matches=false;
          for(String[] ans: ans_tar){
            if(ans.length==np.size()){
              for(int count=0; count<ans.length; count++){
                if(ans[count].equals( (np.get(count)).word() )){
                  matches=true;
                }
                else{
                  matches=false;
                  break;
                }
              }
              if(matches){
                break;
              }
            }
          }
          if(matches){
            predict_tar.learn(data, 1);
          }
          else{
            predict_tar.learn(data, -1);
          }
        }

			}
		}
    predict_weapon.save_to("predict_weapon.txt");
    predict_indv.save_to("predict_indv.txt");
    predict_org.save_to("predict_org.txt");
    predict_vic.save_to("predict_vic.txt");
    predict_tar.save_to("predict_tar.txt");

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
    /*
    for(int i=0; i<size_of; i++){
      if(output[i]==0){
        output[i+size_of]=1;
      }
    }
    */
  }
}
