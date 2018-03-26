package labs.unit14;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;
   private boolean[][] locationsVisited;
	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
		locationsVisited = new boolean[atMat.length][atMat.length];
	}

	public int countAts(int r, int c)
	{
		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
		if(r > -1 && c > -1 && r < atMat.length && c < atMat.length && atMat[r][c] == '@') {
			if(locationsVisited[r][c] != true) {
				locationsVisited[r][c] = true;
				atCount++;
				atCount = countAts(r - 1,c);
				atCount = countAts(r + 1,c);
				atCount = countAts(r,c - 1);
				atCount = countAts(r,c + 1);
			}
		}
		return atCount;
	}

	public int getAtCount()
	{
		int atCountRetr_ = atCount;
		atCount = 0;
		return atCountRetr_;
	}

	public String toString()
	{
		String output="";
		output+=getAtCount()+" @s connected.";
		return output;
	}
}