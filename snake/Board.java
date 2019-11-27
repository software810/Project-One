package org.snake;

public class Board {
	// The Board has a set of cells with dots.
	private int width, height;
	private char[][] boardMatrix;
	// Board’s width and height are set in the constructor.
	public Board(int width, int height) {
		this.width = width;
		this.height = height;
		this.boardMatrix = new char[this.height][this.width];
	}

	
	public void initBoard() {
		for (int i = 0; i < this.height; i++) {
			for (int j = 0; j < this.width; j++) {
				this.boardMatrix[i][j] = '.';
			}
		}
	}

	
	public void printBoard() {
		for (int i = 0; i < this.height; i++) {
			for (int j = 0; j < this.width; j++) {
				System.out.print(this.boardMatrix[i][j]);
			}
			System.out.println();
		}
	}

	
	public void ClearScreenLocation(int x, int y) {
		this.boardMatrix[y][x] = '.';
	}

	
	public int getBoardWidth() {
		return this.width;
	}

	public int getBoardHeight() {
		return this.height;
	}
	
	// Used to retrieve the current object in the cell location.
	public char getObjectOnLocation(int x, int y) {
		return this.boardMatrix[y][x];
	}

	// Apple objects can be set on the board on a cell using the method. 
	public void setObjectOnLocation(BoardComponent object, int x, int y) {
		this.boardMatrix[y][x] = object.getIcon();
	}
}
