//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package labs.unit6;
import static java.lang.System.*;
import java.lang.Math;
import java.util.Scanner;

public class Lab08i
{
	public static void main ( String[] args )
	{
		Prime p = new Prime();
		Scanner sc = new Scanner(System.in);
		int x = 0;
		while(x < 5) {
			p.setPrime(sc.nextInt());
			System.out.println(p);
		}
		sc.close();
	}	
}