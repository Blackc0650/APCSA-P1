package labs.unit0;
/*
 * Cameron Black
 * Period 1
 * AP Compsci A
 * Lab0a1
 */
public class Lab0a1 {
	public static void main(String[] args)
	{
		System.out.println("Cameron Black \t  2/2/18 \n\n" );
		plus();
		minus();
		plus();
		minus();
		plus();
	}
	public static void plus() {
		for (int i = 0; i < 3; i++) {
			System.out.println("+++++++++++++++++++++++ ");
		}
	}
	public static void minus() {
		for (int i = 0; i < 2; i++) {
			System.out.println("---------------------- ");
		}
	}
}
