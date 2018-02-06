package labs.unit1;
//© A+ Computer Science  -  www.apluscompsci.com
//Name - Cameron Black
//Date - 2/6/18
//Class - AP CSPA
//Lab  - Lab01d

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );
      head(window);
      upperBody(window);
      lowerBody(window);

      //call head method
      
      //call other methods
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 200, 200 );
      window.setColor(Color.GREEN);
      window.fillOval(275, 150, 10, 10);
      window.fillOval(345, 150, 10, 10);
      window.setColor(Color.BLACK);
      window.fillOval(310, 185, 15, 15);
      window.setColor(Color.RED);
      window.drawArc(210, 200, 200, 55, -45, -90);
      

		//add more code here
				
   }

   public void upperBody( Graphics window )
   {

		//add more code here
	   window.setColor(Color.BLUE);
	   window.fillRect(240, 300, 150, 100);
	   window.drawLine(390, 300, 420, 270);
	   window.drawLine(240, 300, 210, 270);
   }

   public void lowerBody( Graphics window )
   {
	   window.setColor(Color.BLACK);
	   window.fillRect(240, 410, 150, 100);
	   window.drawLine(390, 410, 420, 440);
	   window.drawLine(240, 410, 210, 440);
		//add more code here

   }
}