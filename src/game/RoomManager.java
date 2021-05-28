package game;

import fixtures.Room;

public class RoomManager {
	
	private Room[] rooms;
	private Room startingRoom;

	public static Room[] init() {
		Room[] kingdom = new Room[16];
		
		Room startRoom = new Room(
				"You enter the marketplace \n",
				"The hustling, bustling Kingdom of San d'Oria",
				"You're not sure why you're here, as this game doesn't come with instructions. \n"
				+ "Sounds of music and merchants fill the air, bagpipes and chain mail. \n"
				+ "You look around and see a few places to go... \n"
				+ "What to do, what to do?",
				1,
				2,
				3,
				"");
		kingdom[0] = startRoom;
				
	
//Straight from home
	Room chateau = new Room(
			"",
			"A tall, regal building stands before you.\n",
			"A beautiful building stands before you, although it seems the door is locked.",
			5,
			0,
			0,
			"Sword");
	kingdom[1] = chateau;


	
	// left from home 
		Room furShop = new Room(
				"",
				"There's a tall, statuesque man who seems to be selling livestock.\n",
				"Hello adventurer! Do you have something valuable for me...wait...\n"
				+ "You seem far too weak to have anything of value for me. Don't waste my time. \n"
				+ "This is a dead end. When you're done with the scenery, go back \n",
				0,
				0,
				0,
				"Key");
		kingdom[2] = furShop;
		
		//right from home 
		
		Room wilderness = new Room(
				"",
				"A door to the wilderness. You feel uneasy, but you're not sure why. \n",
				"You've stepped into the wild. A vast forest stretches ahead of you. \n"
				+ "There's wildlife and monsters are far as the eye can see. \n"
				+ "Near your foot, you find a strange yet exotic looking fur. Pick it up? \n",
				0,
				1,
				2,
				"");
		kingdom[3] = wilderness;
		
	
		
		Room orcHut = new Room(
				"",
				"It reaks of death an despair.\n",
				"You walk into a shack, about the size of an RV.  \n"
				+ "As you walk further, the stench of death and decay grows overwhelming. \n"
				+ "A big ol' monster stands before you, blood dripping from its face. Was this a mistake? \n"
				+ "Do you fight, or run?",
				0,
				4,
				5,
				"");
		kingdom[4] = orcHut;	
		
		Room armory = new Room(
				"",
				"Smells like rich people...\n",
				"The door unlocks, leading you into an unguarded armory filled with a strange power. \n"
				+ "One sword in particular catches your eye. It's hot pink and says 'fight orcs with this' on the blade. \n"
				+ "That might be useful later, so you pick it up.\n"
				+ "This is a dead end. When you're done with the scenery, go back \n",
				0,
				0,
				0,
				"");
		kingdom[5] = armory;
		
		return kingdom;
	}
}

