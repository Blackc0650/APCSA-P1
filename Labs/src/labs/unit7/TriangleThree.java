//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package labs.unit7;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		size = 0;
		letter = "";
	}

	public TriangleThree(int count, String let)
	{
		size = count;
		letter = let;
	}

	public void setTriangle( String let, int sz )
	{
		size = sz;
		letter = let;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output="";
		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				output += " ";
			}
			for (int j = size - i; j < size; j++) {
				output += letter;
			}
			output+="\n";
		}
		return output+"\n";
	}
}