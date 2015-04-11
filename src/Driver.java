
public class Driver {

	public static void main(String [] args) {
		//creating objects from Room class
		Room room1 = new Room("yellow", "hard wood floor", 1);
		Room room2 = new Room("purple", "tiled floor", 0);
		Room room3 = new Room("white", "carpeting floor", 3);
		//printing attributes from created objects
		System.out.println("Room 1 Specifications: " + room1);
		System.out.println("Room 2 Specifications: " + room2);
		System.out.println("Room 3 Specifications: " + room3);
	}
}
