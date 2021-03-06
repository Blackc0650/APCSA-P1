//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
package labs.unit10.Lab16d;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	private Random random;
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		random = new Random();
	}

	public MadLib(String fileName)
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		random = new Random();
		loadNouns();
		loadVerbs();
		loadAdjectives();
		try{
			Scanner file = new Scanner(new File(getSimplePath(fileName)));
			String toPrintToConsole = "";
			while(file.hasNext()) {
				String next = file.next();
				//noun
				if(next.equals("#")) {
					next = getRandomNoun();
				}
				//verb
				else if(next.equals("@")) {
					next = getRandomVerb();
				}
				//adjective
				else if(next.equals("&")) {
					next = getRandomAdjective();
				}
				toPrintToConsole += next + " ";
			}
			file.close();
			System.out.println(toPrintToConsole);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			out.println("Houston we have a problem!");
		}	
	}
	public void loadNouns()
	{
		try{
			Scanner sc = new Scanner(new File(getSimplePath("nouns.dat")));
			while(sc.hasNext()) {
				String next = sc.next();
				nouns.add(next);
			}
			sc.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	public void loadVerbs()
	{
		try{
			Scanner sc = new Scanner(new File(getSimplePath("verbs.dat")));
			while(sc.hasNext()) {
				String next = sc.next();
				verbs.add(next);
			}
			sc.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void loadAdjectives()
	{
		try{
			Scanner sc = new Scanner(new File(getSimplePath("adjectives.dat")));
			while(sc.hasNext()) {
				String next = sc.next();
				adjectives.add(next);
			}
			sc.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public String getRandomVerb()
	{
		return verbs.get(random.nextInt(verbs.size()));
	}
	
	public String getRandomNoun()
	{
		return nouns.get(random.nextInt(nouns.size()));
	}
	
	public String getRandomAdjective()
	{
		return adjectives.get(random.nextInt(adjectives.size()));
	}		
	public String toString()
	{
	   return "\n\n\n";
	}
	/*private ArrayList<String> loadFileToArrayList(String type) throws IOException {
		String path = type;
		ArrayList<String> arrayData = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader(new File(path)));
		String nextLine;
		while((nextLine = br.readLine()) != null) {
			arrayData.add(nextLine);
		}
		br.close();
		return arrayData;
	}*/
	private String getSimplePath(String path) {
		String outerPath = this.getClass().getProtectionDomain().getCodeSource().getLocation().getFile();
		outerPath = outerPath.substring(0, outerPath.length() - 4);
		outerPath += "src/";
		outerPath += this.getClass().getPackage().getName().replace('.', '/');
		return outerPath + "/" + path;
	}
}