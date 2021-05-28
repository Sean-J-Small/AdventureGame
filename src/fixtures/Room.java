package fixtures;

//import java.util.ArrayList;

//Use to generate and interact with your rooms

public class Room extends Fixture {
	
	public int straightDist;
	
	public int leftDist;
	
	public int rightDist;
	
	
	public String item;
	
	
	public Room(String name, String shortDescription, String longDescription, int straight, int left, int right, String str) {
		super(name, shortDescription, longDescription);
		this.straightDist = straight;
		this.leftDist = left;
		this.rightDist = right;
		this.item = str;
	}
}