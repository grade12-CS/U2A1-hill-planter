import becker.robots.City;

public class RobotTask4 implements Runnable {
    private final City field;
	
	public RobotTask4(City field) {
		this.field = field;
		field.showThingCounts(true);
	}

    @Override
    public void run() {
        MyRobot robot = new MyRobot(field, 15, 6);
        robot.completeThreeStepHill();
    }
}
