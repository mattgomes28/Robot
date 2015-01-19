/* A program to allow a robot to navigate an obstacle course
* Written by: Tom Hughes and Mat Gomes
* First written: 19/01/2015
* Last updated: 19/01/2015
*/
import icommand.nxt.*;
import icommand.nxt.comm.NXTCommand;

public enum Direction {
	LEFT,
	RIGHT
}

public class Robot { 
	//declare objects to represent sensors here

	public static void main (String[] args) {
	
		NXTCommand.open();
		NXTCommand.setVerify(true);
		//statements to control the robot

		turn("left"); //check function works;;;;;;

		NXTCommmand.close();
	}

	public static void turn(String direction){

		switch (Direction.valueOf(direction.toUpperCase())){
			case LEFT:
				Motor.C.setSpeed(500);
				Motor.C.forward(); // Makes the motor turn forward

				Thread.sleep(2); //Waits for 2 seconds before continueing

				Motor.C.stop(); //Ends motor rotation
				break;

			case RIGHT:
				Motor.B.setSpeed(500);
				Motor.B.forward(); // Makes the motor turn forward

				Thread.sleep(2); //Waits for 2 seconds before continueing

				Motor.B.stop(); //Ends motor rotation
				break;
		}
	}
}