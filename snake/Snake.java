package org.snake;

public class Snake extends BoardComponent {

	public Snake(char symbol, int xStartingLocation, int yStartingLocation) {
		setIcon(symbol);
		setX(xStartingLocation);
		setY(yStartingLocation);
	}
	
	public void moveLeft(Board screen, Snake snake) {
		snake.setX(getX() - 1);
		screen.setObjectOnLocation(snake, snake.getX(), snake.getY());
		screen.ClearScreenLocation(snake.getX() + 1, snake.getY());
	}
	
	public void moveRight(Board screen, Snake snake) {
		snake.setX(getX() + 1);
		screen.setObjectOnLocation(snake, snake.getX(), snake.getY());
		screen.ClearScreenLocation(snake.getX() - 1, snake.getY());
	}
	
	public void moveUp(Board screen, Snake snake) {
		snake.setY(getY() - 1);
		screen.setObjectOnLocation(snake, snake.getX(), snake.getY());
		screen.ClearScreenLocation(snake.getX(), snake.getY() + 1);
	}
	
	public void moveDown(Board screen, Snake snake) {
		snake.setY(getY() + 1);
		screen.setObjectOnLocation(snake, snake.getX(), snake.getY());
		screen.ClearScreenLocation(snake.getX(), snake.getY() - 1);
	}
}