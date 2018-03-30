package labs.unit13;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

import static java.lang.System.*;

public class NumberSort
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int tempNum = number;
		int length = 0;
		while((tempNum /= 10) > 0) {
			length++;
		}
		return length;
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted;
		int tempNum = number;
		int length = 0;
		while((tempNum /= 10) > 0) {
			length++;
		}
		sorted = new int[length];
		for (int i = 0; i < sorted.length; i++) {
			sorted[i] = (number %= 10);
			number /= 10;
		}
		ArrayList<Integer> ints = new ArrayList<Integer>();
		for (int i = 0; i < sorted.length; i++) {
			int least = -1;
			for (int j = 0; j < sorted.length; j++) {
				System.out.println(least);
				if(least == -1) {
					least = sorted[j];
				}
				if(least > sorted[j]) {
					if(ints.contains(least)) {
						least = sorted[j];	
					}
				}
			}
			ints.add(least);
		}
		for (int i = 0; i < sorted.length; i++) {
			sorted[i] = ints.get(i);
		}
		return sorted;
	}
}