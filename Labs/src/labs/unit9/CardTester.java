package labs.unit9;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card a = new Card("?","hearts",4);
		Card b = new Card("?","hearts",4);
		Card c = new Card("?","clubs",5);
		System.out.println(a.matches(b));
		System.out.println(c.pointValue() + " : " + a.rank() + " : " + b.suit());
	}
}
