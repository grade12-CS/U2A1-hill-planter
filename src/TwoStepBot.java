import becker.robots.*;

public class TwoStepBot extends PlanterBot {

    public TwoStepBot(City city, int x, int y) {
        super(city, x, y);
    }

    public void completeTwoStepHill() {
        climbHill();
        descendHill();
    }

    @Override
    public void climbHill() {
        move();
        plantThings(2);
        climbOnce();
        move();
        climbOnce();
        move();
        plantThings(2);
    }

    @Override
    public void descendHill() {
		move();
        descendOnce();
        move();
        descendOnce();
        plantThings(2);
        move();
    }
}
