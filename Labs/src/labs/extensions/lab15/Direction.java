package labs.extensions.lab15;

public enum Direction {
	UP,DOWN,RIGHT,LEFT;
	public static Direction getOppositeDirection(Direction direction) {
		if(direction == UP) {
			return DOWN;
		}
		else if(direction == DOWN) {
			return UP;
		}
		else if(direction == RIGHT) {
			return LEFT;
		}
		else if(direction == LEFT) {
			return RIGHT;
		}
		return null;
	}
}
