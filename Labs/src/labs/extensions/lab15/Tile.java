package labs.extensions.lab15;

import java.awt.Color;
import java.awt.Graphics;

public class Tile extends Block {
	private int life;
	public Tile(int life, int xPos, int yPos, int width, int height) {
		super(xPos, yPos, width, height);
		this.setLife(life);
	}
	@Override
	public void draw(Graphics window) {
		super.draw(window,getColor());
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
			this.life = life;
	}
	public Color getColor() {
		Color starterColor = new Color(56,255,66);
		int addedBlue = starterColor.getBlue() + (life * 60);
		if(addedBlue > 255)
			addedBlue = 255;
		return new Color(starterColor.getRed(),starterColor.getGreen(),addedBlue);
	}
}
