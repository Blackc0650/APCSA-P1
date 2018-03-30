package labs.unit13;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.System.*;

class InsertionSort
{
	private ArrayList<String> list;

	public InsertionSort() {
		list = new ArrayList<String>();
	}
	//modfiers
	public void add( String  word)
	{
		int loc = Collections.binarySearch(list, word);
		list.add(Math.abs((loc+1)), word);
	}


	public void remove(String word) {
		list.remove(word);
	}

	public String toString()
	{
		return Arrays.toString(list.toArray()).replace('[',' ').replace(']', ' ').trim();
	}
}