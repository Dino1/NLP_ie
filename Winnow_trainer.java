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

    Winnow predict_weapon=new Winnow(dict.size(), 2, 7);
    Winnow predict_indv=new Winnow(dict.size(), 2, 7);
    Winnow predict_org=new Winnow(dict.size(), 2, 7);
    Winnow predict_tar=new Winnow(dict.size(), 2, 7);
    Winnow predict_vic=new Winnow(dict.size(), 2, 7);


		Scanner input_scanner = null;
    Scanner ans_scanner = null;
		PrintWriter  writer = null;
		//try {input_scanner = new Scanner(new File(args[0]));}

		ArrayList<ArrayList<ArrayList <Word> > > articles=new ArrayList<ArrayList<ArrayList<Word > > >();
		ArrayList<ArrayList<String[]> > art_ans_weapon=new ArrayList<ArrayList<String[]> >();//2
		ArrayList<ArrayList<String[]> > art_ans_indv=new ArrayList<ArrayList<String[]> >();//3
		ArrayList<ArrayList<String[]> > art_ans_org=new ArrayList<ArrayList<String[]> >();//4
		ArrayList<ArrayList<String[]> > art_ans_tar=new ArrayList<ArrayList<String[]> >();//5
		ArrayList<ArrayList<String[]> > art_ans_vic=new ArrayList<ArrayList<String[]> >();//6
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
				System.out.println(ID);


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
				articles.add(noun_phrases);
				art_ans_weapon.add(ans_weapon);
				art_ans_indv.add(ans_indv);
				art_ans_org.add(ans_org);
				art_ans_tar.add(ans_tar);
				art_ans_vic.add(ans_vic);
				for(ArrayList<Word> np: noun_phrases){
					boolean matches=false;
					double data[]=feature_maker(np);
					for(String[] ans: ans_weapon){
						for(int count1=0; count1<ans.length; count1++){
							if((ans[count1]).equals("THE")||(ans[count1]).equals("OF")||(ans[count1]).equals("A")||(ans[count1]).equals("IN")||(ans[count1].trim().length()==0)||(ans[count1]).equals("-")||(ans[count1]).equals("")){
							}
							else{
								//System.out.println(ans[count1]+";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
								for(int count2=0; count2<np.size(); count2++){
									String temp=np.get(count2).word();
									if( ((temp.contains(ans[count1])) || ((ans[count1].contains(temp)))) && ( Math.abs(temp.length()-ans[count1].length())<=2) ){
										//System.out.println(temp);
										//System.out.println(ans[count1]);
										matches=true;
										break;
									}
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
						for(int count1=0; count1<ans.length; count1++){
							if((ans[count1]).equals("THE")||(ans[count1]).equals("OF")||(ans[count1]).equals("A")||(ans[count1]).equals("IN")||(ans[count1].trim().length()==0)||(ans[count1]).equals("-")||(ans[count1]).equals("")){
							}
							else{
								//System.out.println(ans[count1]+";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
								for(int count2=0; count2<np.size(); count2++){
									String temp=np.get(count2).word();
									if( ((temp.contains(ans[count1])) || ((ans[count1].contains(temp)))) && ( Math.abs(temp.length()-ans[count1].length())<=2) ){
										//System.out.println(temp);
										//System.out.println(ans[count1]);
										matches=true;
										break;
									}
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
						for(int count1=0; count1<ans.length; count1++){
							if((ans[count1]).equals("THE")||(ans[count1]).equals("OF")||(ans[count1]).equals("A")||(ans[count1]).equals("IN")||(ans[count1].trim().length()==0)||(ans[count1]).equals("-")||(ans[count1]).equals("")){
							}
							else{
								//System.out.println(ans[count1]+";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
								for(int count2=0; count2<np.size(); count2++){
									String temp=np.get(count2).word();
									if( ((temp.contains(ans[count1])) || ((ans[count1].contains(temp)))) && ( Math.abs(temp.length()-ans[count1].length())<=2) ){
										//System.out.println(temp);
										//System.out.println(ans[count1]);
										matches=true;
										break;
									}
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
						for(int count1=0; count1<ans.length; count1++){
							if((ans[count1]).equals("THE")||(ans[count1]).equals("OF")||(ans[count1]).equals("A")||(ans[count1]).equals("IN")||(ans[count1].trim().length()==0)||(ans[count1]).equals("-")||(ans[count1]).equals("")){
							}
							else{
								//System.out.println(ans[count1]+";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
								for(int count2=0; count2<np.size(); count2++){
									String temp=np.get(count2).word();
									if( ((temp.contains(ans[count1])) || ((ans[count1].contains(temp)))) && ( Math.abs(temp.length()-ans[count1].length())<=2) ){
										//System.out.println(temp);
										//System.out.println(ans[count1]);
										matches=true;
										break;
									}
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
						for(int count1=0; count1<ans.length; count1++){
							if((ans[count1]).equals("THE")||(ans[count1]).equals("OF")||(ans[count1]).equals("A")||(ans[count1]).equals("IN")||(ans[count1].trim().length()==0)||(ans[count1]).equals("-")||(ans[count1]).equals("")){
							}
							else{
								//System.out.println(ans[count1]+";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
								for(int count2=0; count2<np.size(); count2++){
									String temp=np.get(count2).word();
									if( ((temp.contains(ans[count1])) || ((ans[count1].contains(temp)))) && ( Math.abs(temp.length()-ans[count1].length())<=2) ){
										//System.out.println(temp);
										//System.out.println(ans[count1]);
										matches=true;
										break;
									}
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
				}
				/*
        for(ArrayList<Word> np: noun_phrases){

					for(Word w: np){
						System.out.print(w.word()+" ");
					}
					System.out.println();

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
				*/
			}
		}


		for(int count_outter=0; count_outter<5; count_outter++){
			for(int sub_count=0; sub_count<articles.size(); sub_count++){
				ArrayList<ArrayList<Word>> noun_phrases=articles.get(sub_count);
				ArrayList<String[]> ans_weapon=art_ans_weapon.get(sub_count);//2
				ArrayList<String[]> ans_indv=art_ans_indv.get(sub_count);//3
				ArrayList<String[]> ans_org=art_ans_org.get(sub_count);//4
				ArrayList<String[]> ans_tar=art_ans_tar.get(sub_count);//5
				ArrayList<String[]> ans_vic=art_ans_vic.get(sub_count);//6

				for(ArrayList<Word> np: noun_phrases){
					boolean matches=false;
					double data[]=feature_maker(np);
					for(String[] ans: ans_weapon){
						for(int count1=0; count1<ans.length; count1++){
							if((ans[count1]).equals("THE")||(ans[count1]).equals("OF")||(ans[count1]).equals("A")||(ans[count1]).equals("IN")||(ans[count1].trim().length()==0)||(ans[count1]).equals("-")||(ans[count1]).equals("")){
							}
							else{
								//System.out.println(ans[count1]+";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
								for(int count2=0; count2<np.size(); count2++){
									String temp=np.get(count2).word();
									if( ((temp.contains(ans[count1])) || ((ans[count1].contains(temp)))) && ( Math.abs(temp.length()-ans[count1].length())<=2) ){
										//System.out.println(temp);
										//System.out.println(ans[count1]);
										matches=true;
										break;
									}
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
						for(int count1=0; count1<ans.length; count1++){
							if((ans[count1]).equals("THE")||(ans[count1]).equals("OF")||(ans[count1]).equals("A")||(ans[count1]).equals("IN")||(ans[count1].trim().length()==0)||(ans[count1]).equals("-")||(ans[count1]).equals("")){
							}
							else{
								//System.out.println(ans[count1]+";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
								for(int count2=0; count2<np.size(); count2++){
									String temp=np.get(count2).word();
									if( ((temp.contains(ans[count1])) || ((ans[count1].contains(temp)))) && ( Math.abs(temp.length()-ans[count1].length())<=2) ){
										//System.out.println(temp);
										//System.out.println(ans[count1]);
										matches=true;
										break;
									}
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
						for(int count1=0; count1<ans.length; count1++){
							if((ans[count1]).equals("THE")||(ans[count1]).equals("OF")||(ans[count1]).equals("A")||(ans[count1]).equals("IN")||(ans[count1].trim().length()==0)||(ans[count1]).equals("-")||(ans[count1]).equals("")){
							}
							else{
								//System.out.println(ans[count1]+";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
								for(int count2=0; count2<np.size(); count2++){
									String temp=np.get(count2).word();
									if( ((temp.contains(ans[count1])) || ((ans[count1].contains(temp)))) && ( Math.abs(temp.length()-ans[count1].length())<=2) ){
										//System.out.println(temp);
										//System.out.println(ans[count1]);
										matches=true;
										break;
									}
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
						for(int count1=0; count1<ans.length; count1++){
							if((ans[count1]).equals("THE")||(ans[count1]).equals("OF")||(ans[count1]).equals("A")||(ans[count1]).equals("IN")||(ans[count1].trim().length()==0)||(ans[count1]).equals("-")||(ans[count1]).equals("")){
							}
							else{
								//System.out.println(ans[count1]+";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
								for(int count2=0; count2<np.size(); count2++){
									String temp=np.get(count2).word();
									if( ((temp.contains(ans[count1])) || ((ans[count1].contains(temp)))) && ( Math.abs(temp.length()-ans[count1].length())<=2) ){
										//System.out.println(temp);
										//System.out.println(ans[count1]);
										matches=true;
										break;
									}
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
						for(int count1=0; count1<ans.length; count1++){
							if((ans[count1]).equals("THE")||(ans[count1]).equals("OF")||(ans[count1]).equals("A")||(ans[count1]).equals("IN")||(ans[count1].trim().length()==0)||(ans[count1]).equals("-")||(ans[count1]).equals("")){
							}
							else{
								//System.out.println(ans[count1]+";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
								for(int count2=0; count2<np.size(); count2++){
									String temp=np.get(count2).word();
									if( ((temp.contains(ans[count1])) || ((ans[count1].contains(temp)))) && ( Math.abs(temp.length()-ans[count1].length())<=2) ){
										//System.out.println(temp);
										//System.out.println(ans[count1]);
										matches=true;
										break;
									}
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
