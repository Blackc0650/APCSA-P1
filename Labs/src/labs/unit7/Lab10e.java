//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package labs.unit7;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		GuessingGame guessingGame;
		Scanner keyboard = new Scanner(System.in);
		char response = 'y';
		//TODOwhile(response != 'n') {
			
			//TODO guessingGame = new guessingGame();
		while(response != 'n') {
			System.out.println("How many nums?");
			guessingGame = new GuessingGame(keyboard.nextInt());
			guessingGame.playGame();
			System.out.println(guessingGame);
			System.out.println("Do you want to play again");
			response = keyboard.next().charAt(0);
		}
	}





}
//}