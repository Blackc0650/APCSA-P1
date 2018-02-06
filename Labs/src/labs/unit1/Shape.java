package labs.unit1;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;
	/**
	 * 
	 * @param x
	 * @param y
	 * @param wid
	 * @param ht
	 * @param col
	 */
	public Shape(int x, int y, int wid, int ht, Color col)
	{
		this.setxPos(x);
		this.setyPos(y);
		this.setWidth(wid);
		this.setHeight(ht);
		this.setColor(col);
		//finish this constructor
   }


   public void draw(Graphics window)
   {
	  
      window.setColor(color);
      //window.fillRect(xPos, yPos, width, height);
      //window.setColor(Color.GREEN);
      window.drawOval(xPos, yPos, width, height);
      window.setColor(Color.BLUE);
      window.drawOval(xPos,yPos,width + 5, height + 5);
      window.drawRect(xPos + 15, yPos + 15, width / 2, height / 2);
      window.drawLine(xPos + (width / 2) + 2, yPos,xPos + (width / 2) + 2, yPos + height + 4 /*+ /*(height / 2)*/);
      //draw whatever you want
      //    ^
      //  [ :: ]
      //    ()

   }

   //BONUS
   //add in set and get methods for all instance variables

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }


public int getxPos() {
	return xPos;
}


public void setxPos(int xPos) {
	this.xPos = xPos;
}


public int getyPos() {
	return yPos;
}


public void setyPos(int yPos) {
	this.yPos = yPos;
}


public int getWidth() {
	return width;
}


public void setWidth(int width) {
	this.width = width;
}


public int getHeight() {
	return height;
}


public void setHeight(int height) {
	this.height = height;
}


public Color getColor() {
	return color;
}


public void setColor(Color color) {
	this.color = color;
}
}