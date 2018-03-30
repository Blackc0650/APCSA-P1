package labs.unit13;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import static java.lang.System.*;

import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort
{
	private static int passCount;

	public static void quickSort(Comparable[] comparables)
	{
		passCount = 0;
		quickSort(comparables,0, comparables.length-1);
	}
	private static void quickSort(Comparable[] list, int low, int high)
	{
		if(low < high) {
			int place = partition(list, low, high);
			quickSort(list, low, place);
			quickSort(list, place + 1, high);
		}
	}


	@SuppressWarnings("unchecked")
	private static int partition(Comparable[] list, int low, int high)
	{
		Comparable<?> pivot = list[low];
		int bot = low - 1;
		int top = high + 1;
		while(bot < top) {
			passCount++;
			System.out.println("pass " + passCount + " " + Arrays.toString(list));
			while(list[--top].compareTo(pivot) > 0);
			while(list[++bot].compareTo(pivot) < 0);
			if(bot >= top) {
				return top;
			}
			Comparable<?> t = list[bot];
			list[bot] = list[top];
			list[top] = t;
		}
		return -1;
	}
}