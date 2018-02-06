package labs.unit1;
//© A+ Computer Science  -  www.apluscompsci.com
//Name - Cameron Black
//Date - 2/6/18
//Class - AP COMPSCIA
//Lab  - Lab01d

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GraphicsRunnerFirst extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunnerFirst()
	{
		super("Graphics Runner");
		
		setSize(WIDTH,HEIGHT);

		getContentPane().add(new Robot());
		
		//getContentPane().add(new BigHouse());		
		
		//getContentPane().add(new Robot());
		
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		GraphicsRunnerFirst run = new GraphicsRunnerFirst();
	}
}