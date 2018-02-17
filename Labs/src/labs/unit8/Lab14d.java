//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package labs.unit8;

import java.util.Scanner;

public class Lab14d
{
	public static void main( String args[] )
	{
		Grades grades = new Grades(null);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an array of values! seperate each number by using commas!");
		grades.setGrades(sc.next().replace(" ", "").replaceAll("[^\\d.]", "").split(","));
		System.out.println(grades);
		
	}
}