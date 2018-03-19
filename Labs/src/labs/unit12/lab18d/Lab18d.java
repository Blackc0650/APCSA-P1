package labs.unit12.lab18d;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Lab18d
{
	public static void main(String args[]) throws IOException
	{
		Scanner file = new Scanner(new File(getSimplePath("lab18d.dat")));
		ArrayList<Word> lines = new ArrayList<Word>();
		ArrayList<Word> sorted = new ArrayList<Word>();
		while(file.hasNext()) {
			lines.add(new Word(file.next()));
		}
		int linesSize = lines.size();
		while(linesSize != sorted.size()) {
			Word less = lines.get(lines.size() - 1);
			for(Word s : lines) {
				if(less.compareTo(s) == 1) {
					less = s;
				}
			}
			sorted.add(less);
			lines.remove(less);
		}
		System.out.println(Arrays.toString(sorted.toArray()).replace('[', ' ')
				.replace(']', ' ').trim().replaceAll(",", "\n"));
	}
	private static String getSimplePath(String path) {
		String outerPath = Lab18d.class.getProtectionDomain().getCodeSource().getLocation().getFile();
		outerPath = outerPath.substring(0, outerPath.length() - 4);
		outerPath += "src/";
		outerPath += Lab18d.class.getPackage().getName().replace('.', '/');
		return outerPath + "/" + path;
	}
}