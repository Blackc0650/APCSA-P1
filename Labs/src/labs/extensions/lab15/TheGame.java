package labs.extensions.lab15;
import javax.swing.JFrame;
import java.awt.Component;
@SuppressWarnings("serial")
public class TheGame extends JFrame {
	protected static final int WIDTH = 800;
	protected static final int HEIGHT = 600;
	public TheGame() {
		super("PONG");
		this.setSize(WIDTH,HEIGHT);
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