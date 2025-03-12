import becker.robots.*;

public class ThreeStepBot extends PlanterBot{

    public ThreeStepBot(City city, int x, int y) {
        super(city, x, y);
    }

    public void completeThreeStepHill() {
        climbHill();
        descendHill();
    }

    @Override
    public void climbHill() {
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
    public void descendHill() {
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
