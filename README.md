TEAM: Rowdy Raccoons
MEMBERS: Jacob Luke, Bernard Serbinowski

NLP Projct Final Evaluation

1. 	We made extensive use of Stanford's CoreNLP library, available here: https://stanfordnlp.github.io/CoreNLP/download.html
	We used this library to do POS tagging, constituency parsing, true casing, and some NER work
	The following files came from this library:
		Everything in the edu folder
		Everything in the META-INF folder
		any file starting with the word english
		-english-left3words-distsim.tagger
		-englishPCFG.ser
		-stanford-corenlp-3.8.0.jar
	We also made use of stanfordNLP's models library
	Every other file was either given to us on Canvas or was otherwise made by us


2. 	Running our program on testset1-input.txt usually took 20-30 minutes each time we ran it.

3.	Bernard Serbinowski : set up the winnow stuff (depricated and removed), did a lot of work setting up the NLP library, and also wrote the code to generate feature vectors (depricated),
wrote a general strategy for getting some vague notions of probability. this was then adapted to select sentences that were most likely to contain an important phrase, select nounphrases from above mentioned sentences, and pick out an incident. Modified various output schemas. Got NER libraries working only to discover that there was no useful way to implement in the remaining time.

	Jacob Luke: also did a lot of work getting and setting up the NLP library, also wrote a lot of the code that uses the winnows to train 	the data, also wrote various documentation files, set up the pipeline to do true casing, did numerous output and formatting checks/fixes, among other things

4.	So our system has a number of limitations. As of submission we were only getting around .34 when we test it out. Our approach was to focus on getting high recall and then selectively prune down the results until we had a good mix of recall and precision. It should run just fine, though. We don't anticipate any console errors, even if it will take a while to run. Sadly we were also fairly defeated by the legendary "that's totally the same thing but we didn't actually output that one excactly oh darn".

The script infoextract should run the program for you. The console command should be formatted as:
./infoextract Input.txt

The batch files "run_project.bat" "test_project.bat" and "run_winnow_trainer.bat" are for our benefit for developing on non-linux systems and shouldn't be run
