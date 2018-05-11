package labs.extensions.lab15;

import java.awt.Graphics;
import java.util.ArrayList;

public class TileManager {
	private ArrayList<Tile> tiles = new ArrayList<Tile>();
	private int numTiles;
	private int tileWidth;
	private int tileHeight;
	private int space;
	private int greatestWidth;
	public TileManager(int numTiles) {
		this.numTiles = numTiles;
		this.space = (numTiles / 8) * 10;
		int totalWidth = TheGame.WIDTH - (space * (numTiles + 1));
		this.tileWidth = totalWidth / numTiles;
		this.tileHeight = space;
	}
	public void addHorizontal(int numRow,Graphics graphics) {
		int originalWidth = tileWidth;
		int originalHeight = tileHeight;
		for (int i = 1; i <= numRow; i++) {
			for (int j = 0; j < numTiles; j++) {
				if(j == 0 || j + 1 == numTiles) {
					tiles.add(new Tile(numRow,tileWidth,tileHeight,originalWidth,originalHeight));
				}
				else {
					tiles.add(new Tile((numRow - i) + 1,tileWidth,tileHeight,originalWidth,originalHeight));
				}
				if(j + numRow == numTiles) {
					greatestWidth = tileWidth;
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
		tileWidth = greatestWidth;
		for (int i = 1; i <= numRow; i++) {
			for (int j = 0; j < numTiles - (numRow * numRow) + numRow; j++) {
				removeOverlap(tileWidth, tileHeight);
				tiles.add(new Tile(i,tileWidth,tileHeight,originalWidth,originalHeight));
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
			tile.drawOuterboundingBox(graphics);
		}
	}
	public void updateDirection(Ball b) {
		for(Tile tile : tiles) {
			tile.updateDirection(b);
		}
	}
	public void updateBallDirection(Ball b) {
		for (int i = 0; i < tiles.size(); i++) {
			if(tiles.get(i).intercepts(b)) {
				if(tiles.get(i).getLife() <= 0) {
					tiles.remove(tiles.get(i));
				}
				tiles.get(i).setLife(tiles.get(i).getLife() - 1);
				Direction newDirection = tiles.get(i).getDirection();
				if(newDirection == Direction.UP || newDirection == Direction.DOWN) {
					b.setYSpeed(b.getYSpeed() * -1);
				}
				else if(newDirection == Direction.RIGHT || newDirection == Direction.LEFT) {
					b.setXSpeed(b.getXSpeed() * -1);
				}
			}
		}
	}
	
}
