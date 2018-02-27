package labs.unit9;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] s = {"Griaffes","Lions"};
		String[] r = {"A","B","C"};
		int[] p = {2,1,6};
		Deck d = new Deck(r,s,p);
		System.out.println(d);
		//TODO: FIX!
	}
}
