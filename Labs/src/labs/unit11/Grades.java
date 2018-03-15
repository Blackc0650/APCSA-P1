//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package labs.unit11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Grades {
    private ArrayList<Double> grades;
    public Grades() {
        setGrades("");
    }
    public Grades(String gradeList) {
        setGrades(gradeList);
    }
    public void setGrades(String gradeList) {
        String[] gradesString = gradeList.split(" ");
        grades = new ArrayList<Double>();
        int index = 0;
        for (String grade: gradesString) {
            if (index > 1) {
                grade = grade.trim();
                grades.add(index - 2,Double.valueOf(grade));
            }
            index++;
        }
    }
    public void setGrade(int spot, double grade) {
    	grades.set(spot, grade);;
    }
    public double getSum() {
        double sum = 0.0;
        for(Double grade : grades) {
        	sum += grade;
        }
        return sum;
    }
    public double getLowGrade() {
    	Collections.sort(grades);
        return grades.get(0);
    }
    public double getHighGrade() {
    	Collections.sort(grades);
        return grades.get(grades.size() - 1);
    }
    public int getNumGrades() {
        return grades.size();
    }
    public String toString() {
        String output = Arrays.toString(grades.toArray()).replace('[', ' ').replace(']', ' ').trim();
        return output;
    }
}