javac -cp ".;./stanford-corenlp-3.8.0.jar";".;./stanford-corenlp-3.8.0-models.jar" Winnow.java
javac -cp ".;./stanford-corenlp-3.8.0.jar";".;./stanford-corenlp-3.8.0-models.jar" Infoextract.java
java -cp ".;./stanford-corenlp-3.8.0.jar";".;./stanford-corenlp-3.8.0-models.jar" Infoextract input.txt
echo potato