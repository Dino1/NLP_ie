TEAM: Rowdy Raccoons
MEMBERS: Jacob Luke, Bernard Serbinowski

NLP Projct Midpoint Evaluation

1. 	We made extensive use of Stanford's CoreNLP library, available here: https://stanfordnlp.github.io/CoreNLP/download.html
	We used this library to do POS tagging for words and for constituency parsing to give us all the noun phrases in our input.
	The following files came from this library:
		-english-left3words-distsim.tagger
		-englishPCFG.ser
		-stanford-corenlp-3.8.0.jar
	
	Every other file was either given to us on Canvas or was otherwise made by us


2. 	Running our program on "input.txt" (which is in the folder) took about a minute to complete

3.	Bernard Serbinowski : the Winnow.java in the folder was programmed by him in a previous ML course. He also got the winnow_training 	working, did a lot of work setting up the NLP library, and also wrote the code to generate feature vectors, among other things

	Jacob Luke: also did a lot of work getting and setting up the NLP library, also wrote a lot of the code that uses the winnows to train 	the data, also wrote various documentation files, among other things

4.	Well, the main breakthrough at this point is having all these libraries and systems working together. Our predictions aren't too 	accurate. For incidents, we're always predicting "attack" which seems to work in a majority of cases, but we'll obviously work on 	better solutions in the future. We're also only using winnows at this point with fairly basic feature vectors but we plan to integrate 	other ML algorithms to use on our system.


The script "run_project.bat" should compile and run the code just fine.

	