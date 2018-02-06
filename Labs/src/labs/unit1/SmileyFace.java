package labs.unit1;
//© A+ Computer Science  -  www.apluscompsci.com
//Name - Cameron Black
//Date - 2/1/18
//Class - P. 1
//Lab  - Lab01b

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

@SuppressWarnings("serial")
public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);

      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );
      window.setColor(Color.GREEN);
      window.fillOval(275, 200, 100, 50);
      window.fillOval(435, 200, 100, 50);
      window.setColor(Color.BLACK);
      window.fillOval(400, 315, 15, 15);
      window.setColor(Color.RED);
      window.drawArc(200, 350, 400, 55, -45, -90);
		//add more code here


   }
}