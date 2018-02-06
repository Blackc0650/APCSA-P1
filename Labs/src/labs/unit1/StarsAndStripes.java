package labs.unit1;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	   char c = '*';
	   String stars = "";
	   for (int i = 0; i < 20; i++) {
		   stars += c;
	   }
	   System.out.println(stars);
   }

   public void printTwentyDashes()
   {
	   char c = '-';
	   String dashes = "";
	   for (int i = 0; i < 20; i++) {
		   dashes += c;
	   }
	   System.out.println(dashes);
   }

   public void printTwoBlankLines()
   {
	   System.out.println("\n\n");
   }
   
   public void printASmallBox()
   {	
   }
 
   public void printABigBox()
   { 	
   }   
}