package labs.unit15;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block {
	private int xSpeed;
	private int ySpeed;
	
	public Ball() {
		super(200,200);
		setXSpeed(3);
		setYSpeed(1);
	}
	public Ball(int xPos,int yPos) {
		super(xPos, yPos);
	}
	//add the other Ball constructors
	public Ball(int xPos,int yPos,int width,int height) {
		super(xPos, yPos, width, height);
		xSpeed = ySpeed = 0;
	}
	public Ball(int xPos,int yPos,int width,int height,Color color) {
		super(xPos, yPos, width, height, color);
		xSpeed = ySpeed = 0;
	}
	public Ball(int xPos,int yPos,int width,int height,Color color,int xSpeed,int ySpeed) {
		super(xPos, yPos, width, height, color);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
   //add the set methods
   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	  window.setColor(Color.WHITE);
	  window.fillOval(getX(), getY(), getWidth(), getHeight());
      setX(getX()+xSpeed);
      setY(getY()+ySpeed);
		//setY

		//draw the ball at its new location
      if(getColor() != null)
    	  window.setColor(getColor());
    	  
      window.fillOval(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		return obj == this;
	}
	public int getXSpeed() {
		return xSpeed;
	}
	public void setXSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}
	public int getYSpeed() {
		return ySpeed;
	}
	public void setYSpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}   

   //add the get methods

   //add a toString() method
	@Override
	public String toString() {
		return super.toString() + xSpeed + " " + ySpeed;
	}
}