import becker.robots.*;

public abstract class PlanterBot extends RobotSE{
    public PlanterBot(City city, int x, int y, Direction direction, int things) {
        super(city, x, y, direction, things);
    }

    public PlanterBot(City city, int x, int y) {
        super(city, x, y, Direction.EAST, 50);
    }

    public void plantThings(int things) {
        for (int i = 0; i < things; ++i) {
            putThing();
        }
    }

    public abstract void climbTwoStepHill();

    public abstract void climbThreeStepHill();

    public abstract void descendTwoStepHill();

    public abstract void descendThreeStepHill();

    public void climbOnce() {
        turnLeft();
        move();
        turnRight();
    }

    public void descendOnce() {
        turnRight();
        move();
        turnLeft();
    }
} 
