/**
 * Room class is used for creating a room 
 * Example:
 * Room room1 = new Room("yellow", "hard wood floor", 1);
 * 
 * @author franzperez
 *
 */
public class Room {

	private String color;
	private String floor;
	private int windows;
	/**
	 * initialize the room values to default
	 */
	public Room() {
		this.color = "";
		this.floor = "";
		this.windows = 0;
	}
	/**
	 * initialize the room values
	 * @param color
	 * @param floor
	 * @param windows
	 */
	public Room(String color, String floor, int windows) {
		this.color = color;
		this.floor = floor;
		this.windows = windows;
	}
	/**
	 * set method for the color of the walls
	 * set the color of the walls in String type
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * get method for the color of the walls
	 * the current color of the walls
	 */
	public String getColor() {
		return this.color;
	}
	/**
	 * set method for the type of flooring
	 * set the type of flooring in String type
	 */
	public void setFloor(String floor) {
		this.floor = floor;
	}
	/**
	 * get method for the type of flooring 
	 * the current type of flooring
	 */
	public String getFloor() {
		return this.floor;
	}
	/**
	 * set method for the number of windows
	 * set the number of windows in int type
	 */
	public void setWindows(int windows) {
		this.windows = windows;
	}
	/**
	 * get method for the number of windows
	 * the current number of windows
	 */
	public int getWindows() {
		return this.windows;
	}
	/**
	 * returns the attributes of the room
	 */
	public String toString() {
		return "[Wall Color: " + this.color + ", Floor Type: " + this.floor + ", Number of Windows: " + this.windows + "]";
	}
}
