package labs.unit14;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Lab21i {
	private static Maze m;
	public static void main( String args[] ) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File(getSimplePath("lab21i.dat"))));
		String nextLine;
		while((nextLine = br.readLine()) != null) {
			int size = Integer.valueOf(nextLine);
			String maze = (nextLine = br.readLine()) != null ? nextLine : "null";
			if(maze == "null")
				break;
			m = new Maze(size,maze.replaceAll(" ",""));
			System.out.println(m);
		}
	}
	private static String getSimplePath(String path) {
		String outerPath = Lab21i.class.getProtectionDomain().getCodeSource().getLocation().getFile();
		outerPath = outerPath.substring(0, outerPath.length() - 4);
		outerPath += "src/";
		outerPath += Lab21i.class.getPackage().getName().replace('.', '/');
		return outerPath + "/" + path;
	}
}