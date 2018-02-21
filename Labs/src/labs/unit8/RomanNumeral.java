//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package labs.unit8;
/**
 * <b>On the student download editions for this Lab there is
 * no implementation of a Comparable!</b>
 * @author Blackc0650
 *
 */
public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		roman = str;
	}

	public RomanNumeral(Integer orig)
	{
		number = orig;
	}

	public void setNumber(Integer num)
	{
		number = num;
	}

	public void setRoman(String rom)
	{
		roman = rom;
	}

	public Integer getNumber()
	{
		/**
		 * Algorithm based on the instructions in Lab14i 
		 * -> If I have extra time I will condense this for conciseness 
		 */
		String current = roman;
		int converted = 0;
		while(current.length() > 0) {
			Breakpoint:
			for (int i = 0; i < 2; i++) {
				int index = 0;
				for(String s : LETTERS) {
					index++;
					if(i == 0) {
						if(s.length() == 2) {
							if(current.length() > 1) {
								if(current.substring(current.length() - 2, current.length()).equals(s)) {
									converted += NUMBERS[index - 1];
									current = current.substring(0,current.length() - 2);
									break Breakpoint;
								}
							}
						}
					}
					else {
						if(s.length() == 1) {
							if(current.length() != 0) {
								if(current.substring(current.length() - 1, current.length()).equals(s)) {
									converted += NUMBERS[index - 1];
									current = current.substring(0, current.length() - 1);
									break Breakpoint;
								}
							}
							else {
								break;
							}
						}
					}
				}
			}
		}
		return converted;
	}

	public String toString()
	{
		/**
		 * This was just for extra practice :P
		 */
		//Personal algorithim
		/*ArrayList<String> letters = new ArrayList<String>();
		for(String s : LETTERS)
			letters.add(s);
		String current = roman;
		int convert = 0;
		while(current.length() > 0) {
			String obtain = null;
			boolean singular = false;
			while(obtain == null || obtain.length() > 0) {
				if(singular == false) {
					obtain = current.substring(current.length() - 2, current.length());
					if(letters.contains(obtain)) {
						convert += NUMBERS[letters.indexOf(obtain)];
						obtain = "";
					}
					singular = true;
				}
				else {
					obtain = current.substring(current.length() - 1, current.length());
					convert += NUMBERS[letters.indexOf(obtain)];
					obtain = "";
				}
			}
		}
		
		*/
		//roman to base10;
		/**
		 * Algorithm based on the instructions in Lab14i!
		 */
		int currentNumber = number;
		String newRoman = "";
		roman = newRoman;
		while(getNumber() != currentNumber) {
			int index = -1;
			for(int i : NUMBERS) {
				index++;
				//System.out.println(i + " ::: " + currentNumber);
				if(currentNumber - i >= 0) {
					newRoman += LETTERS[index];
					currentNumber -= i;
					break;
				}
			}
		}
		
		return newRoman;
	}
}