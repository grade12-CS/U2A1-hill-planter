import becker.robots.*;

/**
 * A planter bot that climbs and descends hill in two stesp
 */
public class TwoStepBot extends PlanterBot {

    public TwoStepBot(City city, int x, int y) {
        super(city, x, y);
    }

    /**
     * climbs and descends a two-steped hill
     */
    public void completeTwoStepHill() {
        climbHill();
        descendHill();
    }

    /**
     * moves two steps up 
     */
    @Override
    public void climbHill() {
        move();
        plantThings(2);
        spin(2);
        climbOnce();
        move();
        climbOnce();
        move();
        plantThings(2);
        spin(2);
    }

    /**
     * moves two steps down
     */
    @Override
    public void descendHill() {
		move();
        descendOnce();
        move();
        descendOnce();
        plantThings(2);
        spin(2);
        move();
    }
}
