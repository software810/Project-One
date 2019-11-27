package org.snake;
// This class extends BoardComponent class.
// It has a constructor which takes the symbol has the parameter. 
public class Apple extends BoardComponent {

	public Apple (char symbol) {
		setIcon(symbol);
	}
	// It has a method addRandomApple method to set the apple on the board.
	public void addRandomFood(Board screen, Apple apple) {
		
		int x = (int) (((Math.random()) * (screen.getBoardWidth() - 1)));
		int y = (int) (((Math.random()) * (screen.getBoardHeight() - 1)));

		if(x==0)
		{
			x = 2;
		}
		
		if(y==0)
		{
			y= 2;
		}
		screen.setObjectOnLocation(apple,x,y);
				
	}
}
