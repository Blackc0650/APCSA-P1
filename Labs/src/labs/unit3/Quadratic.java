package labs.unit3;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{

	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;

	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
 	}

	public void calcRoots( )
	{
		//1 5 6
		rootOne = (double)(-1 * b) - Math.sqrt((Math.pow(b, 2) - 4 * a * c));
		rootOne /= 2 * a;
		rootTwo = (double)(-1 * b) + Math.sqrt((Math.pow(b, 2) - 4 * a * c));
		rootTwo /= 2 * a;
		//System.out.println(rootOne);

	}

	public void print( )
	{
		System.out.println(String.format("Root one is %.3f", rootOne));
		System.out.println(String.format("Root two is %.3f", rootTwo));

	}
}