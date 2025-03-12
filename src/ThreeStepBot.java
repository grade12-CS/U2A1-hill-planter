import becker.robots.*;

/**
 * A planter bot that climbs and descends hill in three stesp
 */
public class ThreeStepBot extends PlanterBot{

    public ThreeStepBot(City city, int x, int y) {
        super(city, x, y);
    }

    /**
     * climbs and descends three steped-hill
     */
    public void completeThreeStepHill() {
        climbHill();
        descendHill();
    }

    /**
     * moves three steps up 
     */
    @Override
    public void climbHill() {
        move();
        plantThings(3);
        spin(3);
        climbOnce();
        move();
        climbOnce();
        move();
        climbOnce();
        move();
        plantThings(3);
        spin(3);
    }

    /**
     * moves three steps down 
     */
    @Override
    public void descendHill() {
        move();
        descendOnce();
		move();
        descendOnce();
        move();
        descendOnce();
        plantThings(3);
        spin(3);
        move();
    }
}
