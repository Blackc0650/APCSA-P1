//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package labs.unit6;
import static java.lang.System.*;
public class Lab09f
{
	public static void main( String args[] )
	{
		LetterRemover letterRemover = new LetterRemover();
		letterRemover.setRemover("I am Sam I am", 'a');
		System.out.println(letterRemover);
		letterRemover.setRemover("fdnfesfsds", 'f');
		System.out.println(letterRemover);
		letterRemover.setRemover("qwertyqwertyqwertyqwerty", 'q');
		System.out.println(letterRemover);
	}
}