TEAM: Rowdy Raccoons
MEMBERS: Jacob Luke, Bernard Serbinowski

NLP Projct Midpoint Evaluation

1. 	We made extensive use of Stanford's CoreNLP library, available here: https://stanfordnlp.github.io/CoreNLP/download.html
	We used this library to do POS tagging, constituency parsing, true casing, and some NER work
	The following files came from this library:
		-english-left3words-distsim.tagger
		-englishPCFG.ser
		-stanford-corenlp-3.8.0.jar
	We also made use of stanfordNLP's models library	
	Every other file was either given to us on Canvas or was otherwise made by us


2. 	Running our program on testset1-input.txt usually took 20-30 minutes each time we ran it.

3.	Bernard Serbinowski : set up the winnow stuff, did a lot of work setting up the NLP library, and also wrote the code to generate feature vectors, did a lot of work on probabilistic selecting for sentences, worked on improving the incident selection,  did a crap ton of other things too many to list all

	Jacob Luke: also did a lot of work getting and setting up the NLP library, also wrote a lot of the code that uses the winnows to train 	the data, also wrote various documentation files, set up the pipeline to do true casing, did numerous output and formatting checks/fixes, among other things

4.	So our system has a number of limitations. As of submission we were only getting around .34 when we test it out. Our approach was to focus on getting high recall and then selectively prune down the results until we had a good mix of recall and precision. It should run just fine, though. We don't anticipate any console errors, even if it will take a while to run.

The script infoextract should run the program for you. The console command should be formatted as:
./infoextract Input.txt

The batch files "run_project.bat" "test_project.bat" and "run_winnow_trainer.bat" are for our benefit for developing on non-linux systems and shouldn't be run

	
