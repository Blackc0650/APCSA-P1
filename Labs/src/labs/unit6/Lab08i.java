//© A+ Computer Science  -  www.apluscompsci.com
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
		System.out.println("Enter a number!");
		p.setPrime(sc.nextInt());
		System.out.println(p);
		sc.close();
		p.setPrime(24);
		System.out.println(p);
		p.setPrime(7);
		System.out.println(p);
		p.setPrime(100);
		System.out.println(p);
		p.setPrime(113);
		System.out.println(p);
		p.setPrime(65535);
		System.out.println(p);
		p.setPrime(2);
		System.out.println(p);
		p.setPrime(7334);
		System.out.println(p);
		p.setPrime(7919);
		System.out.println(p);
		p.setPrime(1115125003);
		System.out.println(p);
	}	
}