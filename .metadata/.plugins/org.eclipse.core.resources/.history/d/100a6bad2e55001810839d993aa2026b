package labs.extensions.lab15;

public class QuadBox {
	private int x,x2,x3,x4;
	private int y,y2,y3,y4;
	private int width,width2,width3,width4;
	private int height,height2,height3,height4;
	public QuadBox(int x, int y, int width, int height, int x2, int y2, int width2, int height2, int x3, int y3, int width3, int height3, int x4, int y4, int width4, int height4) {
		this.x = x;
		this.x2 = x2;
		this.x3 = x3;
		this.x4 = x4;
		this.y = y;
		this.y2 = y2;
		this.y3 = y3;
		this.y4 = y4;
		this.width = width;
		this.width2 = width2;
		this.width3 = width3;
		this.width4 = width4;
		this.height = height;
		this.height2 = height2;
		this.height3 = height3;
		this.height4 = height4;
	}
	private boolean intercepts(Block otherBlock,int xPos, int yPos, int width, int height) {
		int xx = x;
		int yy = y;
		int wi = width;
		int he = height;
	    return xx < otherBlock.getX() + otherBlock.getWidth() && xx + wi > otherBlock.getX() && yy < otherBlock.getY() + otherBlock.getHeight() && yy + he > otherBlock.getY();
	}
	public Direction getDirection(Block otherBlock) {
		if(this.intercepts(otherBlock, x, y, width, height)) {
			return Direction.RIGHT;
		}
		else if(this.intercepts(otherBlock, x2, y2, width2, height2)) {
			return Direction.LEFT;
		}
		else if(this.intercepts(otherBlock, x3, y3, width3, height3)) {
			return Direction.UP;
		}
		else if(this.intercepts(otherBlock, x4, y4, width4, height4)) {
			return Direction.DOWN;
		}
		return null;
	}
}
