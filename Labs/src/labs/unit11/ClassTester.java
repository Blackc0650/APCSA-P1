//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package labs.unit11;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ClassTester
{
   public static void main( String args[] )
   {
		Class test = new Class("Comp Sci 1",3);
		test.addStudent(0,new Student("Jimmy","4 - 100 90 80 60"));
		test.addStudent(1,new Student("Sandy","4 - 100 100 80 70"));
		test.addStudent(2,new Student("Fred","4 - 50 50 70 68"));
		PrintStream out = System.out;
		out.println(test);
		
		out.println(String.format(test.getStudentName(0) + "\'s average = %.2f",test.getStudentAverage(0)));	
		out.println(String.format(test.getStudentName(1) + "\'s average = %.2f",test.getStudentAverage(1)));	
		out.println(String.format(test.getStudentName(2) + "\'s average %.2f",test.getStudentAverage(2)));	
		
		out.println(String.format("Sandy" + "\'s average %.2f",test.getStudentAverage("Sandy")));	

		out.println("Failure List = " + test.getFailureList(70));	
		out.println("Highest Average = " + test.getStudentWithHighestAverage());
		out.println("Lowest Average = " + test.getStudentWithLowestAverage());
								
		out.println(String.format("Class Average = %.2f",test.getClassAverage()));
		doFileThing();
	}
   public static void doFileThing() {
	   ArrayList<String> lines = new ArrayList<String>();
	   try {
		BufferedReader br = new BufferedReader(new FileReader(new File(getSimplePath("gradebook.dat"))));
		String nextLine;
		while((nextLine = br.readLine()) != null) {
			lines.add(nextLine);
		}
		br.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	   Class test2 = new Class(lines.get(0),Integer.valueOf(lines.get(1)));
	   int index = 2;
	   int secondindexx = 0;
	   while(index <= (lines.size() - 1)) {
		   Student s = new Student(lines.get(index),lines.get(index + 1));
		   test2.addStudent(secondindexx++,s);
		   index+= 2;
	   }
	   System.out.println("Failure List: " + test2.getFailureList(69));
	   System.out.println("High Average: " + test2.getStudentWithHighestAverage());
	   System.out.println("Low Average: " + test2.getStudentWithLowestAverage());
	   System.out.println("Class Average: " + test2.getClassAverage());
   }
   private static String getSimplePath(String path) {
		String outerPath = ClassTester.class.getProtectionDomain().getCodeSource().getLocation().getFile();
		outerPath = outerPath.substring(0, outerPath.length() - 4);
		outerPath += "src/";
		outerPath += ClassTester.class.getPackage().getName().replace('.', '/');
		return outerPath + "/" + path;
	}
}