package labs.unit3;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 ::");
		int x1 = sc.nextInt();
		System.out.println("Enter y1 ::");
		int y1 = sc.nextInt();
		System.out.println("Enter x2 ::");
		int x2 = sc.nextInt();
		System.out.println("Enter y2 ::");
		int y2 = sc.nextInt();
		Distance distance = new Distance(x1,y1,x2,y2);
		distance.calcDistance();
		distance.print();
		System.out.println(5/2);
	}
}