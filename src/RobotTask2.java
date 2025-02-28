import becker.robots.*;

public class RobotTask2 implements Runnable{
    private final City field;
	
	public RobotTask2(City field) {
		this.field = field;
		field.showThingCounts(true);
	}

    @Override
    public void run() {
        MyRobot robot = new MyRobot(field, 7, 6);
        robot.completeThreeStepHill();
    }
}
