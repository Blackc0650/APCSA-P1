package labs.unit12.lab18d;
public class Word implements Comparable<Word> {
    private String word;
    public Word(String s) {
    	word = s;
    }
    /**
     * @return 1 if the local objects length is greater than
     * the inputed one. <br> -1 if the inputed words length is
     * greater
     */
    public int compareTo(Word rhs) {
    	if(this.word.length() == rhs.word.length()) {
    		for (int i = 0; i < rhs.word.length(); i++) {
				char[] c = this.word.toCharArray();
				char[] otherC = rhs.word.toCharArray();
				if(c[i] != otherC[i]) {
					return c[i] > otherC[i] ? 1 : -1;
				}
			}
    	}
    	return rhs.word.length() < this.word.length() ? 1 : -1;
    }
    public String toString() {
        return word;
    }
}