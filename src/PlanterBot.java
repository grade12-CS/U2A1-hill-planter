import becker.robots.*;

public abstract class PlanterBot extends RobotSE{
    public PlanterBot(City city, int x, int y, Direction direction, int things) {
        super(city, x, y, direction, things);
    }

    public PlanterBot(City city, int x, int y) {
        super(city, x, y, Direction.EAST, 50);
    }

    public abstract void climbHill();

    public abstract void descendHill();

    public void climbOnce() {
        turnLeft();
        move();
        turnRight();
        move();
    }

    public void descendOnce() {
        turnRight();
        move();
        turnLeft();
        move();
    }
} 
