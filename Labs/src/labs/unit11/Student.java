//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package labs.unit11;

public class Student implements Comparable<Student> {
    private String 	name;
    private Grades grades;
    public Student() {
        setName("");
        setGrades("");
    }
    public Student(String name, String gradeList) {
        setName(name);
        setGrades(gradeList);
    }
    public void setName(String name) {
    	this.name = name;
    }
    public void setGrades(String gradeList) {
    	grades = new Grades(gradeList);
    }
    public void setGrade(int spot, double grade) {
    	grades.setGrade(spot, grade);
    }
    public String getName() {
        return name;
    }
    public int getNumGrades() {
        return grades.getNumGrades();
    }
    public double getSum() {
        return grades.getSum();
    }
    public double getAverage() {
        return grades.getSum() / grades.getNumGrades();
    }
    public double getAverageMinusLow() {
        return getAverage() - grades.getLowGrade();
    }
    public double getHighGrade() {
        return grades.getHighGrade();
    }
    public double getLowGrade() {
        return grades.getLowGrade();
    }
    public String toString() {
        return name + " = " + grades;
    }
	@Override
	public int compareTo(Student o) {
		if(getAverage() > o.getAverage()) {
			return 1;
		}
		else if(getAverage() < o.getAverage()) {
			return -1;
		}
		return 0;
	}
	public boolean equals(Student o) {
		return o == this;
	}
}