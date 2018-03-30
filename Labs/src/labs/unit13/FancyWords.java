package labs.unit13;

import java.util.ArrayList;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class FancyWords {
	private String[] wordRay;

	public FancyWords(String sentence) {
		wordRay = new String[sentence.split(" ").length];
		int index = 0;
		for(String word : sentence.split(" ")) {
			wordRay[index++] = word;
		}
		int index2 = 0;
		for(String word : wordRay) {
			wordRay[index2++] = new StringBuilder(word).reverse().toString();
		}
	}
	public void setWords(String sentence) {
		wordRay = new String[sentence.split(" ").length];
		int index = 0;
		for(String word : sentence.split(" ")) {
			wordRay[index++] = word;
		}
		int index2 = 0;
		for(String word : wordRay) {
			wordRay[index2++] = new StringBuilder(word).reverse().toString();
		}
	}
	public String toString() {
		String output="";
		for (int i = 0; i < wordRay.length; i++) {
			for (int j = 0; j < wordRay[i].length(); j++) {
				wordRay[i] = wordRay[j].substring(j, j + 1);
			}
			output += wordRay[i];
			output += "\n";
		}
		return output+"\n\n";
	}
}