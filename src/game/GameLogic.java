package game;

import fixtures.Room;

public class GameLogic {

	public static void goStraight(Player playerOne, Room[] kingdom) throws InterruptedException {
		playerOne.setIndex(playerOne.getIndex() +playerOne.getCurrentRoom().straightDist );
		playerOne.setCurrentRoom(kingdom[playerOne.getIndex()]);
		System.out.println(playerOne.getCurrentRoom().longDescription);
		
		
		if(playerOne.getIndex() == 15) {
			playerOne.setIndex(playerOne.getIndex() +playerOne.getCurrentRoom().straightDist );
			playerOne.setCurrentRoom(kingdom[playerOne.getIndex()]);
			System.out.println(kingdom[playerOne.getIndex()].name);
			System.out.println(kingdom[playerOne.getIndex()].shortDescription +"\n");
			System.out.println(playerOne.getCurrentRoom().longDescription);
		}
	}

	public static void goRight(Player playerOne, Room[] kingdom) throws InterruptedException {
		playerOne.setIndex(playerOne.getIndex() +playerOne.getCurrentRoom().rightDist );
		playerOne.setCurrentRoom(kingdom[playerOne.getIndex()]);
		System.out.println(playerOne.getCurrentRoom().longDescription);
		
		if(playerOne.getIndex() == 15) {
			playerOne.setIndex(playerOne.getIndex() +playerOne.getCurrentRoom().rightDist );
			playerOne.setCurrentRoom(kingdom[playerOne.getIndex()]);
			System.out.println(kingdom[playerOne.getIndex()].name);
			System.out.println(kingdom[playerOne.getIndex()].shortDescription +"\n");
			System.out.println(playerOne.getCurrentRoom().longDescription);
		}
	}
	
	public static void goLeft(Player playerOne, Room[] kingdom) throws InterruptedException {
		if(playerOne.getIndex() == 6) {
			System.out.println("There's no door there");
		}
		playerOne.setIndex(playerOne.getIndex() +playerOne.getCurrentRoom().leftDist );
		playerOne.setCurrentRoom(kingdom[playerOne.getIndex()]);
		System.out.println(playerOne.getCurrentRoom().longDescription);
		
		if(playerOne.getIndex() == 15) {
			playerOne.setIndex(playerOne.getIndex() +playerOne.getCurrentRoom().rightDist );
			playerOne.setCurrentRoom(kingdom[playerOne.getIndex()]);
			System.out.println(kingdom[playerOne.getIndex()].name);
			System.out.println(kingdom[playerOne.getIndex()].shortDescription +"\n");
			System.out.println(playerOne.getCurrentRoom().longDescription);
		}
	}
	
	
	public static void goBack(Player playerOne, Room[] kingdom) {
		playerOne.setIndex(playerOne.getIndex() - playerOne.getIndex());
		playerOne.setCurrentRoom(kingdom[playerOne.getIndex()]);
		System.out.println("You scurry back to the marketplace...");
		System.out.println(playerOne.getCurrentRoom().longDescription);
	}
}
