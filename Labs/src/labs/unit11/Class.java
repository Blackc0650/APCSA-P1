//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package labs.unit11;

import java.util.ArrayList;
import java.util.Arrays;

public class Class {
    private String name;
    private Student[] studentList;

    public Class() {
        name = "";
        studentList = new Student[0];
    }
    public Class(String name, int stuCount) {
    	this.name = name;
    	studentList = new Student[stuCount];
    }
    public void addStudent(int stuNum, Student s) {
    	studentList[stuNum] = s;
    }
    public String getClassName() {
        return name;
    }
    public double getClassAverage() {
        double avg = 0;
        for(Student s : studentList) {
        	avg += s.getAverage();
        }
        return ((double)avg / studentList.length);
    }
    public double getStudentAverage(int stuNum) {
        return studentList[stuNum].getAverage();
    }
    public double getStudentAverage(String stuName) {
        for(Student s : studentList) {
        	if(s.getName().equals(stuName)) {
        		return s.getAverage();
        	}
        }
        return 0;
    }
    public String getStudentName(int stuNum) {
    	return studentList[stuNum].getName();
    }
    public String getStudentWithHighestAverage() {
        /*double[] highAverage = new double[studentList.length];
        int index = 0;
        for(Student s : studentList) {
        	highAverage[index++] = s.getAverage();
        }
        Arrays.sort(highAverage);
        String name = "";
        for(Student s : studentList) {
        	if(s.getAverage() == highAverage[highAverage.length - 1]) {
        		name = s.getName();
        		break;
        	}
        }
        return name;*/
    	Student highest = studentList[0];
    	for(Student s : studentList) {
    		if(s.compareTo(highest) == 1) {
    			highest = s;
    		}
    	}
    	return highest.getName();
    }
    public String getStudentWithLowestAverage() {
    	/*double[] highAverage = new double[studentList.length];
        int index = 0;
        for(Student s : studentList) {
        	highAverage[index++] = s.getAverage();
        }
        Arrays.sort(highAverage);
        String name = "";
        for(Student s : studentList) {
        	if(s.getAverage() == highAverage[0]) {
        		name = s.getName();
        		break;
        	}
        }
        return name;*/
    	Student lowest = studentList[0];
    	for(Student s : studentList) {
    		if(s.compareTo(lowest) == -1) {
    			lowest = s;
    		}
    	}
    	return lowest.getName();
    }
    public String getFailureList(double failingGrade) {
        ArrayList<String> failureList = new ArrayList<String>();
        for(Student s : studentList) {
        	if(s.getAverage() <= failingGrade) {
        		failureList.add(s.getName());
        	}
        }
        return Arrays.toString(failureList.toArray()).replace(']', ' ').replace('[', ' ').trim();
    }
    public String toString() {
        String output = "" + getClassName() + "\n";
        return output;
    }
}