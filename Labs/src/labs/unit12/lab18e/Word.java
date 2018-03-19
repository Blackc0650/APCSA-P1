package labs.unit12.lab18e;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Word implements Comparable<Word> {
    private String word;
    public Word(String s) {
    	word = s;
    }
    private int numVowels() {
        String vowels = "aeiou";
        int vowelCount = 0;
        for (char c: word.toCharArray()) {
            for (char vowelC: vowels.toCharArray()) {
                if (String.valueOf(c).equalsIgnoreCase(String.valueOf(vowelC))) {
                    vowelCount++;
                }
            }
        }
        return vowelCount;
    }
    public int compareTo(Word rhs) {
    	if(this.numVowels() == rhs.numVowels()) {
    		for (int i = 0; i < rhs.word.length(); i++) {
				char[] c = this.word.toCharArray();
				char[] otherC = rhs.word.toCharArray();
				if(c[i] != otherC[i]) {
					return c[i] > otherC[i] ? 1 : -1;
				}
			}
    	}
    	return rhs.numVowels() < this.numVowels() ? 1 : -1;
    }
    public String toString() {
        return word;
    }
}