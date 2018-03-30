package labs.unit13;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;

import labs.unit14.Lab21i;
import static java.lang.System.*;

public class Lab15d {
	public static void main( String args[] ) throws IOException {
		Scanner sc = new Scanner(new File(getSimplePath("lab15d.dat")));
		String sentence = "";
		while(sc.hasNext()) {
			String next = sc.next();
			if(!Character.isDigit(next.charAt(0))) {
				sentence += next + " ";
			}
		}
		sentence.trim();
		FancyWords fancyWords = new FancyWords(sentence);
		System.out.println(fancyWords);
	}
	private static String getSimplePath(String path) {
		String outerPath = Lab15d.class.getProtectionDomain().getCodeSource().getLocation().getFile();
		outerPath = outerPath.substring(0, outerPath.length() - 4);
		outerPath += "src/";
		outerPath += Lab15d.class.getPackage().getName().replace('.', '/');
		return outerPath + "/" + path;
	}
}