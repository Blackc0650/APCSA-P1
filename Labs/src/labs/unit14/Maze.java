package labs.unit14;
public class Maze {
    private int[][] maze;
    private int steps;
    private boolean found = false;
    public Maze() {
    	maze = new int[0][0];
    }
    public Maze(int size, String line) {
    	maze = new int[size][size];
    	for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze.length; j++) {
				//System.out.println((line.toCharArray()[(i * maze.length) + j]));
				maze[i][j] = Integer.valueOf(String.valueOf((line.toCharArray()[(i * maze.length) + j])));
			}
		}
    	steps = 0;
    }
    /**
     * Lab assumes that r and c are initially equal to 0
     * @param r
     * @param c
     * @return
     */
    private void hasExitPathRaw(int r, int c) {
    	if(!((r > -1 && r < (maze.length)) && (c > -1 && c < (maze.length)))) {
    		r = 0;
    		c = 0;
    	}
    	if(c == maze.length - 1) {
    		found = true;
    	}
    	if(maze[r][c] == 1) {
    		final boolean UP = maze[r + 1 < maze.length ? r + 1 : r][c] == 0;
    		final boolean DOWN = maze[r - 1 > 0 ? r - 1 : r][c] == 0;
    		final boolean RIGHT = maze[r][c + 1 < maze.length ? c + 1 : c] == 0;
    		final boolean LEFT = maze[r][c - 1 > 0 ? c - 1 : c] == 0;
    		if((UP && DOWN && RIGHT) || (UP && DOWN && LEFT) || (UP && RIGHT && LEFT) || (DOWN && RIGHT && LEFT)) {
    			steps -= 1;
    			return;
    		}
    		maze[r][c] = -1;
    		if(!UP) {
    			hasExitPath(r + 1, c);
    		}
    		if(!DOWN) {
    			hasExitPath(r - 1, c);
    		}
    		if(!RIGHT) {
    			hasExitPath(r, c + 1);
    		}
    		if(!LEFT) {
    			hasExitPath(r, c - 1);
    		}
    		steps++;
    	}
    	found = found == true ? true : false;
    }
    public boolean hasExitPath(int r,int c) {
    	hasExitPathRaw(r, c);
    	return found;
    }
    public String toString() {
        String output = hasExitPath(0,0) == true ? "exit found " + "shortest path = " + steps : "exit not found";
        for(int[] i : maze) {
        	String line = "";
        	for(int x : i) {
        		if(x == -1) {
        			line += "P ";
        		}
        		else {
        			line += "0 ";
        		}
        	}
        	System.out.println(line);
        }
        return output;
    }
}