package labs.unit3;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a ::");
		int a = sc.nextInt();
		System.out.println("Enter b ::");
		int b = sc.nextInt();
		System.out.println("Enter c ::");
		int c = sc.nextInt();
		Quadratic quad = new Quadratic(a,b,c);
		quad.calcRoots();
		quad.print();
		sc.close();
	}
}