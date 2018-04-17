package labs.unit15;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable {
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block() {
		xPos = yPos = width = height = 0;
		color = Color.BLACK;
	}
	public Block(int x,int y) {
		setX(x);
		setY(y);
		color = Color.BLACK;
	}
	//add other Block constructors - x , y , width, height, color
	public Block(int xPos,int yPos,int width,int height) {
		setX(xPos);
		setY(yPos);
		setWidth(width);
		setHeight(height);
		color = Color.BLACK;
	}
	public Block(int xPos,int yPos,int width,int height,Color color) {
		setX(xPos);
		setY(yPos);
		setWidth(width);
		setHeight(height);
		setColor(color);
	}	
   //add the other set methods
   

   public void setColor(Color col) {
	   this.color = col;
   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	      window.fillRect(getX(), getY(), getWidth(), getHeight());
	      window.setColor(color);
   }
   
	public boolean equals(Object obj) {
		return obj == this;
	}
	public int getX() {
		return xPos;
	}
	public void setPos(int x,int y) {
		this.xPos = x;
		this.yPos = y;
	}
	public void setX(int xPos) {
		this.xPos = xPos;
	}

	public int getY() {
		return yPos;
	}

	public void setY(int yPos) {
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

   //add the other get methods
    

   //add a toString() method  - x , y , width, height, color
	@Override
	public String toString() {
		return xPos + " " + yPos + " " + width + " " + height + " " + color;
	}
	public boolean intercepts(Block otherBlock) {
	    return xPos < otherBlock.getX() + otherBlock.width && xPos + width > otherBlock.xPos && yPos < otherBlock.yPos + otherBlock.height && yPos + height > otherBlock.yPos;
	}
}