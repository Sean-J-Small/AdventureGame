package game;

import fixtures.Room;
import java.util.Scanner;

public class Main extends GameLogic {

	public static void main(String[] args) throws InterruptedException {
		Player playerOne = new Player();
		Room[] kingdom = RoomManager.init();
		playerOne.setCurrentRoom(kingdom[0]);
		
		
		if(playerOne.getIndex() == 0) {
		System.out.println("Start adventure");
		System.out.println(playerOne.getCurrentRoom().longDescription);
		}
		
		while(true) {
					
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String[] input = str.split("\\s+");
		
		
		//endgame sequence
		 if(playerOne.getIndex() == 4 && playerOne.hasSword() == false) {
			 if(input[0].equals("fight") || input[0].equals("Fight") || input[0].equals("Run") || input[0].equals("run")) {
			System.out.println("Orc attack! Your tiny human bones are crushed in seconds. \n"
					+ "Try again?");
			System.exit(0);
			 }
		 
		//win condition
		 if(playerOne.getIndex() == 4 && playerOne.hasSword() == true) {
			System.out.println("You feel a sudden surge of courage...is this your destiny?");
					if((input[0].equals("fight") || input[0].equals("Fight"))) {
						System.out.println("With one strike of your might blade, you strike down \n"
								+ "the beastly Orc where he stands. Andrenaline coursing through your veins, \n "
								+ "you look around for your next victim. Only then do you notice the litter of orc babies \n"
								+ "this monster was apparently defending. You've won, but at what cost? ");
						System.exit(0);
					}
		 }
		
			//directional input
		}else if(input[0].equals("Go") || input[0].equals("go")) {
			if(input[1].equals("Straight") || input[1].equals("straight")) {
//				System.out.println(playerOne.getIndex());
				goStraight(playerOne,kingdom);
//				System.out.println(playerOne.getIndex());
			}else if(input[1].equals("Left") || input[1].equals("left")) {
//				System.out.println(playerOne.getIndex());
				goLeft(playerOne,kingdom);
//				System.out.println(playerOne.getIndex());
			}else if(input[1].equals("Right") || input[1].equals("right")) {
//				System.out.println(playerOne.getIndex());
				goRight(playerOne,kingdom);
//				System.out.println(playerOne.getIndex());
			}else if(input[1].equals("Back") || input[1].equals("back")) {
					System.out.println(playerOne.getIndex());
					goBack(playerOne,kingdom);
//					System.out.println(playerOne.getIndex());
			} else { 
				System.out.println("Try another button big fella.");
			}
			
			//pickup pelt at location 3, not working?
			if(playerOne.getIndex() == 3) {
				
			
				if(input[0].equals("yes") || input[0].equals("Yes")) {
					System.out.println("You pick up the pelt.");
					playerOne.setPelt(true);
					System.out.println(playerOne.hasPelt());
			}	
		}			 
			//trade pelt for key sequence
			if ((playerOne.getIndex() == 2 && playerOne.hasPelt() == true)) {
				 if(input[0].equals("yes") || input[0].equals("Yes")) {
				
					System.out.println("You hand the merchant the rare pelt. He gives you a big ol' key. \n"
							+ "This looks important...");
					playerOne.setKey(true);
					 System.out.println(playerOne.hasKey());
						str = s.nextLine();
						input = str.split(" ");
				 
				 }	else if(playerOne.getIndex() == 2 && playerOne.hasPelt() == false) {
				 System.out.println("The merchant disregards you, waving you away hurredly.");
				 } 
					 
					 
					 //movement
		}else if(input[0].equals("Left") || input[0].equals("left")) {
			System.out.println(playerOne.getIndex());
			goLeft(playerOne,kingdom);
		}else if(input[0].equals("Right") || input[0].equals("right")) {
			System.out.println(playerOne.getIndex());
			goRight(playerOne,kingdom);
		}else if(input[0].equals("Straight") || input[0].equals("straight")) {
			System.out.println(playerOne.getIndex());
			goStraight(playerOne,kingdom);
		}else if(input[0].equals("Back") || input[0].equals("back")) {
			System.out.println(playerOne.getIndex());
				goBack(playerOne,kingdom);
			
		
					}
				}
			}	
		}
	}