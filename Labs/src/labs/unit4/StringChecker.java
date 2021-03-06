//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package labs.unit4;

public class StringChecker {
	private String word;
	public StringChecker() {word = "";}
	public StringChecker(String s) {
		word = s;
	}
	public void setString(String s) {
		word = s;
	}
	public boolean findLetter(char c) {
		return word.indexOf(c) > -1;
	}
	public boolean findSubString(String s) {
		//Satisfys the tip of using an if-statement although a 
		//simpler way would to be to return word.contains(s)
		if(word.contains(s)) {
			return true;
		}
		return false;
	}
	public String toString() {
		return word + "\n\n";
	}
}