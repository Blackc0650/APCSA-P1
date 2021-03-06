package labs.extensions.lab15;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Component;
@SuppressWarnings("serial")
public class TheGame extends JFrame {
	protected static final int WIDTH = 800;
	protected static final int HEIGHT = 600;
	public TheGame() {
		super("PONG");
		this.setSize(WIDTH,HEIGHT);
		int val = JOptionPane.showConfirmDialog(null, "Welcome to my Pong Lab Extension! Destroy all the tiles to advance to the next level. Good luck! ");
		if(val != 0) {
			System.exit(1);
		}
		Pong game = new Pong();
		((Component)game).setFocusable(true);			
		this.getContentPane().add(game);				
		this.setVisible(true);
		this.setDefaultCloseOperation(3);
		this.setResizable(false);
	}
	public static void main(String args[]) {
		new TheGame();
	}
}