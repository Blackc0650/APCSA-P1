//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package labs.unit7;
import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private int guesses,randnum;

	public GuessingGame(int stop)
	{
		upperBound = stop;
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		int rand = new Random().nextInt(upperBound) + 1;
		int value = upperBound + 100;
		int count = 0;
		while(value != rand) {
			System.out.println("Guess a num bewteen 1 and " + upperBound);
			value = keyboard.nextInt();
			if(value != rand)
				count++;
		}
		guesses = count;
		randnum = rand;





	}

	public String toString()
	{
		String output="It took " + (int)(guesses + 1) + " to guess " + randnum + "\n you guessed wrong " + (int)(((double) (guesses + 1) / upperBound) * 100) + " percent of the time";
		
		return output;
	}
}