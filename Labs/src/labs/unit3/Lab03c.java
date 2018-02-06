package labs.unit3;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c {
	public static void main(String[] args) {
		Quadratic quad = new Quadratic(1,5,6);
		quad.calcRoots();
		quad.print();
	}
}