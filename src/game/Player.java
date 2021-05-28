package game;

import fixtures.Room;

public class Player {
private int index = 0;

private Room currentRoom;

private boolean pelt = false;

private boolean key = false;

private boolean sword = false;

public int getIndex() {
	return index;
}

public void setIndex(int index) {
	this.index = index;
}

public Room getCurrentRoom() {
	return currentRoom;
}

public void setCurrentRoom(Room currentRoom) {
	this.currentRoom = currentRoom;
}


public boolean hasPelt() {
	return pelt;
}

public void setPelt(boolean pelt) {
	this.pelt = pelt;

}

public boolean hasKey() {
	return key;
}

public void setKey(boolean key) {
	this.key = key;
}

public boolean hasSword() {
	return sword;
}


public void setSword(boolean sword) {
	this.sword = sword;
}







}
