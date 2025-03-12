/**
 Write a program that will plant things in a field that has six rows and six columns. We want the odd
numbered rows (first, third, and fifth) to have two things on each corner and we want the other rows to
have three things on each corner. In addition, the Robot will spin after each plant according to the
number of things it planted (ie. if it plant two things, it will spin twice before moving to the next corner)

 * @author YOU
 */
import becker.robots.*;

public class RobotTask implements Runnable{
	private Thread t1, t2, t3, t4;
	
	public RobotTask(City field) {
		field.showThingCounts(true);
		t1 = new Thread(() -> {
			TwoStepBot two = new TwoStepBot(field, 0, 6);
			two.move();
			two.completeTwoStepHill();
		});
		t2 = new Thread(() -> {
			ThreeStepBot three = new ThreeStepBot(field, 7, 6);
			three.completeThreeStepHill();
		});
		t3 = new Thread(() -> {
			ThreeStepBot three = new ThreeStepBot(field, 15, 6);
			three.completeThreeStepHill();
		});
		t4 = new Thread(() -> {
			TwoStepBot two = new TwoStepBot(field, 23, 6);
			two.completeTwoStepHill();
		});
	}

	/**
	 * runs robot task to complete the planting
	 */
	@Override
	public void run() {
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}