package labs.unit2;
public class Lab02e {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(5);
		circle.calculateArea();
		circle.print();
		circle.setRadius(33);
		circle.calculateArea();
		circle.print();
	}
}