//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package labs.unit8;

import java.util.Arrays;

public class Grades
{
	private int[] grades;
	public Grades(int[] grades) {
		this.grades = grades;
	}
	private double getSum()
	{
		double sum=0.0;
		for(int g : grades) {
			sum+=g;
		}
		return sum;
	}

	public double getAverage()
	{
		return getSum() / grades.length;
	}
	public int[] getGrades() {
		return grades;
	}
	public void setGrades(int[] grades) {
		this.grades = grades;
	}
	public void setGrades(String[] grades) {
		int[] gradez = new int[grades.length];
		for (int i = 0; i < grades.length; i++) {
			gradez[i] = Integer.parseInt(grades[i]);
		}
		this.grades = gradez;
	}
	public String toString() {
		Arrays.sort(grades);
		return "average = " + getAverage() + "\n" + "This way your inputted array " + grades;
	}
}