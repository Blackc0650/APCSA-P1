package labs.unit15;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	int rightScore = 0;
	int leftScore = 0;


	public Pong()
	{
		//set up all variables related to the game




		keys = new boolean[4];

		ball = new Ball(400,400,5,5,Color.BLACK,3,1);
		rightPaddle = new Paddle(750,300,3,50,Color.RED,5);
		leftPaddle = new Paddle(50,300,3,50,Color.RED,5);
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);


		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<=780))
		{
			if(ball.getX() <= 10) {
				rightScore++;
			}
			else {
				leftScore++;
			}
			ball.draw(graphToBack, Color.WHITE);
			ball.setXSpeed(ball.getXSpeed() * -1);
			ball.setPos(400, 300);
		}
		if(!(ball.getY() >= 10 && ball.getY() <= 550)) {
			ball.setYSpeed(ball.getYSpeed() * -1);
			//ball.setXSpeed(ball.getXSpeed() * -1);
		}
		if(rightPaddle.intercepts(ball)) {
			ball.setXSpeed(ball.getXSpeed() * -1);
		}
		else if(leftPaddle.intercepts(ball)) {
			ball.setXSpeed(ball.getXSpeed() * -1);
		}
		
		//see if the ball hits the top or bottom wall 

		


		//see if the ball hits the left paddle
		
		
		
		//see if the ball hits the right paddle
		
		
		


		//see if the paddles need to be moved
		if(keys[0] == true) {
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		else if(keys[1] == true) {
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		if(keys[2] == true) {
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		else if(keys[3] == true) {
			rightPaddle.moveDownAndDraw(graphToBack);
		}
		graphToBack.setColor(Color.WHITE);
		graphToBack.drawString("RIGHT SCORE=" + (rightScore - 1) + " || LEFTSCORE=" + (leftScore - 1), 300, 50);
		graphToBack.setColor(Color.BLACK);
		graphToBack.drawString("RIGHT SCORE=" + rightScore + " || LEFTSCORE=" + leftScore, 300, 50);














		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}