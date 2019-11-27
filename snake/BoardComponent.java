package org.snake;

public class BoardComponent {
	
	// Location coordinates x, y and icon representing the component.
	// Getters and setters are used to get and set the attributes.
	private int x, y;
	private char icon;
	

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public char getIcon() {
		return icon;
	}

	public void setX(int newLocation) {
		this.x = newLocation;
	}
	
	public void setY(int newLocation) {
		this.y = newLocation;
	}
	
	public void setIcon(char newSymbol) {
		this.icon = newSymbol;
	}
}
