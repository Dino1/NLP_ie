javac -cp ".;./stanford-corenlp-3.8.0.jar" Winnow.java
javac -cp ".;./stanford-corenlp-3.8.0.jar" Infoextract.java
java -cp ".;./stanford-corenlp-3.8.0.jar" Infoextract input.txt
echo potato