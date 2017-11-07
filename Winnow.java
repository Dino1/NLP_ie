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
 * @author  Bernard Serbinowski
 *
 */
public class Winnow {
  private double[] weights_;
  private int size_of_;
  private double margin_;
  private double l_r_;
  public Winnow(int size_of_data, double learning_rate, double margin){
    //initialize for training
    for(int count=0; count<size_of_data; ++count){
      weights_[count]=1;
    }
    size_of_=size_of_data;
    l_r_=learning_rate;
    margin_=margin;
  }
  public Winnow(String file_name){
    //load from this saved File
    try {
			Scanner input_scanner = new Scanner(new File(file_name));

		  String next_line = input_scanner.nextLine();
      size_of_=Integer.parseInt(nextLine);

      next_line = input_scanner.nextLine();
      margin_=Double.parseDouble(nextLine);

      next_line = input_scanner.nextLine();
      l_r_=Double.parseDouble(nextLine);

      weights_=[size_of_];
      int count=0;
      while(input_scanner.hasNextLine()){
        next_line = input_scanner.nextLine();
        weights_[count]=Double.parseDouble(nextLine);
        count++;
			}
		}
		catch (FileNotFoundException e) {e.printStackTrace();}

  }
  public void save_to(String file_name){
    try {
			PrintWriter  writer = new PrintWriter(file_name);
      writer.println(size_of_);
      writer.println(margin_);
      writer.println(size_of_);
      for(int count=0; count<size_of_; count++){
        writer.println(weights_[count]);
      }
      writer.close();
		}
		catch (FileNotFoundException e) {e.printStackTrace();}
  }
  public int predict(double[] data){
    double val=0;
    for(int ind=0; ind<size_of_; ind++){
      val+=(weights_[ind]-1/weights_[ind])*(data[ind]);
    }
    if(val<size_of_){
      return 0;//because of data set reasons.
    }
    return 1;
  }
  public int learn(double[] data, int label){
    double val=0;
    for(uint32_t ind=0; ind<size_of_; ind++){
      val+=(weights_[ind]-1/weights_[ind])*(data[ind]);
    }
    if((val<size_of_)&&label==1){
      //need to increas val which means doubling shit in w
      for(uint32_t count{0}; count<size_of_; ++count){
        if(data[count]!=0){
          weights_[count]=l_r_*weights_[count];
        }
      }
      return 1;
    }
    else if((val>=size_of_)&&label==-1){
      for(uint32_t count{0}; count<size_of_; ++count){
        if(data[count]!=0){
          weights_[count]=weights_[count]/l_r_;
        }
      }
      return 1;
    }
    else{
      return 0;//idk why i just don't wanna mess with other code. 3 lazy 5 me
    }
  }
}
