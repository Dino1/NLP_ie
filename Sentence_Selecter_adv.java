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

public class Sentence_Selecter_adv {
	private static HashMap<String, Integer> dict=null;

	private static HashMap<String, Freq_tuple> freq_weapon=new HashMap<>();
	private static HashMap<String, Freq_tuple> freq_indv=new HashMap<>();
	private static HashMap<String, Freq_tuple> freq_org=new HashMap<>();
	private static HashMap<String, Freq_tuple> freq_tar=new HashMap<>();
	private static HashMap<String, Freq_tuple> freq_vic=new HashMap<>();

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
		//try {input_scanner = new Scanner(new File(args[0]));}

/*
		ArrayList<ArrayList<ArrayList <Word> > > articles=new ArrayList<ArrayList<ArrayList<Word > > >();
		ArrayList<ArrayList<String[]> > art_ans_weapon=new ArrayList<ArrayList<String[]> >();//2
		ArrayList<ArrayList<String[]> > art_ans_indv=new ArrayList<ArrayList<String[]> >();//3
		ArrayList<ArrayList<String[]> > art_ans_org=new ArrayList<ArrayList<String[]> >();//4
		ArrayList<ArrayList<String[]> > art_ans_tar=new ArrayList<ArrayList<String[]> >();//5
		ArrayList<ArrayList<String[]> > art_ans_vic=new ArrayList<ArrayList<String[]> >();//6
		*/
		try {
			//input_scanner = new Scanner(new File("input.txt"));
  		//ans_scanner = new Scanner(new File("output.txt"));



			//input_scanner = new Scanner(new File("testset1-input.txt"));
      //ans_scanner = new Scanner(new File("testset1-anskeys.txt"));

			input_scanner = new Scanner(new File("DEV_ALL"));
      ans_scanner = new Scanner(new File("ANS_ALL"));

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

				ArrayList<String> ignore_tar=new ArrayList<String>(Arrays.asList("ENTERPRISES", "ATTENTION", "DIRECTORATE", "GROUPS", "INVESTIGATING", "RULING", "YESTERDAY", "DAWN", "NEAR", "SHOULD", "LEARNED", "YEAR", "COMMUNIQUE", "INTENTION", "TAKEN", "MURDERED", "LIMON", "PROPOSED", "LEFT", "STOP", "SEARCH", "'", "MIGHT", "HURLING", "VARGAS", "SHOTS", "DEPARTMENT", "WHERE", "AN", "1", "AS", "2", "3", "AT", "HOY", "4", "5", "7", "PERUVIAN", "8", "9", ":", "REQUESTED", "ELLACURIA", "PASSENGERS", "CLOCK", "SEP", "LEAVING", "SAME", "A", "BE", "TRYING", "SET", "STRIKES", "DAYS", "SMALL", "PRIEST", "BY", "PARTICIPATED", "COMMAND", "INVESTIGATION", "DID", "KILLED", "ATTRIBUTED", "JUL", "DENIED", "STATES", "JUN", "JURISDICTION", "SITUATION", "MARTI", "REFERRING", "NECESSARY", "GUARDING", "CONTINUE", "VEHICLES", "SUSPEND", "SECURITY", "STATEMENT", "IGNACIO", "DE", "SERVICES", "REPEATEDLY", "RELIGIOUS", "DO", "DR", "WISH", "DAYLIGHT", "SHE", "PRISONERS", "AREA", "COUNTRY", "WITNESSES", "EVACUATED", "VIOLENT", "ALLOW", "EXPLOSIVES", "EL", "LIGHT", "FOR", "DAMAGE", "PRESS", "GUERRILLA", "DEPUTY", "DOING", "PASSAGE", "ELECTRIC", "ONTO", "OAS", "AMBASSADOR", "OCCURRED", "SIX", "MARQUEZ", "STATE", "DEMANDED", "MOVEMENT", "NEIGHBORHOOD", "HUMANITARIAN", "SUFFERING", "ABOUT", "CHARGE", "ACCOMPANIED", "RODRIGUEZ", "WHITE", "POINTED", "OCTOBER", "WELL", "URBAN", "GO", "SHORTLY", "ACTIVITIES", "WITH", "AIRES", "RICA", "CARLOS", "YOUNG", "ACTION", "PROVINCE", "FACING", "HE", "CARACOL", "TRUCE", "OCT", "CANDIDATE", "BECAUSE", "HIMSELF", "GUILLERMO", "SEARCHING", "TOLD", "COLOMBIAN", "CARRIED", "VARIOUS", "IN", "DEMONSTRATORS", "IS", "IT", "FORCE", "MSGR", "ELECTIONS", "EVEN", "SERIOUSNESS", "MAN", "WENT", "MAR", "SAUL", "MAY", "SQUADS", "HAVE", "HAPPENS", "MONSIGNOR", "OPPOSITION", "ATTORNEY", "SPORTS", "THREW", "CONFERENCE", "ACTIONS", "SOUGHT", "CADENA", "KM", "SPECIFICALLY", "USE", "NOVEMBER", "FIRST", "DIALOGUE", "CRIMINALS", "PRIVATE", "COMMISSION", "PLANTED", "SHOOTING", "CITY", "LA", "DESTROYED", "ARMY", "CASUALTIES", "SINGLE", "CASTROITE", "DETAILS", "ALAN", "DEATH", "PROPOSAL", "WAKE", "EASTERN", "WARNED", "SECTORS", "REPORTS", "FUEL", "JANUARY", "WILLINGNESS", "WERE", "GASOLINE", "SOLDIERS", "TOOK", "READ", "RESIDENTS", "200", "OIL", "MAYOR", "ALLEGED", "MEN", "REAL", "HELICOPTER", "THREE", "COSTA", "NO", "MAJOR", "PERSONS", "LOCATED", "EXTRADITABLES", "FOLLOWING", "MEMBER", "REPORTER", "LIBERAL", "DUE", "OF", "INVESTIGATE", "PRESIDENTIAL", "COMMANDER", "TRANSFORMER", "ON", "ANTONIO", "APRIL", "REPORTED", "OR", "86TH", "BELIEVES", "FISHERMEN", "COLOMBIA", "REBEL", "TURNED", "ROMERO", "ATTACK", "SECOND", "THEIR", "GARCIA", "CIVIL", "MINISTER", "PEREIRA", "LEAST", "SUPREME", "FRONT", "TREATMENT", "BETWEEN", "CONDOLENCES", "COMMUNITY", "PROCESS", "CIVIC", "CARRYING", "LOADED", "MUNICIPAL", "SPANISH", "BOMBS", "EXPLOSIVE", "ACTS", "CALL", "NORBERTO", "CALI", "TEAR", "CARACAS", "ONE", "TELEVISION", "CEREZO", "SUFFERED", "GROUP", "U.S.", "BROUGHT", "BELONGED", "DOES", "SO", "PONCE", "SUCH", "BUT", "SALVADORAN", "REBELS", "...", "OTHER", "ENTERPRISE", "CAPTURED", "COMMUNIST", "TO", "CALLS", "VICE", "UNION", "HISTORY", "CANO", "AIRCRAFT", "THERE", "METROPOLITAN", "COMMANDOS", "FINALLY", "APPROXIMATELY", "GUARD", "PACKAGE", "GRENADE", "UP", "DURING", "COURTS", "US", "SALVADOR", "THESE", "WORKING", "RELATIVES", "GANGS", "SKETCHES", "MEANWHILE", "YEARS", "ROCKET", "LAST", "TOWN", "HOSPITAL", "IMPOSED", "MEASURES", "BRING", "INTERNATIONAL", "COURT", "SUSPECTED", "ACROSS", "CONTROL", "OFFICIALS", "COLOMBIANS", "BELONGING", "GENERAL", "WE", "NOTES", "LEAVE", "GUERRILLAS", "SHOW", "AREAS", "SHOT", "PERU", "LAUNCH", "NOTED", "APPROACH", "ECOPETROL", "PAID", "TIME", "ANOTHER", "INTERPRETED", "HOURS", "DUTY", "PRESIDENT", "PEOPLE", "INSURGENT", "MINUTES", "SECTION", "ECONOMY", "INSIDE", "SANTANDER", "DIPLOMATIC", "APPROVAL", "NICARAGUAN", "EXPLOSION", "VICTIMS", "CAUSED", "PLAN", "WOUNDED", "INCIDENTS", "TEGUCIGALPA", "WHEN", "WALLS", "REPUBLIC", "PERSON", "BARRICADES", "CENTRAL", "DOMESTIC", "OUR", "OUT", "CASE", "COMPANY", "RESIDENTIAL", "OSCAR", "GIVE", "WOMEN", "FIRED", "CARRY", "PUBLIC", "SECRET", "ACCUSED", "POLICEMEN", "STAGED", "BEGIN", "EQUIPMENT", "ORDER", "ADDED", "LIBERATION", "BEING", "MANUEL", "SEVEN", "DECIDED", "CONDEMNED", "BOMBING", "PHYSICAL", "SPOKESMEN", "PRELIMINARY", "BROTHER", "PORTH", "MORE", "SEIZED", "COULD", "BISHOP", "MORAL", "LIBERTY", "QUITO", "KILL", "ACAN-EFE", "NERVOUS", "USULUTAN", "CLANDESTINE", "WOMAN", "SERIOUS", "AUXILIARY", "MEDIA", "USED", "SERVICE", "INCLUDING", "PREPARATION", "UNITS", "BOTH", "DIFFERENT", "MOST", "RAID", "DEMOCRATIC", "ACCEPT", "MAINTAIN", "ARTURO", "DIED", "EFE", "LINARES", "POLICEMAN", "MINOR", "ARIAS", "TRAVELING", "CHURCH", "BUILDING", "3,000", "PART", "ALSO", "SUBSTANTIAL", "RESULTED", "LIEUTENANTS", "OFFICIAL", "SERIES", "TODAY", "CHAVEZ", "STRUCTURE", "PEDRO", "ADDS", "STUDENTS", "CROSS", "DEVELOPMENT", "TARGETS", "RESULT", "VENCEREMOS", "ACCORDING", "DECEMBER", "SIMPLY", "UNDETERMINED", "POLICE", "CHRISTIAN", "HELICOPTERS", "AMERICA", "VEHICLE", "COUNTRIES", "UNIFORM", "CONTINUING", "TRAFFICKING", "GMT", "SABOTAGE", "BEEN", "PAST", "MURDER", "NATIONS", "EXPRESSED", "DESTROY", "FAMILY", "THE", "LUIS", "BROKE", "DISTRICT", "DAUGHTER", "BEGAN", "WEARING", "UNITED", "LABOR", "JOINT", "BARCO", "ARMED", "AUTHORITIES", "DEMOCRACY", "OFFENSIVE", "VINICIO", "PLACE", "GARRISONS", "CHILDREN", "RED", "GONZALEZ", "DEAD", "GOVERNMENT", "SYSTEM", "RECORDING", "EMBASSY", "ADD", "DOWN", "ELN", "ITS", "LEADER", "CONDEMNABLE", "NORTH", "MINISTRY", "TROOPS", "RESPONSIBLE", "ENERGY", "INFORMATION", "EARLY", "FMLN", "OFFICIALLY", "BENITO", "MEDICAL", "TOWARD", "UNILATERAL", "GUARANTEE", "GUATEMALA", "END", "INCLUDED", "SPILL", "CAPTAIN", "DEFENSE", "ECONOMIC", "CONDEMNING", "SANTIAGO", "AFP", "ROUNDS", "JUST", "PDC", "STUDENT", "SOME", "SOVIET", "SCENE", "''", "EXCLUSIVE", "TERRORISTS", "IDENTIFIED", "AGO", "MEETING", "JESUIT", "OVER", "REPRESENTATIVES", "500", "LOPEZ", "CRISTIANI", "ADVISED", "FOUR", "TEXT", "RANKING", "INTERIOR", "CONFIRMED", "WHICH", "DISTORT", "FORCES", "LEFTIST", "TRUJILLO", "WITHDREW", "VERY", "RECTOR", "MOTHERS", "LOSSES", "NATIONAL", "ASSASSINATION", "WORKERS", "AIR", "STILL", "JARAMILLO", "HOWEVER", "MADE", "ANNOUNCED", "ORGANIZATION", "POSSIBILITY", "METERS", "ABANDONED", "REVOLUTIONARY", "WINDOWS", "RIGHT", "POSED", "ANONYMOUS", "MARTIN", "CONTROLLED", "HONDURAN", "FARABUNDO", "HONDURAS", "CALLED", "SUSPENSION", "EXTENSIVE", "WHOLE", "LAS", "THAT", "ALL", "NEW", "ATTACKS", "RECENT", "HIGH", "LAW", "TERRORIST", "ALIAS", "ALONG", "NAMELY", "HOTEL", "PUBLISHED", "RAMIREZ", "ORGANIZATIONS", "TALKS", "MAIN", "ELITE", "LEADERS", "BROAD", "JUSTICE", "THROUGH", "AND", "PERIOD", "DANILO", "GUNSHIPS", "ROUND", "BLACKOUT", "ANY", "INVESTIGATIONS", "REFUSED", "SOURCES", "YSKL", "STARTED", "ALFREDO", "MATTER", "WOUNDING", "NUNS", "CURRENTLY", "DOWNTOWN", "100", "ADMINISTRATIVE", "PRESUMED", "PROPAGANDA", "JAN", "AFTERNOON", "FREEDOM", "SCHOOL", "APR", "MENTIONED", "OWNED", "COUNTERPART", "GUERRERO", "AFTER", "CLOSE", "COPREFA", "EXCERPTS", "THEY", "CENTER", "MONTHS", "INDIVIDUALS", "STREETS", "FIRE", "INCLUDE", "EMISORAS", "10", "REJECTED", "11", "12", "13", "INJURIES", "14", "16", "ATTACKED", "18", "19", "TWO", "ARE", "BOGOTA", "CRISIS", "CONDITION", "MIGUEL", "THEM", "20", "PUERTO", "21", "MOMENTS", "PARTY", "22", "23", "REAFFIRMED", "24", "25", "REPEAT", "27", "DECREED", "FACT", "BUENOS", "SUMMIT", "30", "31", "FELL", "LONG", "CIVILIANS", "HAD", "UNDER", "RUN", "FIFTH", "PARTIES", "PREVENT", "CONTINUED", "EXPLOSIONS", "JOSE", "PRESENCE", "STAFF", "HAS", "MANY", "CONTINUES", "WANTED", "DESPITE", "DISRUPT", "INDISTINCT", "150", "FLEEING", "FIVE", "AUG", "DELEGATION", "SEVERAL", "SANTA", "BROKEN", "52", "NUMBER", "NETWORK", "ASIDE", "CHIEFS", "RUNNING", "DECREE", "CHILEAN", "SOUTHERN", "NOT", "NOV", "PLANE", "SUSPENDED", "HOPEFUL", "NOW", "PIZARRO", "THIS", "DYNAMITE", "PERTINENT", "UNIVERSITY", "HAVING", "UNOFFICIAL", "PLANS", "WAS", "CHARGED", "PEACE", "SPEECH", "ADOPTED", "FOREIGN", "CAMPUS", "LEGAL", "DIRECTOR", "SARMIENTO", "ISRAELI", "HOMILY", "REPORT", "WRITING", "AGAINST", "RAFAEL", "VIRGILIO", "CRIMINAL", "CAPITAL", "89", "ASKED", "AIRPORT", "ROAD", "INCIDENT", "INDICATED", "INTELLIGENCE", "MORNING", "THREATENED", "HELD", "CLOSELY", "90", "CLASHES", "MACHINEGUNNED", "FUNERAL", "FORTUNATELY", "TYPE", "GAVIRIA", "TELEPHONE", "WORD", "GALLONS", "ASSAILANTS", "ARRESTED", "INTOLERANCE", "LEVEL", "THOSE", "CHILE", "MILITARY", "DIARIO", "WITHOUT", "WIFE", "WORK", "ELECTRICITY", "POSTS", "OPENED", "COLONEL", "FEDERATION", "GONZALO", "PERSONAL", "POLITICAL", "LARGE", "SITE", "FEB", "KNOWN", "DARK", "MEANING", "UCA", "HIS", "ADDITION", "DAS", "RADIO", "FEW", "DEVICES", "DAY", "GOVERNMENTS", "DRUG", "FORMER", "STICKS", "ARNULFO", "ONLY", "FROM", "DEATHS", "RECEIVED", "SANDINIST", "NIGHT", "MAZA", "SECRETARY", "WORLD", "POLE", "WHO", "PANAMANIAN", "SANDOVAL", "MEMBERS", "SERIOUSLY", "SLIGHTLY", "SINCE", "FIGHTING", "INRAVISION", "CASTRO", "GOES", "INJURED", "STEPS", "LINKED", "SAN", "JOURNALISTS", "DELIVERED", "PANAMA", "MISSING", "SAID", "HERE", "STOPPED", "TOMORROW", "BURNED", "ISSUED", "DEC", "MISSION", "UNIDENTIFIED", "MEXICO", "AMERICAN", "BEFORE", "LIMA", "THROUGHOUT", "ARTICLE", "CESAR", "CHIEF", "FRUIT", "WILL", "WHILE", "CIVILIAN", "YOU", "``", "-LSB-", "'S", "--", ",", ".", "-RRB-", ";", "-LRB-", "-RSB-"));

				ArrayList<String> ignore_org=new ArrayList<String>(Arrays.asList("-", "-LSB-", "-RSB-", "-RRB-", "-LRB-", "", ",", ";", ".", "'S", "--", "``", "ATTENTION", "PARISH", "GROUPS", "RULING", "TERRITORY", "YESTERDAY", "DAWN", "NEAR", "SHOULD", "THING", "ARREST", "LEARNED", "GENOCIDE", "THINK", "FARM", "COMMUNIQUE", "INTENTION", "ORTEGA", "TAKEN", "THOROUGHLY", "MURDERED", "LIMON", "PROPOSED", "LEFT", "STOP", "NEVERTHELESS", "INFLICTED", "'", "MIGHT", "VARGAS", "DEPARTMENT", "RELEASE", "WHERE", "EMILIO", "AM", "AN", "HOW", "1", "AS", "SEE", "2", "3", "AT", "4", "THUS", "6", "7", "PERUVIAN", "8", "9", ":", "REQUESTED", "PROMINENT", "ELLACURIA", "PASSENGERS", "CLOCK", "STRESSED", "UNDERSTAND", "?", "SAME", "DETERMINED", "A", "COVER", "BE", "TRYING", "SET", "DAYS", "I", "HAND", "MESSAGE", "SMALL", "INSISTED", "BASED", "BATTALION", "PERPETRATED", "PRIEST", "BY", "PARTICIPATED", "SUPERIOR", "COMMAND", "INVESTIGATION", "INSTEAD", "DID", "KILLED", "ATTRIBUTED", "JUL", "DENIED", "STATES", "JUN", "REPRESSIVE", "JURISDICTION", "SITUATION", "MARTI", "GREGORIO", "NECESSARY", "CONTINUE", "NATURE", "VEHICLES", "SUSPEND", "RELATIONS", "CHANGES", "OFFICE", "SECURITY", "D'AUBUISSON", "COLINDRES", "STATEMENT", "IGNACIO", "DE", "ACTIVISTS", "REPAIRED", "DO", "DR", "WISH", "DAYLIGHT", "MAURICIO", "SHE", "AREA", "COUNTRY", "REPRESSION", "WITNESSES", "EVACUATED", "GOOD", "PLACES", "VIOLENT", "ALLOW", "ASSASSINATIONS", "EXPLOSIVES", "HUMBERTO", "EL", "SURPRISED", "FOR", "NACIONAL", "PRESS", "GUERRILLA", "DEPUTY", "USING", "FOLLOWED", "DOING", "LIVES", "PASSAGE", "BRAZILIAN", "LIST", "ELECTRIC", "LACK", "SIT", "OAS", "PROPOSE", "AMBASSADOR", "OCCURRED", "SIX", "MARQUEZ", "STATE", "WITHIN", "REPLACED", "PROGRESS", "MOVEMENT", "DETAINED", "OPINION", "ABOUT", "CHARGE", "RODRIGUEZ", "WHITE", "OCTOBER", "WELL", "GO", "SHORTLY", "ACTIVITIES", "PLACED", "WITH", "SHORT", "ALREADY", "VIOLENCE", "ROOF", "1,000", "RICA", "STATEMENTS", "CARLOS", "ACTION", "AGAIN", "AGENTS", "HE", "CARACOL", "ACTIVITY", "STRONG", "TREACHEROUS", "OCT", "SUPPORTS", "CANDIDATE", "BECAUSE", "HIMSELF", "GUILLERMO", "CARRIES", "SEARCHING", "TOLD", "COLOMBIAN", "CARRIED", "IF", "FIELDS", "VARIOUS", "AMONG", "DEBATES", "SHIPS", "ESTRADA", "IN", "IS", "IT", "FORCE", "DPA", "MSGR", "EVEN", "MAN", "THROWN", "AUGUSTO", "CONDEMN", "MAR", "TERMED", "MAY", "UNIFORMS", "HAVE", "BLOODY", "BECOME", "OFF", "OPPOSITION", "ATTORNEY", "SPORTS", "ACTIONS", "ASKING", "SOUGHT", "CADENA", "OUTSIDE", "KG", "VIOLATIONS", "ARENA", "SWORN", "KM", "GACHA", "NOVEMBER", "FIRST", "DIALOGUE", "CASTILLO", "ROSA", "SIDES", "COMMISSION", "SHOOTING", "MEANS", "SON", "CITY", "LA", "SOCIAL", "REBELLION", "DESTROYED", "TREATED", "PERMANENT", "NORMAL", "CREW", "LOCATIONS", "ARMY", "CASUALTIES", "SINGLE", "THIRD", "DEATH", "EVENT", "RESPECT", "WILLING", "CONSULTED", "EASTERN", "SECTORS", "REPORTS", "EXTENT", "FUEL", "CAUCA", "REASON", "PYLONS", "UPON", "ESPECIALLY", "JANUARY", "MR", "IMPORTANT", "APPOINTED", "WERE", "DISCUSS", "SEPTEMBER", "AGREEMENT", "MY", "SOLDIERS", "TOOK", "READ", "REMAIN", "OIL", "MAYOR", "BEHIND", "FILED", "ALLEGED", "MEN", "REASONS", "ELECTION", "SPEAKING", "HELICOPTER", "ANASTASIO", "OCHOA", "THREE", "NEIGHBORHOODS", "EXISTENCE", "COSTA", "NO", "EUROPEAN", "MAJOR", "ACTIVE", "INTERRUPTING", "PERSONS", "EXTRADITABLES", "CITIES", "ENRIQUE", "FOLLOWING", "SAYS", "MEMBER", "REPORTER", "LIBERAL", "DUE", "OF", "VENEZUELA", "INVESTIGATE", "CHANGE", "PRESIDENTIAL", "STRIKE", "COMMANDER", "FIREARMS", "CONFIRM", "GLORIA", "ON", "ANTONIO", "NUMEROUS", "APRIL", "REPORTED", "MOMENT", "OR", "RIGHTIST", "BELIEVES", "AFFECT", "ISABEL", "COLOMBIA", "REBEL", "VISIT", "BUSH", "TURNED", "ROMERO", "MANAGUA", "ATTACK", "SECOND", "THEIR", "MINISTER", "GOVERNOR", "OBSERVERS", "LEAST", "FRONT", "BETWEEN", "RIFLE", "ENSURE", "CONSIDERED", "POSITION", "COMMUNITY", "PROCESS", "CARRYING", "NOTHING", "ATTENDING", "EACH", "PROMOTING", "MUST", "BRAZIL", "SPANISH", "BOMBS", "MIR", "WANT", "EXPLOSIVE", "HURTS", "COUNTER", "ACTS", "CALL", "EMERGENCY", "NORBERTO", "CALI", "HIGHWAYS", "CARACAS", "ONE", "COMMUNICATIONS", "ADVENTURE", "TELEVISION", "CEREZO", "SUFFERED", "GROUP", "U.S.", "BROUGHT", "EDGAR", "GALAN", "DOES", "HECTOR", "DESTROYING", "WOULD", "SO", "PONCE", "ALTHOUGH", "AROUND", "SUCH", "BUT", "GREAT", "SALVADORAN", "YIELD", "REBELS", "FACILITIES", "ARRESTS", "SOYAPANGO", "EVERYTHING", "COMMITTED", "RESPONSIBILITY", "ALLIANCE", "...", "OTHER", "RURAL", "CAPTURED", "PATROL", "TO", "CALLS", "VICE", "UNION", "HISTORY", "HOSTAGE", "CANO", "AIRCRAFT", "EUGENIO", "THERE", "ALERT", "BEGINNING", "TECHNICAL", "VIEW", "GRENADE", "HUGO", "UN", "JUAN", "UP", "DURING", "COURTS", "US", "CAMP", "PARTICIPATION", "CLASH", "SALVADOR", "THESE", "RELATIVES", "TRAFFICKERS", "MEANWHILE", "YEARS", "PRIESTS", "POSSIBLE", "LAST", "TOWN", "YEARN", "IMPOSED", "MEASURES", "SOMOZA", "BRING", "WHETHER", "DEMOCRATIZATION", "BOMB", "INTERNATIONAL", "COURT", "ACROSS", "ENTERED", "CONTROL", "OFFICIALS", "POSITIVE", "THOUGH", "GENERAL", "HIGHER", "JUDGE", "WELL-KNOWN", "WE", "COURSE", "PROTECT", "WAVE", "NOTES", "SURROUNDING", "SIGNED", "NEWSMEN", "SALVADORANS", "LEAVE", "GUERRILLAS", "PIPELINE", "SPOKE", "AREAS", "SHOT", "PERU", "LAUNCH", "PROVIDE", "CASANOVA", "BEHAVIOR", "RISK", "SOLUTION", "TIME", "ANOTHER", "WHAT", "FIRING", "MONDAY", "STRUGGLE", "HOURS", "DUTY", "PRESIDENT", "GENOCIDAL", "PEOPLE", "MINUTES", "MEDELLIN", "SECTION", "POPULATION", "MOVEMENTS", "DIPLOMATIC", "CRIME", "PROBLEMS", "APPROVAL", "NICARAGUAN", "EXPLOSION", "VICTIMS", "CAUSED", "PLAN", "RENE", "DICTATORSHIP", "WOUNDED", "ENDING", "INCIDENTS", "TEGUCIGALPA", "WHEN", "FAILED", "BREAK", "LOCAL", "DOCUMENT", "EXCHANGE", "REPUBLIC", "ACTED", "COINCIDES", "PERSON", "BARRICADES", "CENTRAL", "1990", "MR.", "LITTLE", "DOMESTIC", "OUR", "EVIDENCE", "OUT", "CASE", "OSCAR", "GIVE", "WOMEN", "GEN", "FIRED", "AIMED", "LAWS", "ACCUSING", "CARRY", "GET", "PUBLIC", "BRIGADE", "ADVANCE", "1989", "ACCUSED", "REMAINED", "NOTICE", "PRESENT", "BEGIN", "MRS", "ORDER", "ADDED", "BEING", "ROBERTO", "JOURNALIST", "DIAZ", "CATEGORICALLY", "MANUEL", "SENATOR", "DECIDED", "CONDEMNED", "BOMBING", "PRELIMINARY", "BROTHER", "OFFICER", "PORTH", "STAYING", "MORE", "SEIZED", "COULD", "INDEED", "LIBERTY", "ACAN-EFE", "ANNOUNCE", "SAFETY", "WASHINGTON", "ZONE", "MEASURE", "MARXIST", "ECUADORAN", "PROFESSIONALLY", "CLANDESTINE", "SERIOUS", "MULTIPLE", "ATTITUDE", "ALVARO", "THREATENING", "TELL", "MEDIA", "USED", "SERVICE", "INCLUDING", "UNITS", "BOTH", "ROCKETS", "REGIONAL", "DONE", "EEC", "DIFFERENT", "MOST", "LORDS", "TELECOMMUNICATIONS", "URGES", "TRIED", "RAID", "EXCEPT", "DEMOCRATIC", "ITSELF", "CAN", "ACCEPT", "LOOTING", "CAR", "FRANCISCO", "MAINTAIN", "MURDERS", "DIED", "EFE", "POLICEMAN", "SOCIETY", "RIVERA", "ARIAS", "TRAVELING", "CHURCH", "PART", "ALSO", "INVOLVED", "RESULTS", "MEAN", "LIEUTENANTS", "OFFICIAL", "TIMES", "PRACTICE", "TODAY", "CHAVEZ", "STRUCTURE", "UNTIL", "STUDENTS", "REST", "KILLING", "REVEALED", "CROSS", "EDUARDO", "DEVELOPMENT", "TARGETS", "SPOKESMAN", "RESULT", "VENCEREMOS", "ACCORDING", "HEARD", "MOREOVER", "OPERATING", "CLAIMED", "CANAL", "POLICE", "CHRISTIAN", "HELICOPTERS", "AMERICA", "VEHICLE", "COUNTRIES", "UNIFORM", "CONTINUING", "EFFECT", "REVEAL", "CUBA", "VELEZ", "GMT", "BOMBINGS", "SABOTAGE", "TOGETHER", "BEEN", "EMPLOYEES", "SOMETHING", "PAST", "JULY", "HOSTAGES", "MURDER", "NATIONS", "EXPRESSED", "AGREEMENTS", "DESTROY", "WHOM", "REITERATE", "FAMILY", "THE", "LUIS", "DAUGHTER", "BEGAN", "WEARING", "FREDDY", "SOUND", "UNITED", "CONGRESS", "LABOR", "JOINT", "BARCO", "APPARENTLY", "JUNE", "ARMED", "MEET", "AUTHORITIES", "RULED", "DEMOCRACY", "OFFENSIVE", "POWER", "SEEKS", "HURTADO", "NORTHERN", "VINICIO", "PLACE", "SUFFICIENT", "RED", "ANTIOQUIA", "ANYTHING", "ACT", "EXTREME", "ABROAD", "OPERATION", "SETTLEMENT", "ADMITTED", "DEAD", "GOVERNMENT", "SYSTEM", "RECORDING", "EMBASSY", "ADD", "DOWN", "PROPERTIES", "INFORMED", "ITS", "TAKING", "TALK", "HAVANA", "TYPES", "LEADER", "ISSUE", "MINISTRY", "TROOPS", "CRITICAL", "TAKE", "RESPONSIBLE", "STATION", "NATIONALIST", "INFORMATION", "FMLN", "OFFICIALLY", "WANTS", "SQUAD", "CURRENT", "GUARANTEE", "GUATEMALA", "END", "INCLUDED", "SPILL", "DEFENSE", "MONEY", "CANADA", "ECONOMIC", "CONDEMNING", "SANTIAGO", "INDEPENDENT", "AFP", "DEPARTMENTS", "JUST", "PDC", "PRESSURE", "SOME", "PEASANTS", "ACCUSATIONS", "CONCERNING", "''", "BRANCH", "VALLE", "TERRORISTS", "INSTITUTION", "ACCIDENT", "IDENTIFIED", "AGO", "MEETING", "ILLEGAL", "JESUIT", "OVER", "OTHERS", "RELEASED", "REPRESENTATIVES", "OFFICERS", "LOPEZ", "REGARDLESS", "CRISTIANI", "KIDNAPPING", "HOME", "PROTEST", "CALLAO", "ASKS", "FOUR", "TEXT", "ATTEMPTING", "ASSURED", "REACTED", "HUMAN", "IMAGE", "CONFIRMED", "WHICH", "PRESIDENTS", "CUNDINAMARCA", "GATHER", "INABILITY", "FORCES", "AID", "DIPLOMAT", "SOON", "VERY", "RECTOR", "SPAIN", "MINORITY", "NATIONAL", "ASSASSINATION", "WORKERS", "AIR", "FORCED", "GUILTY", "EITHER", "STILL", "JARAMILLO", "BORDER", "TOP", "HOWEVER", "MADE", "ANNOUNCED", "SANDINO", "SUBVERSIVE", "FRIDAY", "SAYING", "PASTOR", "ELECTORAL", "ORGANIZATION", "POSSIBILITY", "EFFORT", "OMITTED", "REVOLUTIONARY", "SITES", "STATING", "RIGHT", "FACTORY", "INTERVENTION", "ELENA", "MARTIN", "CONTROLLED", "HONDURAN", "EFFORTS", "FARABUNDO", "LIEUTENANT", "ORGANIZED", "CALLED", "SUSPENSION", "EPISCOPAL", "INTERVIEW", "BLOCKS", "EXTENSIVE", "WHOLE", "CONDEMNS", "THAT", "ALL", "NEW", "ATTACKS", "RECENT", "PUNISH", "HIGH", "LAW", "FEEL", "THAN", "TERRORIST", "ALONG", "NAMELY", "HOTEL", "HAPPENED", "ORGANIZATIONS", "JUDICIAL", "ORDERS", "TALKS", "MAIN", "MINUTE", "TRY", "COMMANDERS", "ELITE", "TERRORISM", "ARCHBISHOP", "LEADERS", "ENTIRE", "OFFERED", "SAMAYOA", "CLEARLY", "DESCRIBED", "VOLCANO", "PROOF", "BROAD", "JUSTICE", "MARTINEZ", "POPULATED", "BECAME", "THROUGH", "AND", "SORT", "AUGUST", "AGREED", "RIGHTS", "UNLEASHED", "KIDNAPPED", "GUNSHIPS", "ROUND", "ANY", "INVESTIGATIONS", "MAKE", "SOURCES", "HERNANDEZ", "STORES", "STARTED", "BARONS", "BELIEVE", "ALFREDO", "MATTER", "ASSISTANCE", "WOUNDING", "FAVOR", "IMPLEMENTATION", "LED", "DISCLOSED", "CURRENTLY", "COOPERATION", "REACH", "100", "SOTO", "JAN", "ATTACKING", "AFTERNOON", "BLAMED", "BEST", "SCHOOL", "WEAPONS", "MONTH", "APR", "MENTIONED", "OWNED", "COUNTERPART", "AFTER", "RAIDED", "COPREFA", "ERNESTO", "HOUSES", "THEY", "CENTER", "MONTHS", "INDIVIDUALS", "STREETS", "FIRE", "INTERNAL", "SABOTAGED", "INCLUDE", "EMISORAS", "10", "REJECTED", "11", "CALMLY", "12", "13", "BANK", "14", "CUT", "15", "16", "ATTACKED", "17", "18", "19", "TWO", "ANNOUNCEMENT", "REPUBLICAN", "PALACE", "ARE", "BOGOTA", "CONDITION", "THEN", "MIGUEL", "THEM", "CORPS", "OBTAIN", "20", "PUERTO", "21", "PARTY", "INTO", "24", "25", "26", "27", "PARTS", "OFFER", "FACT", "PROMPTED", "VOICED", "MURDERING", "FISHING", "SUMMIT", "30", "SERVE", "SIMILAR", "DANIEL", "SEEN", "31", "SEEK", "LONG", "WORDS", "DIRECTLY", "CIVILIANS", "HAD", "UNDER", "STREET", "PREVENT", "OPEN", "CONTINUED", "JOSE", "PRESENCE", "SUBMIT", "STAFF", "MARCH", "HAS", "MANY", "40", "FACE", "STAY", "CONTINUES", "WANTED", "RECEPTION", "DISRUPT", "INDISTINCT", "PERUVIANS", "HOPES", "MARIA", "IMMEDIATE", "FIVE", "AUG", "ORDERED", "DELEGATION", "FAMILIES", "MID-SEPTEMBER", "SEVERAL", "SANTA", "52", "53", "FENASTRAS", "NUMBER", "NETWORK", "GUERILLAS", "ASIDE", "CHIEFS", "ONCE", "PROTECTION", "TUESDAY", "KNOW", "LATIN", "FERNANDEZ", "FASCIST", "NEARLY", "THEREFORE", "NOT", "RANSOM", "NOV", "PLANE", "SUSPENDED", "HOPEFUL", "NOW", "PIZARRO", "THIS", "DYNAMITE", "UNIVERSITY", "HAVING", "UNOFFICIAL", "PLANS", "HONESTLY", "OPERATIONS", "CHARGES", "WAS", "CHARGED", "WAR", "PEACE", "SPEECH", "WAY", "BASE", "ELEMENTS", "RETURN", "ARTILLERY", "KIDNAPPINGS", "EXECUTIVE", "SEIS", "DIRECTOR", "CITIZEN", "LIFE", "GENERALIZED", "ONES", "STEP", "REPORT", "TRAFFIC", "AGAINST", "RAFAEL", "LAUNCHING", "HER", "VIRGILIO", "FAR", "CRIMINAL", "CAPITAL", "89", "ASKED", "AIRPORT", "INCIDENT", "CEASE-FIRE", "LOST", "EFFECTIVE", "STAND", "CONFIDENT", "THOUGHT", "INTELLIGENCE", "CRUDE", "MORNING", "INDISCRIMINATELY", "HELD", "NICARAGUA", "AMOUNT", "90", "CLASHES", "COME", "FORTUNATELY", "INDICATES", "GAVIRIA", "TELEPHONE", "WORD", "REJECTS", "MARKER", "ARRESTED", "INTOLERANCE", "LEVEL", "EXTRADITION", "THOSE", "MILITARY", "BUSTILLO", "WITHOUT", "WORK", "GOODWILL", "JAIME", "POSTS", "SO-CALLED", "COLONEL", "PARTICULARLY", "ARRIVED", "BODYGUARDS", "FEDERATION", "GONZALO", "POLITICAL", "LARGE", "FALL", "CONVINCED", "RECENTLY", "BOLIVIAN", "ENOUGH", "COWARDLY", "HELP", "FEB", "BRIEFING", "KNOWN", "PEACEFUL", "DARK", "GUEVARA", "RESPECTIVELY", "MEANING", "FAILURE", "HIM", "UCA", "HIS", "AMBULANCES", "ADDITION", "OCCUPIED", "RATHER", "RADIO", "FEW", "DEVICES", "DAY", "MEXICAN", "DRUG", "DECISION", "FORMER", "CAUSE", "STICKS", "ONLY", "FROM", "STRAFED", "SPECIAL", "CARMEN", "JESUITS", "RECEIVED", "SUPPORT", "POSITIONS", "DENSELY", "SANDINIST", "MAZA", "SECRETARY", "CANDIDATES", "ESCOBAR", "WORLD", "WHO", "SANDOVAL", "MEMBERS", "SUNDAY", "SINCE", "FIGHTING", "VIOLATION", "INRAVISION", "DATE", "CASTRO", "LIKE", "ZAMORA", "GOES", "INJURED", "WIN", "SENT", "LINKED", "SAN", "CONFLICT", "SAY", "QUISPE", "SAID", "WAGING", "CONDITIONS", "TOMORROW", "LINK", "BURNED", "WEEK", "DIRECT", "REUTER", "ISSUED", "RUBEN", "INDUSTRY", "YORK", "UNIDENTIFIED", "DEL", "MARXIST-LENINIST", "MEXICO", "AMERICAN", "CORRECT", "BEFORE", "LIMA", "THROUGHOUT", "ARTICLE", "CESAR", "DECLARE", "CHIEF", "WILL", "WHILE", "CIVILIAN", "THEMSELVES", "YOU"));
				ArrayList<String> ignore_indv=new ArrayList<String>(Arrays.asList("-", "-LSB-", "-RSB-", "-RRB-", "-LRB-", "", ",", ";", ".", "'S", "--", "``", "DIRECTORATE", "PARISH", "GROUPS", "TERRITORY", "YESTERDAY", "NEAR", "EXPLODED", "ARREST", "THINK", "YEAR", "NORTHWESTERN", "COMMUNIQUE", "INTENTION", "TAKEN", "MURDERED", "LIMON", "PUNISHED", "BUSINESSMAN", "LEFT", "$", "STOP", "SEARCH", "'", "MIGHT", "VARGAS", "DEPARTMENT", "RELEASE", "WHERE", "EMILIO", "AM", "AN", "RAMIRO", "HOW", "1", "AS", "2", "3", "AT", "4", "THUS", "6", "7", "PERUVIAN", "8", "9", ":", "CLOCK", "STRESSED", "UNDERSTAND", "?", "SEP", "SAME", "DETERMINED", "A", "BE", "TRYING", "SET", "SHOWS", "DAYS", "I", "SMALL", "INSISTED", "BATTALION", "PERPETRATED", "PRIEST", "BY", "PARTICIPATED", "COMMAND", "INVESTIGATION", "DID", "KILLED", "ATTRIBUTED", "JUL", "DENIED", "STATES", "JUN", "SITUATION", "MARTI", "MILLION", "NECESSARY", "CONTINUE", "VEHICLES", "RELATIONS", "CHANGES", "OFFICE", "SECURITY", "STATEMENT", "DE", "ACTIVISTS", "VIDEO", "SERVICES", "MERINO", "REPEATEDLY", "DO", "DR", "SHE", "AREA", "COUNTRY", "NINE", "EVACUATED", "EXPLOSIVES", "REPLACING", "EL", "FOR", "NACIONAL", "DAMAGE", "PRESS", "GUERRILLA", "DEPUTY", "LIVES", "HEADED", "ELECTRIC", "SIT", "ONTO", "OAS", "AMBASSADOR", "OCCURRED", "SIX", "PACIFIC", "STATE", "WITHIN", "REGIMES", "RESPECTIVE", "MOVEMENT", "HUMANITARIAN", "ABOUT", "CHARGE", "RODRIGUEZ", "WHITE", "POINTED", "OCTOBER", "WELL", "SHORTLY", "ACTIVITIES", "COVENAS", "SUPPOSEDLY", "PLACED", "WITH", "VIOLENCE", "ROOF", "1,000", "RICA", "STATEMENTS", "CARLOS", "YOUNG", "ACTION", "PROVINCE", "HE", "PLANNED", "TRUCE", "OCT", "CANDIDATE", "BECAUSE", "HIMSELF", "GUILLERMO", "SEARCHING", "TOLD", "GUSTAVO", "COLOMBIAN", "CARRIED", "IF", "II", "VARIOUS", "AMONG", "IN", "IS", "IT", "PABLO", "FORCE", "MSGR", "EVEN", "MAN", "WENT", "AUGUSTO", "MAR", "MAY", "HAVE", "HAPPENS", "OFF", "COMMENT", "ATTORNEY", "ACTIONS", "ASKING", "CADENA", "KG", "SPECIFICALLY", "AVENUE", "NOVEMBER", "FIRST", "DIALOGUE", "CRIMINALS", "PRIVATE", "COMMISSION", "PLANTED", "DEPLOYED", "CITY", "LA", "SOCIAL", "DESTROYED", "TREATED", "JULIO", "NORMAL", "ARMY", "CASUALTIES", "SINGLE", "ALARM", "OWNS", "DEATH", "DEFINITELY", "RESPECT", "REPORTS", "FUEL", "ESPECIALLY", "SILENT", "JANUARY", "UNIT", "IMPORTANT", "WERE", "SEPTEMBER", "MY", "SOLDIERS", "TOOK", "READ", "REMAIN", "OIL", "MAYOR", "BEHIND", "FILED", "ALLEGED", "DOZENS", "GUNNED", "ELECTION", "HELICOPTER", "MET", "OCHOA", "THREE", "COSTA", "NO", "MAJOR", "ACTIVE", "DEMONSTRATES", "INTERRUPTING", "PERSONS", "LOCATED", "LAND", "EXTRADITABLES", "CITIES", "FOLLOWING", "SAYS", "MEMBER", "REPORTER", "LIBERAL", "OF", "VENEZUELA", "INVESTIGATE", "CHANGE", "PRESIDENTIAL", "COMMANDER", "GLORIA", "TRANSFORMER", "ON", "ANTONIO", "NUMEROUS", "APRIL", "BELIEVED", "REPORTED", "MOMENT", "OR", "BELIEVES", "ASSISTANT", "COLOMBIA", "VISIT", "BUSH", "TURNED", "ROMERO", "ATTACK", "SECOND", "THEIR", "UNKNOWN", "GARCIA", "CIVIL", "MINISTER", "LEAST", "OLD", "SUPREME", "FRONT", "TREATMENT", "BETWEEN", "THANK", "RIFLE", "ENSURE", "INCREASE", "PROCESS", "CARRYING", "SEEKING", "MUST", "BRAZIL", "SPANISH", "BOMBS", "ROJAS", "WANT", "EXPLOSIVE", "BEGUN", "ACTS", "CALL", "CALI", "STRATEGY", "CARACAS", "ONE", "TELEVISION", "CEREZO", "SUFFERED", "GROUP", "U.S.", "EDGAR", "BELONGED", "VALUABLE", "GALAN", "DOES", "WOULD", "PONCE", "ALTHOUGH", "AROUND", "SUCH", "BUT", "BUS", "SALVADORAN", "BELTRAN", "REBELS", "FACILITIES", "DELGADO", "CAME", "COMMITTED", "...", "OTHER", "ENTERPRISE", "CAPTURED", "BRITISH", "MAINTAINING", "TO", "UNION", "HISTORY", "HOSTAGE", "CANO", "AIRCRAFT", "NEITHER", "THERE", "VIEW", "APPROXIMATELY", "GRENADE", "CORRESPONDENT", "JUAN", "UP", "DURING", "COURTS", "US", "SALVADOR", "THESE", "WORKING", "DIEGO", "MEANWHILE", "FULL", "YEARS", "PRIESTS", "LAST", "TOWN", "HOSPITAL", "IMPOSED", "MEASURES", "SOMOZA", "BRING", "WHETHER", "BOMB", "BILLION", "INTERNATIONAL", "COURT", "CONTROL", "OFFICIALS", "COLOMBIANS", "CAUSING", "BELONGING", "STONES", "GENERAL", "JUDGE", "WE", "WAVE", "NOTES", "NEWSMEN", "LEAVE", "GUERRILLAS", "PIPELINE", "AREAS", "SHOT", "PROVIDE", "NORTHEAST", "SHINING", "ECOPETROL", "CASANOVA", "SECTOR", "PAID", "TIME", "ANOTHER", "WHAT", "INTERPRETED", "AWAY", "PERSONNEL", "MONDAY", "HOURS", "PRESIDENT", "PEOPLE", "MINUTES", "MEDELLIN", "SECTION", "POPULATION", "DIPLOMATIC", "CRIME", "APPROVAL", "NICARAGUAN", "EXPLOSION", "VICTIMS", "CAUSED", "ACCUSES", "PLAN", "RENE", "WOUNDED", "DISCUSSING", "INCIDENTS", "CITIZENS", "TEGUCIGALPA", "WHEN", "BREAK", "LOCAL", "WALLS", "ACTED", "CENTRAL", "LITTLE", "DOMESTIC", "OUR", "EVIDENCE", "OUT", "CASE", "GIVE", "WOMEN", "1986", "FIRED", "LAWS", "CARRY", "SIERRA", "COMMON", "BRIGADE", "1988", "NAMES", "REMAINED", "POLICEMEN", "MRS", "GLASS", "ORDER", "ADDED", "LIBERATION", "GIVEN", "CEREMONY", "BEING", "ROBERTO", "MANUEL", "ESCALATION", "SENATOR", "SEVEN", "CONDEMNED", "BOMBING", "PRELIMINARY", "OFFICER", "OFFICES", "PORTH", "MORE", "SEIZED", "COULD", "KINDS", "QUITO", "ACAN-EFE", "EIGHT", "MARXIST", "PATRIOTIC", "POWERFUL", "CLANDESTINE", "ATTITUDE", "INSTITUTIONS", "STATED", "MEDIA", "USED", "SERVICE", "INCLUDING", "UNITS", "BOTH", "MOST", "TRAINED", "TRIED", "DEMOCRATIC", "ITSELF", "CAN", "CAR", "RETIRED", "KIND", "FRANCISCO", "ARTURO", "MURDERS", "DIED", "EFE", "CONSIDERABLE", "ARIAS", "CHURCH", "BUILDING", "PART", "GOMEZ", "ALSO", "SEARCHED", "EDITION", "INVOLVED", "RESULTS", "MEAN", "LIEUTENANTS", "OFFICIAL", "SERIES", "TODAY", "PESOS", "UNTIL", "STUDENTS", "REST", "KILLING", "CROSS", "DEVELOPMENT", "ACTIVATED", "SPOKESMAN", "APPROVED", "RESULT", "VENCEREMOS", "ACCORDING", "HEARD", "PATH", "BROTHER-IN-LAW", "CLAIMED", "CANAL", "ABAD", "POLICE", "AMERICA", "VEHICLE", "COMBAT", "UNIFORM", "HURT", "GMT", "BEEN", "EMPLOYEES", "JULY", "TOURIST", "HOSTAGES", "MURDER", "DESTROY", "WHOM", "DECADES", "FAMILY", "THE", "LUIS", "ALFONSO", "BEGAN", "SOUND", "UNITED", "CONGRESS", "LABOR", "JOINT", "BARCO", "ARMED", "AUTHORITIES", "OFFENSIVE", "NORTHERN", "F-2", "PLACE", "SUFFICIENT", "GARRISONS", "MUNICIPALITY", "CHILDREN", "RED", "ANTIOQUIA", "ANYTHING", "ACT", "EXTREME", "OPERATION", "GONZALEZ", "ADMITTED", "DEAD", "GOVERNMENT", "RECORDING", "EMBASSY", "ADD", "DOWN", "INFORMED", "ELN", "PAZ", "ITS", "TAKING", "TALK", "HAVANA", "LEADER", "DESERVE", "ENEMY", "RESPONSIBLE", "STATION", "FMLN", "OFFICIALLY", "SQUAD", "UNILATERAL", "HEAVY", "GUATEMALA", "END", "INCLUDED", "SPILL", "DEFENSE", "SANTIAGO", "BERNARDO", "AFP", "JUST", "STUDENT", "SOME", "PEASANTS", "EVENING", "CARIBBEAN", "SCENE", "''", "TERRORISTS", "INSTITUTION", "IDENTIFIED", "AGO", "MEETING", "GATE", "SUSPICION", "PROBABLY", "OVER", "GRANT", "SOLE", "RELEASED", "OFFICERS", "LOPEZ", "REGARDLESS", "CRISTIANI", "HOME", "PROTEST", "ADVISED", "FOUR", "TEXT", "RANKING", "REACTED", "INTERIOR", "CONFIRMED", "WHICH", "GATHER", "FORCES", "LEFTIST", "AID", "RECTOR", "NATIONAL", "ASSASSINATION", "WORKERS", "GAVE", "AIR", "STILL", "JARAMILLO", "TOP", "HOWEVER", "MADE", "ANNOUNCED", "SIGLO", "ENTER", "VALENCIA", "RIVER", "COUNTERINSURGENCY", "MAGISTRATE", "ELECTORAL", "ORGANIZATION", "METERS", "ALAMEDA", "RIGHT", "FACTORY", "MATERIAL", "ANONYMOUS", "HIDE", "CONTROLLED", "HONDURAN", "GUAYABAL", "FARABUNDO", "LIEUTENANT", "HONDURAS", "CALLED", "INTERVIEW", "BLOCKS", "WHOLE", "CONDEMNS", "LAS", "THAT", "ALL", "NEW", "ATTACKS", "RECENT", "LETTER", "HIGH", "FEEL", "THAN", "TERRORIST", "ALONG", "NAMELY", "HOTEL", "ORGANIZATIONS", "JUDICIAL", "MAIN", "ELITE", "TERRORISM", "LEADERS", "OFFERED", "TASK", "COAST", "WAREHOUSE", "MORAZAN", "PROOF", "JUSTICE", "MARTINEZ", "THROUGH", "AND", "CONFINED", "KIDNAPPED", "HOUR", "CARTEL", "ANY", "INVESTIGATIONS", "MAKE", "SOURCES", "BARONS", "BELIEVE", "ALFREDO", "MATTER", "ASSISTANCE", "NUNS", "POPULAR", "CURRENTLY", "COOPERATION", "FOURTH", "ADMINISTRATIVE", "PRESUMED", "JAN", "ATTACKING", "FREEDOM", "CARABINEROS", "BEST", "SCHOOL", "MONTH", "APR", "MENTIONED", "ASSASSINATED", "COUNTERPART", "GENERALS", "GUERRERO", "AFTER", "COPREFA", "EXCERPTS", "THEY", "CENTER", "MONTHS", "WEDNESDAY", "FIRE", "INCLUDE", "10", "REJECTED", "11", "LATER", "12", "13", "BANK", "14", "16", "ATTACKED", "DAILY", "17", "18", "19", "TWO", "0930", "ARE", "SOURCE", "BOGOTA", "THEN", "MIGUEL", "THEM", "20", "21", "MOMENTS", "PARTY", "22", "23", "INTO", "24", "26", "27", "FACT", "130", "FISHING", "RESIDENCE", "30", "SEEN", "31", "LONG", "WORDS", "DIRECTLY", "CIVILIANS", "HAD", "UNDER", "STREET", "FIFTH", "PREVENT", "3D", "JOSE", "STAFF", "GUTIERREZ", "HAS", "MANY", "40", "FACE", "42", "WANTED", "DESPITE", "DISRUPT", "INDISTINCT", "150", "GATHERED", "MARIA", "FIVE", "ORDERED", "DELEGATION", "WHOSE", "SEVERAL", "SANTA", "52", "FENASTRAS", "NETWORK", "CHIEFS", "PROTECTION", "KNOW", "LATIN", "LEMPA", "NOR", "THEREFORE", "NOT", "RANSOM", "NOV", "GUARANTEES", "PLANE", "NOW", "PREMISES", "PIZARRO", "THIS", "DYNAMITE", "UNIVERSITY", "MARIO", "CHARGES", "WAS", "CHARGED", "YET", "PEACE", "SPEECH", "MEDICINE", "WAY", "ARTILLERY", "EXECUTIVE", "70", "SEIS", "DIRECTOR", "CITIZEN", "VENEZUELAN", "ISRAELI", "ONES", "REPORT", "WRITING", "AGAINST", "HER", "PEREZ", "VIRGILIO", "CRIMINAL", "CAPITAL", "89", "ASKED", "AIRPORT", "INCIDENT", "ARMANDO", "PRESIDENCY", "TABLE", "THOUGHT", "INTELLIGENCE", "MORNING", "THREATENED", "HELD", "DESTABILIZE", "NICARAGUA", "90", "CLASHES", "COME", "FUNERAL", "FORTUNATELY", "TYPE", "INDICATES", "GAVIRIA", "TELEPHONE", "WORD", "REGARDING", "BULLETS", "ARRESTED", "THOSE", "CHILE", "CHILD", "MILITARY", "WITHOUT", "WIFE", "WORK", "FATHERLAND", "CRIMES", "SO-CALLED", "COLONEL", "PARTICULARLY", "NOON", "ARRIVED", "BODYGUARDS", "FLAG", "FEDERATION", "GONZALO", "PERSONAL", "POLITICAL", "CONSUL", "CAMPAIGN", "SITE", "FEB", "KNOWN", "INVOLVEMENT", "GUEVARA", "PIPELINES", "MEANING", "FAILURE", "HIM", "HIT", "HIS", "AMBULANCES", "OCCUPIED", "RATHER", "RADIO", "FEW", "DEVICES", "NEARBY", "ABOMINABLE", "DAY", "DRUG", "DECISION", "FORMER", "EVENTS", "ONLY", "FROM", "JESUITS", "RECEIVED", "SUPPORT", "POSITIONS", "NIGHT", "EXPRESS", "SECRETARY", "ESCOBAR", "WORLD", "PROTESTING", "WHO", "CONDUCTED", "SANDOVAL", "MEMBERS", "SERIOUSLY", "SUNDAY", "SINCE", "FIGHTING", "INDISCRIMINATE", "CHAIRMAN", "INRAVISION", "DATE", "CASTRO", "LIKE", "ZAMORA", "GOES", "INJURED", "SENT", "SAN", "CONFLICT", "JOURNALISTS", "DELIVERED", "PANAMA", "GUATEMALAN", "FPMR", "SAID", "HERE", "BURNED", "ISSUED", "MISSION", "UNIDENTIFIED", "DEL", "SERGEANT", "MEXICO", "AMERICAN", "BEFORE", "LIMA", "THROUGHOUT", "ARTICLE", "CESAR", "CHIEF", "TRUCKS", "WILL", "WHILE", "CIVILIAN", "THEMSELVES", "YOU"));
				ArrayList<String> ignore_weap=new ArrayList<String>(Arrays.asList("-", "-LSB-", "-RSB-", "-RRB-", "-LRB-", "", ",", ";", ".", "'S", "--", "``", "GROUPS", "RULING", "YESTERDAY", "AFFECTED", "DAWN", "NEAR", "FLOOR", "HALF", "YEAR", "COMMUNIQUE", "INTENTION", "MURDERED", "LIMON", "CARTRIDGES", "PROPOSED", "LEFT", "STOP", "MIGHT", "MUCH", "SHOTS", "DEPARTMENT", "WHERE", "EMILIO", "AN", "1", "AS", "SEE", "2", "3", "AT", "4", "THUS", "7", "PERUVIAN", "8", "9", ":", "REQUESTED", "CLOCK", "?", "COMMANDO", "SEP", "LEAVING", "DETERMINED", "A", "BE", "TRYING", "SET", "STRIKES", "DAYS", "ARCE", "BOOTH", "SMALL", "INSISTED", "BATTALION", "PERPETRATED", "PRIEST", "BY", "PARTICIPATED", "COMMAND", "INVESTIGATION", "DID", "KILLED", "ATTRIBUTED", "JUL", "DENIED", "STATES", "JUN", "JURISDICTION", "PARTIALLY", "MARTI", "CONTINUE", "VEHICLES", "SUSPEND", "OFFICE", "SECURITY", "STATEMENT", "DE", "SERVICES", "REPEATEDLY", "RELIGIOUS", "DO", "WISH", "DAYLIGHT", "AREA", "COUNTRY", "NINE", "WITNESSES", "EVACUATED", "TONIGHT", "PORT", "EL", "FOR", "DAMAGE", "PRESS", "GUERRILLA", "DEPUTY", "USING", "HEADED", "DECLARED", "OAS", "AMBASSADOR", "OCCURRED", "SIX", "PACIFIC", "STATE", "DEMANDED", "MOVEMENT", "BODIES", "HUMANITARIAN", "SUFFERING", "ABOUT", "RODRIGUEZ", "POINTED", "OCTOBER", "WELL", "URBAN", "GO", "SHORTLY", "ACTIVITIES", "COVENAS", "SUPPOSEDLY", "WITH", "AIRES", "SHORT", "VIOLENCE", "RICA", "CARLOS", "YOUNG", "ACTION", "AGENTS", "PROVINCE", "HE", "ROOM", "ACTIVITY", "STRONG", "PLANNED", "TRUCE", "OCT", "INTERCEPTED", "CANDIDATE", "BECAUSE", "HIMSELF", "GUILLERMO", "SEARCHING", "TOLD", "COLOMBIAN", "CARRIED", "FIELDS", "IN", "IS", "IT", "FORCE", "EVEN", "SERIOUSNESS", "MAN", "WENT", "EVER", "MAR", "SAUL", "MAY", "HAVE", "OFF", "OPPOSITION", "ACTIONS", "SOUGHT", "CADENA", "OUTSIDE", "KM", "AVENUE", "NOVEMBER", "FIRST", "DIALOGUE", "COMMISSION", "PLANTED", "SHOOTING", "CITY", "LA", "DESTROYED", "ARMY", "CASUALTIES", "SINGLE", "THIRD", "WEST", "TENSION", "DEATH", "WARNED", "SECTORS", "REPORTS", "FUEL", "JANUARY", "IMPORTANT", "WERE", "SEPTEMBER", "GASOLINE", "SOLDIERS", "TOOK", "RESIDENTS", "200", "INSTITUTE", "OIL", "MAYOR", "BEHIND", "ALLEGED", "MEN", "REAL", "HELICOPTER", "THREE", "EXISTENCE", "COSTA", "NO", "INTERRUPTING", "PERSONS", "LOCATED", "CITIES", "FOLLOWING", "SAYS", "MEMBER", "REPORTER", "LIBERAL", "OF", "INVESTIGATE", "PRESIDENTIAL", "COMMANDER", "TRANSFORMER", "ON", "ANTONIO", "NUMEROUS", "APRIL", "REPORTED", "OR", "FISHERMEN", "COLOMBIA", "REBEL", "TURNED", "MANAGUA", "ATTACK", "SECOND", "THEIR", "UNKNOWN", "GARCIA", "MINISTER", "ELECTRICAL", "LEAST", "OLD", "SUPREME", "FRONT", "TREATMENT", "BETWEEN", "CONDOLENCES", "COMMUNITY", "INCREASE", "PROCESS", "CARRYING", "BLAST", "TOWER", "MUNICIPAL", "SPANISH", "WANT", "NORBERTO", "CARACAS", "ONE", "TELEVISION", "CEREZO", "SUFFERED", "GROUP", "MAOIST", "U.S.", "DOES", "SO", "PONCE", "SUCH", "BUT", "SALVADORAN", "BELTRAN", "REBELS", "SOYAPANGO", "COMMITTED", "...", "OTHER", "ENTERPRISE", "RURAL", "CAPTURED", "PATROL", "REQUEST", "THREATS", "BRITISH", "TO", "CALLS", "UNION", "HISTORY", "CANO", "AIRCRAFT", "CHILEAN-U.S.", "THERE", "COMMANDOS", "FINALLY", "APPROXIMATELY", "UP", "DURING", "PERQUIN", "US", "SALVADOR", "THESE", "RELATIVES", "SKETCHES", "DIEGO", "MEANWHILE", "YEARS", "LAST", "TOWN", "IMPOSED", "GAS", "MEASURES", "WHETHER", "BOMB", "INTERNATIONAL", "COURT", "SUSPECTED", "ENTERED", "CONTROL", "COLOMBIANS", "GENERAL", "WE", "WAVE", "NOTES", "LEAVE", "GUERRILLAS", "PIPELINE", "AREAS", "SHOT", "LAUNCH", "PROVIDE", "NOTED", "ECOPETROL", "SECTOR", "PAID", "ANOTHER", "WHAT", "PERSONNEL", "HOURS", "PRESIDENT", "PEOPLE", "MINUTES", "SECTION", "INSIDE", "RAMON", "POPULATION", "APPROVAL", "NICARAGUAN", "EXPLOSION", "VICTIMS", "CAUSED", "RENE", "WOUNDED", "INCIDENTS", "TEGUCIGALPA", "WHEN", "LOCAL", "WALLS", "PERSON", "CENTRAL", "LITTLE", "DOMESTIC", "OUT", "GIVE", "GEN", "FIRED", "GET", "BRIGADE", "SECRET", "ACCUSED", "1988", "FUSE", "POLICEMEN", "BEGIN", "ADDED", "LIBERATION", "CEREMONY", "BEING", "MANUEL", "SEVEN", "DECIDED", "CONDEMNED", "BOMBING", "LOOKING", "PRELIMINARY", "BROTHER", "PORTH", "MORE", "SEIZED", "COULD", "BISHOP", "LIBERTY", "QUITO", "KILL", "ACAN-EFE", "NERVOUS", "CLANDESTINE", "SERIOUS", "INSTITUTIONS", "STATED", "MEDIA", "USED", "SERVICE", "INCLUDING", "PREPARATION", "UNITS", "BOTH", "MOST", "TELECOMMUNICATIONS", "DEMOCRATIC", "CAR", "MAINTAIN", "ARTURO", "DIED", "EFE", "LINARES", "POLICEMAN", "CONSIDERABLE", "ARIAS", "TRAVELING", "CHURCH", "BUILDING", "3,000", "PART", "ALSO", "15-YEAR-OLD", "MEAN", "LIEUTENANTS", "OFFICIAL", "DETERMINE", "SERIES", "TIMES", "TODAY", "CAMILIST", "PEDRO", "STUDENTS", "KILLING", "CROSS", "DEVELOPMENT", "SPOKESMAN", "APPROVED", "RESULT", "VENCEREMOS", "ACCORDING", "HEARD", "UNDETERMINED", "OPERATING", "ABAD", "POLICE", "CHRISTIAN", "HELICOPTERS", "AMERICA", "VEHICLE", "COUNTRIES", "CONTINUING", "GMT", "BEEN", "PAST", "MURDER", "NATIONS", "EXPRESSED", "DESTROY", "FAMILY", "THE", "LUIS", "DAUGHTER", "BEGAN", "UNITED", "CONGRESS", "LABOR", "JOINT", "BARCO", "APPARENTLY", "ARMED", "AUTHORITIES", "DEMOCRACY", "OFFENSIVE", "POWER", "NORTHERN", "VINICIO", "PLACE", "CHILDREN", "RED", "ADMITTED", "INCREASED", "DEAD", "GOVERNMENT", "SYSTEM", "RECORDING", "EMBASSY", "ADD", "ELN", "ITS", "LEADER", "NORTH", "MINISTRY", "FOUND", "RESPONSIBLE", "ENERGY", "STATION", "INSTALLATIONS", "EARLY", "FMLN", "OFFICIALLY", "TOTALLY", "BENITO", "HEAVY", "GUATEMALA", "END", "INCLUDED", "SPILL", "SANTIAGO", "AFP", "JUST", "PDC", "STUDENT", "SOME", "PEASANTS", "SOVIET", "''", "EXCLUSIVE", "TERRORISTS", "DISTURBANCES", "ACCIDENT", "IDENTIFIED", "AGO", "MEETING", "GATE", "PROBABLY", "JESUIT", "OVER", "500", "LOPEZ", "CRISTIANI", "HOME", "ADVISED", "FOUR", "TEXT", "RANKING", "IMAGE", "INTERIOR", "WHICH", "FORCES", "LEFTIST", "TRUJILLO", "DIPLOMAT", "VERY", "NATIONAL", "ASSASSINATION", "WORKERS", "AIR", "REGION", "STILL", "HOWEVER", "MADE", "ANNOUNCED", "SANDINO", "ERP", "ABLE", "ENTER", "ORGANIZATION", "POSSIBILITY", "METERS", "LAUNCHED", "REVOLUTIONARY", "WINDOWS", "RIGHT", "USSR", "FACTORY", "ELENA", "MARTIN", "CONTROLLED", "HONDURAN", "EXCERPT", "FARABUNDO", "WHOLE", "THAT", "ALL", "NEW", "ATTACKS", "RECENT", "HIGH", "LAW", "THAN", "TERRORIST", "ALONG", "NAMELY", "HOTEL", "ABOARD", "ORGANIZATIONS", "TALKS", "MAIN", "TRY", "LEADERS", "BROAD", "BECAME", "BILLBOARD", "AND", "DANILO", "GUNSHIPS", "MOUNTAIN", "ANY", "INVESTIGATIONS", "SOURCES", "GOING", "STARTED", "ALFREDO", "MATTER", "POPULAR", "DISCLOSED", "DOWNTOWN", "BENEFIT", "ADMINISTRATIVE", "PRESUMED", "JAN", "AFTERNOON", "FREEDOM", "CARABINEROS", "SCHOOL", "APR", "OWNED", "COUNTERPART", "GUERRERO", "AFTER", "COPREFA", "HOUSES", "THEY", "CENTER", "MONTHS", "STREETS", "WEDNESDAY", "FIRE", "INCLUDE", "EMISORAS", "10", "REJECTED", "11", "12", "13", "14", "15", "16", "ATTACKED", "DAILY", "17", "18", "19", "SONORA", "TWO", "ARE", "PARKED", "SOURCE", "BOGOTA", "CONDITION", "THEN", "MOUNTAINS", "20", "PUERTO", "21", "PARTY", "23", "24", "25", "26", "REPEAT", "27", "PARTS", "FACT", "130", "BUENOS", "FISHING", "SUMMIT", "30", "31", "FELL", "LONG", "BLEW", "CIVILIANS", "HAD", "UNDER", "STREET", "REPLY", "EXPLOSIONS", "JOSE", "STAFF", "MARCH", "PREVAILED", "HAS", "MANY", "PLATE", "42", "DISRUPT", "INDISTINCT", "GATHERED", "FIVE", "AUG", "DELEGATION", "WHOSE", "SEVERAL", "SANTA", "BROKEN", "52", "FENASTRAS", "NUMBER", "NETWORK", "CHIEFS", "RUNNING", "DECREE", "PROPERTY", "FERNANDEZ", "SOUTHERN", "THEREFORE", "NOT", "NOV", "GUARANTEES", "PLANE", "SUSPENDED", "NOW", "PIZARRO", "THIS", "UNIVERSITY", "UNOFFICIAL", "OPERATIONS", "WAS", "CHARGED", "PEACE", "SPEECH", "WAY", "FOREIGN", "CAMPUS", "ARTILLERY", "CULTURAL", "DAMAGED", "DIRECTOR", "CITIZEN", "SARMIENTO", "REPORT", "WRITING", "PEASANT", "TRAFFIC", "AGAINST", "RAFAEL", "MONEDA", "VIRGILIO", "FAR", "CAPITAL", "89", "ASKED", "AIRPORT", "ROAD", "INCIDENT", "INTELLIGENCE", "MORNING", "GUNS", "THREATENED", "NICARAGUA", "90", "MACHINEGUNNED", "FORTUNATELY", "TYPE", "TELEPHONE", "WORD", "MARKER", "REGARDING", "BULLETS", "ARRESTED", "INTOLERANCE", "LEVEL", "THOSE", "CHILE", "MILITARY", "WITHOUT", "WIFE", "WORK", "MOSCOW", "COLONEL", "NOON", "ARRIVED", "FEDERATION", "PERSONAL", "POLITICAL", "0300", "LARGE", "FEB", "KNOWN", "PIPELINES", "MEANING", "FAILURE", "HIM", "HIS", "ADDITION", "DAS", "RADIO", "FEW", "NEARBY", "LEAD", "FORMER", "ONLY", "FROM", "STRAFED", "SPECIAL", "RECEIVED", "POSITIONS", "HEADQUARTERS", "NIGHT", "MAZA", "SECRETARY", "WORLD", "WHO", "SANDOVAL", "MEMBERS", "SUNDAY", "THOUSANDS", "SLIGHTLY", "SINCE", "EXPERTS", "FIGHTING", "INRAVISION", "CASTRO", "LIKE", "GOES", "INJURED", "STEPS", "STUDIO", "SAN", "JOURNALISTS", "FLED", "SAID", "HERE", "WEEK", "BOMBED", "REUTER", "ISSUED", "DEC", "UNIDENTIFIED", "MEXICO", "AMERICAN", "BEFORE", "LIMA", "THROUGHOUT", "TRUCKS", "WILL", "WHILE", "CIVILIAN"));
				ArrayList<String> ignore_vic=new ArrayList<String>(Arrays.asList("-", "-LSB-", "-RSB-", "-RRB-", "-LRB-", "", ",", ";", ".", "'S", "--", "``", "ATTENTION", "EXPLODE", "GROUPS", "INVESTIGATING", "RULING", "YESTERDAY", "AFFECTED", "NEAR", "SHOULD", "EXPLODED", "THING", "ARREST", "LEARNED", "THINK", "YEAR", "NORTHWESTERN", "COMMUNIQUE", "INTENTION", "ORTEGA", "COUP", "TAKEN", "THOROUGHLY", "CONSIST", "CONSOLIDATED", "LEFT", "$", "ADOPT", "STOP", "'", "WHOEVER", "VARGAS", "SHOTS", "DEPARTMENT", "RELEASE", "WHERE", "COMPELLED", "AN", "HOW", "1", "AS", "2", "3", "AT", "4", "THUS", "5", "6", "7", "PERUVIAN", "8", "9", ":", "REQUESTED", "STRESSED", "UNDERSTAND", "?", "COMMANDO", "SEP", "SAME", "DETERMINED", "A", "BE", "TRYING", "SET", "SHOWS", "DAYS", "I", "MAYORS", "FOLLOWERS", "FLORES", "MESSAGE", "SMALL", "BASED", "BATTALION", "SERVANTS", "PERPETRATED", "PRIEST", "BY", "PARTICIPATED", "SUPERIOR", "Y", "COMMAND", "INVESTIGATION", "DID", "KILLED", "JUL", "DENIED", "STATES", "REPRESSIVE", "JURISDICTION", "SITUATION", "MARTI", "GREGORIO", "REFERRING", "AUTHORS", "NECESSARY", "CONTINUE", "NATURE", "VEHICLES", "SUSPEND", "RELATIONS", "CHANGES", "OFFICE", "SECURITY", "D'AUBUISSON", "COLINDRES", "DAMAS", "DE", "SERVICES", "DETONATED", "INTENDED", "RELIGIOUS", "DO", "WISH", "DAYLIGHT", "MAURICIO", "SHE", "CHAPEL", "AREA", "COUNTRY", "NINE", "WITNESSES", "TONIGHT", "TRAITORS", "VIOLENT", "ALLOW", "ASSASSINATIONS", "EXPLOSIVES", "PORT", "EL", "LIGHT", "PROTESTED", "FOR", "NACIONAL", "DAMAGE", "PRESS", "GUERRILLA", "DEPUTY", "USING", "NEED", "FOLLOWED", "DOING", "LIVES", "HEADED", "DECLARED", "BRAZILIAN", "SIT", "ONTO", "POSSIBILITIES", "AMBASSADOR", "OCCURRED", "PACIFIC", "BUSES", "STATE", "OBLIGATION", "DEMANDED", "ABSOLUTE", "REPLIED", "BODIES", "REACTION", "DOCTORS", "NEIGHBORHOOD", "OPINION", "HUMANITARIAN", "ABOUT", "CHARGE", "RODRIGUEZ", "ANSWER", "POINTED", "OCTOBER", "WELL", "URBAN", "ACTIVITIES", "PLACED", "WITH", "SHORT", "ALREADY", "VIOLENCE", "1,000", "RICA", "STATEMENTS", "CARLOS", "YOUNG", "ACTION", "AGAIN", "COORDINATOR", "WAITED", "TRUCK", "HE", "ROOM", "CARACOL", "STRONG", "PLANNED", "TREACHEROUS", "DEBATE", "CANDIDATE", "BECAUSE", "GUILLERMO", "UPI", "TOLD", "COLOMBIAN", "AIRPLANE", "REGISTRATION", "CARRIED", "IF", "UNQUESTIONABLY", "FIELDS", "VARIOUS", "AMONG", "IN", "DEMONSTRATORS", "ATLACATL", "RESOLUTION", "IS", "IT", "OBVIOUS", "REPUDIATE", "FORCE", "DPA", "MSGR", "EVEN", "MAN", "WENT", "THROWN", "AUGUSTO", "CONDEMN", "MAR", "DEFEND", "PROCEDURES", "MAY", "HAVE", "BLOODY", "BECOME", "OFF", "OPPOSITION", "ATTORNEY", "THREW", "CONFERENCE", "ACTIONS", "SOUGHT", "CADENA", "KG", "ARENA", "WAIT", "KM", "GACHA", "ADDING", "ENDED", "NOVEMBER", "FIRST", "DIALOGUE", "ROSA", "CRIMINALS", "PRIVATE", "RECORDS", "COMMISSION", "PLANTED", "SHOOTING", "MEANS", "SON", "CITY", "GREATEST", "LA", "SOCIAL", "DESTROYED", "JULIO", "IDENTIFY", "ARMY", "CASUALTIES", "SINGLE", "AYALA", "THIRD", "WEST", "PEOPLES", "EVENT", "WILLING", "SHED", "EASTERN", "SECTORS", "REPORTS", "FUEL", "ME", "REASON", "UPON", "ESPECIALLY", "MR", "APPOINTED", "WERE", "MY", "GASOLINE", "SOLDIERS", "COCHABAMBA", "TOOK", "READ", "RESIDENTS", "REMAIN", "200", "INSTITUTE", "DEMAND", "OIL", "MAYOR", "ALLEGED", "MEN", "REASONS", "LESS", "HELICOPTER", "MET", "BODY", "OCHOA", "THREE", "NEIGHBORHOODS", "COSTA", "NO", "EUROPEAN", "MAJOR", "SHARES", "INTERRUPTING", "LOCATED", "LAND", "EXTRADITABLES", "CITIES", "FOLLOWING", "SAYS", "MEMBER", "REPORTER", "GRIEF", "LIBERAL", "OF", "VENEZUELA", "PRESIDENTIAL", "STRIKE", "COMMANDER", "TRANSFORMER", "ON", "NUMEROUS", "BELIEVED", "REPORTED", "OR", "RIGHTIST", "BELIEVES", "ASSISTANT", "ESCORTS", "CONFRONT", "AFFECT", "COLOMBIA", "REBEL", "TURNED", "ROMERO", "ATTACK", "SECOND", "THEIR", "UNKNOWN", "POINT", "GARCIA", "MINISTER", "GOVERNOR", "OBSERVERS", "LEAST", "SUPREME", "FRONT", "BETWEEN", "CONSIDERED", "FOREIGNERS", "REVENGE", "COMMUNITY", "INCREASE", "PROCESS", "CIVIC", "CARRYING", "SEEKING", "BLAST", "ATTENDING", "INSTRUCTION", "MUST", "LOADED", "BRAZIL", "HELPING", "WANT", "EXPLOSIVE", "PROGRAM", "KEY", "ACTS", "CALL", "EMERGENCY", "CALI", "TEAR", "ONE", "COMMUNICATIONS", "SCHOOLS", "TELEVISION", "CEREZO", "SUFFERED", "GROUP", "U.S.", "BROUGHT", "JAVIER", "BELONGED", "BANKS", "VALUABLE", "DESTROYING", "WOULD", "SO", "PROTECTED", "PONCE", "ALTHOUGH", "AROUND", "HEAVILY", "SUCH", "BUT", "GREAT", "SALVADORAN", "INTERESTS", "REBELS", "FACILITIES", "ICA", "ARRESTS", "SOYAPANGO", "CAME", "RESPONSIBILITY", "ALLIANCE", "...", "TRAINING", "OTHER", "ENTERPRISE", "CAPTURED", "DELAYED", "FATHER", "PATROL", "REQUEST", "THREATS", "MINISTERS", "PUBLICLY", "BRITISH", "KIDNAPPERS", "TEAM", "TO", "CALLS", "VICE", "UNION", "HIDING", "REVEALS", "CANO", "THERE", "LATE", "CATHEDRAL", "NEWSPAPER", "METROPOLITAN", "FINALLY", "WITNESS", "APPROXIMATELY", "GUARD", "TUPAC", "GRENADE", "UN", "JUAN", "UP", "DURING", "COURTS", "US", "PARTICIPATION", "CLASH", "SALVADOR", "SERVED", "THESE", "WORKING", "RELATIVES", "TRAFFICKERS", "MADRID", "DUARTE", "SKETCHES", "DIEGO", "PRESUMABLY", "MEANWHILE", "FURTHER", "YEARS", "ROCKET", "LAST", "TOWN", "HOSPITAL", "GAS", "MEASURES", "BOMB", "INTERNATIONAL", "COURT", "ENTERED", "CONTROL", "OFFICIALS", "VOTE", "COLOMBIANS", "BELONGING", "THOUGH", "UNFORTUNATELY", "GENERAL", "CAMPAIGNS", "JUDGE", "WE", "QUESTION", "COURSE", "MNR", "WAVE", "NOTES", "SURROUNDING", "NEWSMEN", "LEAVE", "GUERRILLAS", "PIPELINE", "AREAS", "LAUNCH", "NOTED", "SHINING", "ECOPETROL", "CASANOVA", "SECTOR", "TIME", "ANOTHER", "WHAT", "FIRING", "AWAY", "AGENCY", "MONDAY", "JOINTLY", "STRUGGLE", "HOURS", "PRESIDENT", "NEWS", "FILLED", "FALSE", "PEOPLE", "MINUTES", "MEDELLIN", "SECTION", "INSIDE", "RAMON", "POPULATION", "MOVEMENTS", "DIPLOMATIC", "CRIME", "PROBLEMS", "NICARAGUAN", "EXPLOSION", "VICTIMS", "CAUSED", "ACCUSES", "SHARE", "RECOMMENDATION", "INCIDENTS", "CITIZENS", "WHEN", "BREAK", "LOCAL", "DOCUMENT", "EXCHANGE", "WALLS", "ACTED", "PERSON", "CENTRAL", "JUDGES", "DOMESTIC", "OUR", "EVIDENCE", "MONTOYA", "OUT", "CASE", "COMPANY", "OSCAR", "GIVE", "GEN", "FIRED", "AIMED", "ACCUSING", "CARRY", "GET", "PUBLIC", "BRIGADE", "CAUSES", "INVOLVE", "1989", "ACCUSED", "1988", "REMAINED", "POLICEMEN", "COLORADO", "MIRALVALLE", "STAGED", "PRESENT", "ANALYSIS", "BEGIN", "STEPPED", "MRS", "ORDER", "ADDED", "LIBERATION", "BEING", "SEVEN", "DECIDED", "BOMBING", "PHYSICAL", "SPOKESMEN", "PRELIMINARY", "BROTHER", "COCAINE", "OFFICES", "STAYING", "MORE", "SEIZED", "COULD", "INDEED", "MORAL", "QUITO", "ASSOCIATION", "KILL", "EIGHT", "OQUELI", "SAFETY", "WASHINGTON", "UNITY", "MEASURE", "PATRIOTIC", "POWERFUL", "USULUTAN", "CLANDESTINE", "WOMAN", "SERIOUS", "ALVARO", "NATION", "INSTITUTIONS", "STATED", "THREATENING", "TELL", "MEDIA", "USED", "SERVICE", "INCLUDING", "UNITS", "BOTH", "DIFFERENT", "ANYONE", "MOST", "EXCEPT", "DEMOCRATIC", "ITSELF", "CAN", "DIFFICULT", "FLIGHT", "CAR", "RETIRED", "KIND", "FRANCISCO", "ARTURO", "MURDERS", "DIED", "EFE", "DETACHMENT", "SOCIETY", "RIVERA", "ARIAS", "HEADING", "TRAVELING", "CHURCH", "BUILDING", "3,000", "PART", "ALSO", "SEARCHED", "INVOLVED", "RESULTED", "CATHOLIC", "RESULTS", "OFFICIAL", "SERIES", "TIMES", "TODAY", "CHAVEZ", "ADDS", "UNTIL", "STUDENTS", "REST", "REVEALED", "CROSS", "EDUARDO", "DEVELOPMENT", "SPOKESMAN", "APPROVED", "VENCEREMOS", "ACCORDING", "HEARD", "PATH", "DECEMBER", "REGRETTABLE", "RIGHT-WING", "FIGHT", "SIMPLY", "CLAIMED", "LISTEN", "POLICE", "CHRISTIAN", "AMERICA", "VEHICLE", "COUNTRIES", "COMBAT", "UNIFORM", "CONTINUING", "TRAFFICKING", "REVEAL", "HURT", "CUBA", "BOMBINGS", "SABOTAGE", "TOGETHER", "EXCHANGED", "BEEN", "EMPLOYEES", "PAST", "JULY", "HOSTAGES", "EXPRESSED", "DESTROY", "WHOM", "REITERATE", "THE", "DISTRICT", "ALFONSO", "BEGAN", "REGRET", "FREDDY", "UNITED", "CONGRESS", "LABOR", "BARCO", "APPARENTLY", "ARMED", "SPECULATE", "MEET", "AUTHORITIES", "DEMOCRACY", "OFFENSIVE", "NORTHERN", "VINICIO", "PLACE", "MUNICIPALITY", "RED", "CONNECTION", "ANTIOQUIA", "ACT", "EXTREME", "ABROAD", "OPERATION", "GONZALEZ", "SETTLEMENT", "ADMITTED", "DEAD", "GOVERNMENT", "SYSTEM", "RECORDING", "EMBASSY", "ADD", "DOWN", "INFORMED", "ELN", "PAZ", "ITS", "TAKING", "TALK", "DEEPLY", "HAVANA", "TYPES", "ISSUE", "CONDEMNABLE", "NORTH", "DESERVE", "ANTIGOVERNMENT", "GERMAN", "FOUND", "HOLD", "TROOPS", "TAKE", "SECRETARIAT", "RESPONSIBLE", "COMRADE", "STATION", "NATIONALIST", "INFORMATION", "EARLY", "FMLN", "OFFICIALLY", "SOLVE", "TOTALLY", "SQUAD", "DECLINED", "GUARANTEE", "HEAVY", "GUATEMALA", "END", "INCLUDED", "SPILL", "CAPTAIN", "TERRIBLE", "DEFENSE", "ECONOMIC", "SANTIAGO", "INDEPENDENT", "AFP", "DOCUMENTS", "JUST", "PRESSURE", "LINKING", "STUDENT", "SOME", "PEASANTS", "CONCERNING", "CARIBBEAN", "SOVIET", "SCENE", "AURORA", "''", "BRANCH", "TERRORISTS", "UMAN", "DISTURBANCES", "INSTITUTION", "ACCIDENT", "IDENTIFIED", "AGO", "SOCIALIST", "MEETING", "SUSPICION", "OVER", "OTHERS", "RELEASED", "REPRESENTATIVES", "OFFICERS", "500", "LOPEZ", "CRISTIANI", "KIDNAPPING", "BARRANCABERMEJA", "HOME", "PROTEST", "FOUR", "TEXT", "ASSURED", "RANKING", "REACTED", "ALMOST", "HUMAN", "CONTINUOUSLY", "INTERIOR", "CONFIRMED", "WHICH", "FORCES", "LEFTIST", "AID", "HOPE", "VERY", "READY", "NATIONAL", "WORKERS", "COMMENTARY", "GAVE", "AIR", "FORCED", "TORTURE", "GUILTY", "REGION", "EITHER", "AMARU", "STILL", "JARAMILLO", "BORDER", "TOP", "HOWEVER", "MADE", "ANNOUNCED", "ARGENTINE", "ERP", "FRIDAY", "SIGLO", "ENTER", "AFFAIRS", "ARGENTINA", "MAGISTRATE", "ORGANIZATION", "POSSIBILITY", "METERS", "ABANDONED", "LAUNCHED", "AMPARO", "REVOLUTIONARY", "WINDOWS", "STATING", "RIGHT", "USSR", "DISTRIBUTED", "TERROR", "MATERIAL", "ANONYMOUS", "BETTER", "MARTIN", "GUAYABAL", "FARABUNDO", "PERHAPS", "CALLED", "300", "INTERVIEW", "REGIME", "KNEW", "EXTENSIVE", "THAT", "ALL", "NEW", "ATTACKS", "RECENT", "LETTER", "PUNISH", "HIGH", "THURSDAY", "LAW", "FEEL", "THAN", "TERRORIST", "ALIAS", "ALONG", "HOTEL", "PUBLISHED", "HAPPENED", "ORGANIZATIONS", "INITIATIVES", "JUDICIAL", "TALKS", "MAIN", "TRY", "COMMANDERS", "ELITE", "TERRORISM", "LEADERS", "ENTIRE", "OFFERED", "TASK", "CLEARLY", "DESCRIBED", "VOLCANO", "PROOF", "BROAD", "SEEMS", "JUSTICE", "MARTINEZ", "PARTICIPATE", "POPULATED", "DEPARTURE", "THROUGH", "AND", "OTHERWISE", "AUGUST", "GOTTEN", "RIGHTS", "KIDNAPPED", "HOUR", "GUNSHIPS", "ROUND", "INITIAL", "CARTEL", "MOUNTAIN", "ANY", "INVESTIGATIONS", "MAKE", "REFUSED", "SOURCES", "IMMEDIATELY", "GOING", "BELIEVE", "ALFREDO", "ASSISTANCE", "NUNS", "REGRETS", "LED", "DISCLOSED", "CURRENTLY", "PARIS", "BENEFIT", "PRESUMED", "AFTERNOON", "BLAMED", "FREEDOM", "CONCERN", "CLEAR", "SCHOOL", "MONTH", "MENTIONED", "GENERALS", "AFTER", "CLOSE", "HOUSES", "EXCERPTS", "THEY", "CENTER", "INDIVIDUALS", "FIRE", "RESPONSE", "EMISORAS", "10", "EVERYONE", "11", "LATER", "12", "13", "14", "CUT", "15", "LUCIA", "16", "ATTACKED", "17", "18", "PROBLEM", "19", "SONORA", "TWO", "IDENTITY", "ANNOUNCEMENT", "REPUBLICAN", "SHOCK", "ARE", "THINGS", "PARKED", "BOGOTA", "CONDITION", "THEN", "THEM", "PROVIDES", "CORPS", "20", "PUERTO", "21", "PARTY", "22", "INTO", "24", "25", "26", "REPEAT", "27", "PARTS", "DECREED", "FACT", "FREE", "130", "MURDERING", "FISHING", "30", "SERVE", "31", "CONDUCT", "WORDS", "DIRECTLY", "REPRESENT", "CIVILIANS", "HAD", "UNDER", "RUN", "STREET", "PARTIES", "PREVENT", "CONTINUED", "3D", "JOSE", "PRESENCE", "STAFF", "MARCH", "HAS", "MANY", "FACE", "42", "STAY", "CAMARGO", "CONTINUES", "WANTED", "DESPITE", "RECEPTION", "DISRUPT", "EXPLAINED", "INDISTINCT", "NO.", "MARIA", "AUG", "CONFRONTED", "ORDERED", "DELEGATION", "POLITICIANS", "WHOSE", "SEVERAL", "SANTA", "54", "NUMBER", "NETWORK", "ONCE", "PROTECTION", "MERCENARIES", "KNOW", "LATIN", "NOR", "THEREFORE", "NOT", "NOV", "IRRESPONSIBLE", "PLANE", "NOW", "PREMISES", "THIS", "DYNAMITE", "CARTELS", "RICAN", "UNIVERSITY", "FRUITS", "OPERATIONS", "CHARGES", "WAS", "YET", "WAR", "PEACE", "SPEECH", "TECUN", "WAY", "ADOPTED", "FOREIGN", "LEGAL", "MASS", "TRAGEDY", "EXECUTIVE", "DIRECTOR", "LIFE", "VENEZUELAN", "ISRAELI", "SLOGANS", "GENERALIZED", "ONES", "REPORT", "WRITING", "AGAINST", "RAFAEL", "LAUNCHING", "HER", "PEREZ", "VIRGILIO", "FAR", "MRTA", "INTIMIDATE", "PERPETRATORS", "CRIMINAL", "CAPITAL", "HOMELAND", "89", "ASKED", "AIRPORT", "FAIR", "INCIDENT", "CONCILIATION", "INAUGURATION", "EFFECTIVE", "PRESIDENCY", "INTELLIGENCE", "MORNING", "INDISCRIMINATELY", "GUNS", "HELD", "NICARAGUA", "AMOUNT", "CLASHES", "MACHINEGUNNED", "COME", "NONE", "FUNERAL", "TYPE", "INDICATES", "GAVIRIA", "TELEPHONE", "WORD", "GALLONS", "MARKER", "REGARDING", "BULLETS", "ARRESTED", "INTOLERANCE", "THOSE", "MILITARY", "WITHOUT", "WIFE", "CHECK", "WORK", "CRIMES", "CRUEL", "MOSCOW", "COLONEL", "ARRIVED", "GONZALO", "PERSONAL", "POLITICAL", "LARGE", "FALL", "COWARDLY", "ESPECTADOR", "KNOWN", "INVOLVEMENT", "DARK", "LAWYER", "PIPELINES", "RESPECTIVELY", "FAILURE", "HIM", "HIT", "HIS", "ADDITION", "DAS", "RATHER", "WAITING", "RADIO", "FEW", "DEVICES", "NEARBY", "ROCA", "DAY", "MEXICAN", "DRUG", "FORMER", "REFERRED", "WORKED", "ONLY", "FROM", "DEATHS", "RECEIVED", "SUPPORT", "POSITIONS", "HEADQUARTERS", "DENSELY", "SANDINIST", "NIGHT", "EXPRESS", "MAZA", "GUARDS", "SECRETARY", "CANDIDATES", "ESCOBAR", "WORLD", "WHO", "SANDOVAL", "INTERVIEWED", "MEMBERS", "SINCE", "WHY", "EXPERTS", "INFANTRY", "RESIGNATIONS", "FIGHTING", "BLOW", "INRAVISION", "DATE", "CASTRO", "LIKE", "RIDDLED", "SENT", "STEPS", "STUDIO", "LINKED", "CIRCUMSTANCES", "SAN", "CONFLICT", "DELIVERED", "PANAMA", "GUATEMALAN", "SAW", "SAY", "MURDERERS", "SAID", "DECLARATIONS", "HERE", "SPECULATION", "NOTE", "STOPPED", "TOMORROW", "BURNED", "ACCUSE", "DIRECT", "ISSUED", "SEVERE", "BAD", "MISSION", "UNIDENTIFIED", "DEL", "MARXIST-LENINIST", "PROVINCIAL", "MEXICO", "AMERICAN", "BEFORE", "LIMA", "THROUGHOUT", "CESAR", "DECLARE", "CHIEF", "AREVALO", "WILL", "WHILE", "CIVILIAN", "THEMSELVES", "YOU", "UNDERSTANDING"));
				for (List<HasWord> sentence : dp){
					update_freq_count(freq_weapon, sentence, ans_weapon, ignore_weap, 108);
					update_freq_count(freq_vic, sentence, ans_vic, ignore_vic, 108);
					update_freq_count(freq_tar, sentence, ans_tar, ignore_tar, 108);
					update_freq_count(freq_org, sentence, ans_org, ignore_org, 108);
					update_freq_count(freq_indv, sentence, ans_indv, ignore_indv, 108);
				}


			}
		}

		//SAVE ALL THE THINGS
		HashMap<String, Double> prob_weapon=terrible_converter(freq_weapon, 0, 0);
		HashMap<String, Double> prob_vic=terrible_converter(freq_vic, 0, 0);
		HashMap<String, Double> prob_tar=terrible_converter(freq_tar, 0, 0);
		HashMap<String, Double> prob_org=terrible_converter(freq_org, 0, 0);
		HashMap<String, Double> prob_indv=terrible_converter(freq_indv, 0, 0);
    try {
      FileOutputStream fileOut = new FileOutputStream("./sentence_probs_adv/prob_weapon_adv.ser");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(prob_weapon);
      out.close();
      fileOut.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
		try {
      FileOutputStream fileOut = new FileOutputStream("./sentence_probs_adv/prob_vic_adv.ser");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(prob_vic);
      out.close();
      fileOut.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
		try {
			FileOutputStream fileOut = new FileOutputStream("./sentence_probs_adv/prob_tar_adv.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(prob_tar);
			out.close();
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileOutputStream fileOut = new FileOutputStream("./sentence_probs_adv/prob_org_adv.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(prob_org);
			out.close();
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileOutputStream fileOut = new FileOutputStream("./sentence_probs_adv/prob_indv_adv.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(prob_indv);
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

	private static void update_freq_count(HashMap<String, Freq_tuple> freq, List<HasWord> sentence, ArrayList<String[]> ans_, ArrayList<String> ignore_words, int range){

		String proper_case_ans="";
		for(String[] ans: ans_){
			boolean seq_found=false;
			int index_in_seq=0;
			int ans_start_loc=-1;
			int ans_end_loc=-1;
			int index=-1;
			for(HasWord word: sentence){
				index++;
				if(ans[index_in_seq].equals(word.word().toUpperCase())){
					proper_case_ans=proper_case_ans+" "+word.word();
					if(ans_start_loc==-1){
						ans_start_loc=index;
					}
					index_in_seq=index_in_seq+1;
					if(index_in_seq>=ans.length){
						ans_end_loc=index;
							seq_found=true;
							break;
					}
				}
				else if(ans[0].equals(word.word().toUpperCase())){
					proper_case_ans=word.word();
					ans_start_loc=index;
					index_in_seq=1;
					if(index_in_seq>=ans.length){
						ans_end_loc=index;
						seq_found=true;
						break;
					}
				}
				else{
					proper_case_ans="";
					ans_start_loc=-1;
					index_in_seq=0;
				}
			}
			index=-1;
			if(seq_found){
				/*
				for(HasWord word: sentence){
					index++;
					if(index<ans_start_loc){
						if(ignore_words.contains(word.word())){
							index--;
							ans_start_loc--;
							ans_end_loc--;
						}
					}
				}
				*/
				index=-1;
				for(HasWord word: sentence){
					index++;

					if(ignore_words.contains(word.word().toUpperCase())){

					}
					else{
						//index++;

						if(index<ans_start_loc && (index+range)>=ans_start_loc){
							if(freq.containsKey(word.word().toUpperCase())){
								freq.get(word.word().toUpperCase()).inc_both();
							}
							else{
								freq.put(word.word().toUpperCase(), new Freq_tuple(1, 1));
							}
						}
						else if(index>ans_end_loc && (index-range)<=ans_end_loc){
							if(freq.containsKey(word.word().toUpperCase())){
								freq.get(word.word().toUpperCase()).inc_both();
							}
							else{
								freq.put(word.word().toUpperCase(), new Freq_tuple(1, 1));
							}
						}
						else{
							if(freq.containsKey(word.word().toUpperCase())){
								freq.get(word.word().toUpperCase()).inc_de();
							}
							else{
								freq.put(word.word().toUpperCase(), new Freq_tuple(0, 1));
							}
						}
					}

				}
			}
			else{
				for(HasWord word: sentence){
					if(freq.containsKey(word.word().toUpperCase())){
						freq.get(word.word().toUpperCase()).inc_de();
					}
					else{
						freq.put(word.word().toUpperCase(), new Freq_tuple(0, 1));
					}
				}
				//return;
			}
		}
	}

}
