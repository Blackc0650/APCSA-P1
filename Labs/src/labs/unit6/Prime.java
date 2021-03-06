//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package labs.unit6;
import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	public Prime()
	{
		number = 0;
	}

	public Prime(int num)
	{
		number = num;
	}

	public void setPrime(int num)
	{
		number = num;
	}

	public boolean isPrime()
	{
		if(number == 4) {
			return true;
		}
		for (int i = 2; i < Math.sqrt(number); i++) {
			int estimate = number / i;
			double real = (double) number / i;
			if(estimate == real) {
				return true;
			}
		}
		return false;
	}

	public String toString()
	{
		String output = number + (isPrime() ? " is not prime" : " is prime");
		return output;
	}
}