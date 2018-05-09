package labs.extensions.lab15;

import java.awt.Graphics;
import java.util.ArrayList;

public class TileManager {
	private ArrayList<Tile> tiles = new ArrayList<Tile>();
	private int numTilesInRow;
	private int tileWidth;
	private int tileHeight;
	private final int spaceing = 10;
	public TileManager(int numTilesInRow, int tileWidth, int tileHeight) {
		this.numTilesInRow = numTilesInRow;
		this.tileWidth = tileWidth;
		this.tileHeight = tileHeight;
	}
	public void addRows(int rowThickness) {
		int spaceing = this.spaceing;
		int totalWidth = TheGame.WIDTH / numTilesInRow;
		for (int i = 1; i <= rowThickness; i++) {
			for (int j = 0; j < numTilesInRow; j++) {
				tiles.add(new Tile(rowThickness - i,totalWidth, 20 + spaceing,tileWidth, tileHeight));
				totalWidth *= (j + 1);
			}
			totalWidth = TheGame.WIDTH / numTilesInRow;
			spaceing += this.spaceing;
		}
	}
	public void drawAllTiles(Graphics window) {
		for(Tile tile : tiles) {
			tile.draw(window);
		}
	}
}
