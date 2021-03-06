package labs.unit14;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe {
	private char[][] mat;
	public TicTacToe() {
		mat = new char[0][0];
	}

	public TicTacToe(String game) {
		mat = new char[3][3];
		int count = 0,row = 0;
		for(char c : game.toCharArray()) {
			if(count % 3 == 0) {
				row++;
				count = 0;
			}
			mat[row - 1][count] = c;
			count++;
		}
	}
	public String getWinner() {
		for(char[] c : mat) {
			char first = '\u0000';
			int xcount = 0;
			for(char cc : c) {
				if(first != 'X' && first != 'O')
					first = cc;
				if(first == cc) {
					xcount++;
				}
			}
			if(xcount == 3) {
				return first + " is the winner! ~ horizontally";
			}
		}
		for (int i = 0; i < mat.length; i++) {
			char first = '\u0000';
			int xcount = 0;
			for (int j = 0; j < mat.length; j++) {
				if(first != 'X' && first != 'O')
					first = mat[j][i];
				if(first == mat[j][i]) {
					xcount++;
				}
			}
			if(xcount == 3) {
				return first + " is the winner! ~ vertically";
			}
		}
		if((mat[0][0] == mat[1][1]) && (mat[0][0]== mat[2][2])) {
			return mat[1][1] + " is the winner ~ diagonally";
		}
		if((mat[2][0] == mat[1][1]) && (mat[0][2] == mat[2][0])) {
			return mat[1][1] + " is the winner! ~ diagonally";
		}
		return "no winner!";
	}

	public String toString() {
		String output = getWinner();
		return output+"\n\n";
	}
}