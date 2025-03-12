import becker.robots.*;

public abstract class PlanterBot extends RobotSE{

    /**
     * @param city city that will be displayed to the map 
     * @param x the x coordinate of the starting position 
     * @param y the y coordinate of the starting position
     * @param direction initial robot heading
     * @param things initial number of things robot holds
     */
    public PlanterBot(City city, int x, int y, Direction direction, int things) {
        super(city, y, x, direction, things);
    }

    /**
     * @param city city that will be displayed to the map 
     * @param x the x coordinate of the starting position 
     * @param y the y coordinate of the starting position 
     * *default heading: East
     */
    public PlanterBot(City city, int x, int y) {
        super(city, y, x, Direction.EAST, 50);
    }

    /**
     * abstract method for climbing a hill. Number of steps can differ in robots.
     */
    public abstract void climbHill();

    /**
     * abstract method for descending a hill. Number of steps can differ in robots.
     */
    public abstract void descendHill();

    /**
     * Plant things for defined amount of number. 
     * @param things the number of things to put.
     */
    public void plantThings(int things) {
        for (int i = 0; i < things; ++i) {
            putThing();
        }
    }

    /**
     * moves one step up
     */
    public void climbOnce() {
        turnLeft();
        move();
        turnRight();
    }

    /**
     * moves one step down
     */
    public void descendOnce() {
        turnRight();
        move();
        turnLeft();
    }
} 
