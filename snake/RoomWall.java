package org.snake;

public class RoomWall extends BoardComponent {
	
	// It is a subclass of BoardComponent class. 
	// It has constructors to set the default icon or a custom icon for the wall cells.
	public RoomWall() {
		setIcon('^');
	}

	public RoomWall(char icon) {
		setIcon(icon);
	}
	
	// To set the walls on north, south, west, and east, addRoomWallRow and addRoomWallColumn methods.
	public void addRoomWallRow(Board board, RoomWall wall, int rowNumber) {
		for (int i = 0; i < board.getBoardWidth(); i++) {
			board.setObjectOnLocation(wall, i, rowNumber);
		}
	}

	public void addRoomWallColumn(Board board, RoomWall wall, int columnNumber) {
		for (int i = 0; i < board.getBoardHeight(); i++) {
			board.setObjectOnLocation(wall, columnNumber, i);
		}
	}
}
