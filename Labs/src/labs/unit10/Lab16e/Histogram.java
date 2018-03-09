//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package labs.unit10.Lab16e;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;
/**
 * Used a FileReader instead of a Scanner to test new things :)!
 * @author CameronBlack
 *
 */
public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
		fileName = "";
	}

	public Histogram(char[] values, String fName)
	{
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
		String path = this.getClass().getProtectionDomain().getCodeSource().getLocation().getFile();
		path = path.substring(0,path.length() - 4);
		path += "/src/";
		path += this.getClass().getName().replace('.', '/');
		fileName = path.substring(0, path.length() - 9);
		fileName += fName;
		for(char c : values) {
			letters.add(c);
		}
		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		File f = new File(fileName);
		FileReader fr = new FileReader(f);
		char next = '\u0000';
		while((next = (char) fr.read()) < 10000) {
			int index = letters.indexOf(next);
			if(index != -1) {
				if(count.size() > index) {
					if(count.get(letters.indexOf(next)) != -1) {
						count.set(index, count.get(index) + 1);
					}
				}
				else {
					if(count.size() < index) {
						for (int i = 0; i < letters.size() -1; i++) {
							count.add(0);
						}
					}
					try{count.add(index, 1);}catch(Exception e){System.out.println(count.size() + "!");};
				}
			}
		}
		fr.close();		
	}
	public char mostFrequent()
	{
		int[] sort = new int[count.size()];
		int index = 0;
		for(int y : count) {
			sort[index++] = y;
		}
		Arrays.sort(sort);
		int index2 = count.indexOf(sort[sort.length - 1]);
		return letters.get(index2);
	}

	public char leastFrequent()
	{
		int[] sort = new int[count.size()];
		int index = 0;
		for(int y : count) {
			sort[index++] = y;
		}
		Arrays.sort(sort);
		int index2 = count.indexOf(sort[0]);
		return letters.get(index2);
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}