package labs.unit2;
public class Circle
{
	private double radius;
	private double area;
	/*public Circle(double radius,double area) {
		this.radius = radius;
		this.area = area;
	}*/
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void calculateArea() {
		area = Math.pow(radius, 2) * Math.PI;
	}

	public void print() {
		System.out.println("The area is " + area);
	}
}