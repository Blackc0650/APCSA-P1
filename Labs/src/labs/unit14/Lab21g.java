package labs.unit14;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab21g
{
	public static void main(String args[])
	{
		//instantiate an AtCounter
		AtCounter atCounter = new AtCounter();
		atCounter.countAts(0,0);
		System.out.println(atCounter);
		atCounter.countAts(2,5);
		System.out.println(atCounter);
		atCounter.countAts(5,0);
		System.out.println(atCounter);
		atCounter.countAts(9,9);
		System.out.println(atCounter);
		atCounter.countAts(3,9);
		System.out.println(atCounter);
		//test the code
	}
}