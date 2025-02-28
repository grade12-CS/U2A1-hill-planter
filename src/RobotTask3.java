import becker.robots.City;

public class RobotTask3 implements Runnable{
    private final City field;
	
	public RobotTask3(City field) {
		this.field = field;
		field.showThingCounts(true);
	}

    @Override
	public void run() {
		MyRobot robot = new MyRobot(field, 23, 6);
		robot.completeTwoStepHill();
	}
}
