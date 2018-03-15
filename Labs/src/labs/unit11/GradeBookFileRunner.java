//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package labs.unit11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;
import static java.util.Arrays.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		//Scanner file = new Scanner(new File("gradebook.dat"));
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