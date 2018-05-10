package labs.extensions.lab15;

import java.awt.Graphics;
import java.util.ArrayList;

public class TileManager {
	private ArrayList<Tile> tiles = new ArrayList<Tile>();
	private int numTiles;
	private int tileWidth;
	private int tileHeight;
	private int space;
	public TileManager(int numTiles) {
		this.numTiles = numTiles;
		this.space = (numTiles / 8) * 10;
		int totalWidth = TheGame.WIDTH - (space * (numTiles + 1));
		System.out.println(totalWidth);
		this.tileWidth = totalWidth / numTiles;
		this.tileHeight = space;
	}
	public void addHorizontal(int numRow,Graphics graphics) {
		int originalWidth = tileWidth;
		int originalHeight = tileHeight;
		for (int i = 1; i <= numRow; i++) {
			for (int j = 0; j < numTiles; j++) {
				System.out.println(tileWidth + " | " + tileHeight);
				if(j == 0 || j + 1 == numTiles) {
					tiles.add(new Tile(numRow,tileWidth,tileHeight,originalWidth,originalHeight));
				}
				else {
					tiles.add(new Tile((numRow - i) + 1,tileWidth,tileHeight,originalWidth,originalHeight));
				}
				tileWidth += originalWidth + space;
			}
			tileWidth = originalWidth;
			tileHeight += originalHeight + space;
		}
		tileHeight = TheGame.HEIGHT - ((originalHeight + space) * numRow) - space;
		for (int i = 1; i <= numRow; i++) {
			for (int j = 0; j < numTiles; j++) {
				if(j == 0 || j + 1 == numTiles) {
					tiles.add(new Tile(numRow,tileWidth,tileHeight,originalWidth,originalHeight));
				}
				else {
					tiles.add(new Tile(i,tileWidth,tileHeight,originalWidth,originalHeight));
				}
				tileWidth += originalWidth + space;
			}
			tileWidth = originalWidth;
			tileHeight += originalHeight + space;
		}
	}
	public void addVertical(int numRow) {
		int originalWidth = tileWidth;
		int originalHeight = space;
		tileHeight = (originalHeight + space) * numRow - space;
		for (int i = 1; i <= numRow; i++) {
			for (int j = 0; j < numTiles - (numRow * numRow) + numRow; j++) {
				removeOverlap(tileWidth, tileHeight);
				tiles.add(new Tile((numRow - i) + 1,tileWidth,tileHeight,originalWidth,originalHeight));
				tileHeight += originalHeight + space;
			}
			tileHeight = (originalHeight + space) * numRow - space;
			tileWidth += originalWidth + space;
		}
		tileWidth = TheGame.WIDTH - originalWidth - space;
		for (int i = 1; i <= numRow; i++) {
			for (int j = 0; j < numTiles - (numRow * numRow) + numRow; j++) {
				removeOverlap(tileWidth, tileHeight);
				tiles.add(new Tile((numRow - i) + 1,tileWidth,tileHeight,originalWidth,originalHeight));
				tileHeight += originalHeight + space;
			}
			tileHeight = (originalHeight + space) * numRow - space;
			tileWidth += originalWidth + space;
		}
	}
	private void removeOverlap(int x, int y) {
		for (int i = 0; i < tiles.size(); i++) {
			if(tiles.get(i).getX() == x && tiles.get(i).getY() == y) {
				tiles.remove(tiles.get(i));
			}
		}
	}
	public void drawAll(Graphics graphics) {
		for(Tile tile : tiles) {
			tile.draw(graphics,tile.getColor());
		}
	}
}
