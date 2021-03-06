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
		String[] ss = {"Griaffes","Lions","Snakes","RobustPenguins"};
		String[] rr = {"A","B","C","D"};
		int[] pp = {1,2,3,4,5,6,7,8,9,10};
		d = new Deck(rr,ss,pp);
		System.out.println(d);
		String[] sss = {"Griaffes","Lions","Snakes","RobustPenguins","SlipperySnakes","HyperActiveDog"};
		String[] rrr = {"A","B","C","D","Z","U"};
		int[] ppp = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		d = new Deck(rrr,sss,ppp);
		d.shuffle();
		System.out.println(d);
	}
}
