package labs.unit15;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block {
    //instance variables
    private int speed;
    public Paddle() {
        super(10, 10);
        speed = 5;
    }
    //add the other Paddle constructors
    public Paddle(int x, int y) {
    	super(x, y);
    }
    public Paddle(int x, int y, int width) {
    	super(x, y);
    }
    public Paddle(int x, int y, int width, int height, int speed) {
    	super(x, y, width, height);
    	this.speed = speed;
    	
    }
    public Paddle(int x, int y, int width, int height, Color color, int speed) {
    	super(x, y, width, height, color);
    	this.speed = speed;
    }
    public void moveUpAndDraw(Graphics window) {
    	Color old = getColor();
    	setColor(Color.WHITE);
    	draw(window);
    	setY(getY() - speed);
    	setColor(old);
    	draw(window);
    	//setHeight(getHeight() - speed);
    }
    public void moveDownAndDraw(Graphics window) {
    	Color old = getColor();
    	setColor(Color.WHITE);
    	draw(window);
    	setY(getY() + speed);
    	setColor(old);
    	draw(window);
    }
    //add get methods
    //add a toString() method
}