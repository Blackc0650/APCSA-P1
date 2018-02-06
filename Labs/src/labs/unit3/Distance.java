package labs.unit3;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance(int xOne,int yOne, int xTwo, int yTwo) {
		this.xOne = xOne;
		this.yOne = yOne;
		this.xTwo = xTwo;
		this.yTwo = yTwo;
	}
	{



	}
	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		this.xOne = x1;
		this.yOne = y1;
		this.xTwo = x2;
		this.yTwo = y2;
	}

	public void calcDistance()
	{
		distance = Math.sqrt(Math.pow(xTwo - xOne, 2) + Math.pow(yTwo - yOne, 2));
	}

	public void print( )
	{
		System.out.println(String.format("The distance is %.3f", distance));
	}
}