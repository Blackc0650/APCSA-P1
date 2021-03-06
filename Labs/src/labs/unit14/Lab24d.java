package labs.unit14;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24d {
	public static void main( String args[] ) throws IOException {
		Scanner file = new Scanner (new File(getSimplePath("Lab24d.dat")));
		TicTacToe ticTacToe;
		String line = "";
		while(file.hasNext()) {
			if(!Character.isDigit(((line = file.next()).charAt(0)))) {
				ticTacToe = new TicTacToe(line);
				System.out.println(ticTacToe);
			}
		}
		file.close();
	}
	private static String getSimplePath(String path) {
		String outerPath = Lab21i.class.getProtectionDomain().getCodeSource().getLocation().getFile();
		outerPath = outerPath.substring(0, outerPath.length() - 4);
		outerPath += "src/";
		outerPath += Lab21i.class.getPackage().getName().replace('.', '/');
		return outerPath + "/" + path;
	}
}