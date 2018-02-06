package labs.unit2;
public class Lab02f {
	public static void main(String[] args) {
		Line l = new Line(2,1,4,-3);
		l.calculateSlope();
		l.print();
		Line l2 = new Line(10,20,30,40);
		l2.calculateSlope();
		l2.print();
	}
}