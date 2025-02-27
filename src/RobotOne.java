import becker.robots.*;

public class RobotOne extends PlanterBot {
    public RobotOne(City city, int x, int y) {
        super(city, x, y);
    }

    @Override
    public void climbHill() {
        move();
        putThing();
        climbOnce();
        climbOnce();
        putThing();
    }

    @Override
    public void descendHill() {
        descendOnce();
        descendOnce();
        putThing();
    }
}
