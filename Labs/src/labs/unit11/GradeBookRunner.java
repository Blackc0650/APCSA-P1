//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package labs.unit11;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradeBookRunner
{
   //THE MAIN BULK OF CODE FOR GRADEBOOK5 IS LOCATED IN
	//ClassTeser
   public static void main( String args[] )
   {
	   //Extension 2 GradeBook 6
	    ArrayList<Class> classes = new ArrayList<Class>();
		out.println("Welcome to the Class Stats program!");
		Scanner keyboard = new Scanner(System.in);
		Class test = new Class("Comp Sci 1",3);
		test.addStudent(0,new Student("Jimmy","4 - 100 90 80 60"));
		test.addStudent(1,new Student("Sandy","4 - 100 100 80 70"));
		test.addStudent(2,new Student("Fred","4 - 50 50 70 68"));
		classes.add(test);
		for(Class c : classes) {
			System.out.println("AVG:" + c.getClassAverage());
			System.out.println("LOW:" + c.getFailureList(70));
		}
		

		



















	}		
}