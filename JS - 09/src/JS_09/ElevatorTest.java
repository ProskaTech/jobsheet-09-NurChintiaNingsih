/*
 * 
 * @Created by: 21343011 - Nur Chintia Ningsih
 */
package JS_09;

public class ElevatorTest {

	public static void main(String[] args) {
		Elevator myElevator = new Elevator ();
		myElevator.openDOOR();
		myElevator.closeDoor();
		myElevator.goUp();
		myElevator.goUp();
		myElevator.goUp();
		myElevator.openDOOR();
		myElevator.closeDoor();
		myElevator.goDown();
		myElevator.openDOOR();
		myElevator.closeDoor();
		myElevator.goDown();
		myElevator.setFloor(myElevator.TOP_FLOOR);
		myElevator.openDOOR();

	}

}
