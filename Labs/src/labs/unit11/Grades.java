//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package labs.unit11;
import java.util.Arrays;
public class Grades {
    private double[] grades;
    public Grades() {
        setGrades("");
    }
    public Grades(String gradeList) {
        setGrades(gradeList);
    }
    public void setGrades(String gradeList) {
        String[] gradesString = gradeList.split(" ");
        grades = new double[gradesString.length - 2];
        int index = 0;
        for (String grade: gradesString) {
            if (index > 1) {
                grade = grade.trim();
                grades[index - 2] = Double.valueOf(grade);
            }
            index++;
        }
    }
    public void setGrade(int spot, double grade) {
    	grades[spot] = grade;
    }
    public double getSum() {
        double sum = 0.0;
        for(Double grade : grades) {
        	sum += grade;
        }
        return sum;
    }
    public double getLowGrade() {
    	Arrays.sort(grades);
        return grades[0];
    }
    public double getHighGrade() {
    	Arrays.sort(grades);
        return grades[grades.length - 1];
    }
    public int getNumGrades() {
        return grades.length;
    }
    public String toString() {
        String output = Arrays.toString(grades).replace('[', ' ').replace(']', ' ').trim();
        return output;
    }
}