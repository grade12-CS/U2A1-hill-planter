import becker.robots.*;

public class MyRobot extends PlanterBot {
    public MyRobot(City city, int x, int y) {
        super(city, x, y);
    }

    public void completeTwoStepHill() {
        climbTwoStepHill();
        descendTwoStepHill();
    }

    public void completeThreeStepHill() {
        climbThreeStepHill();
        descendThreeStepHill();
    }

    @Override
    public void climbTwoStepHill() {
        move();
        plantThings(2);
        climbOnce();
        move();
        climbOnce();
        move();
        plantThings(2);
    }

    @Override
    public void descendTwoStepHill() {
		move();
        descendOnce();
        move();
        descendOnce();
        plantThings(2);
        move();
    }

    @Override
    public void climbThreeStepHill() {
        move();
        plantThings(3);
        climbOnce();
        move();
        climbOnce();
        move();
        climbOnce();
        move();
        plantThings(3);
    }

    @Override
    public void descendThreeStepHill() {
        move();
        descendOnce();
		move();
        descendOnce();
        move();
        descendOnce();
        plantThings(3);
        move();
    }
}
