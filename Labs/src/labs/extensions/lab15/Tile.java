package labs.extensions.lab15;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Tile extends Block {
	private BufferedImage tileImage;
	private final String tileImageName = "tile.png";
	private int life;
	public Tile(int life) {
		this.setLife(life);
		try {
			tileImage = ImageIO.read(this.getClass().getResource(tileImageName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void draw(Graphics window) {
		window.drawImage(tileImage, getX(), getY(), null);
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
}
