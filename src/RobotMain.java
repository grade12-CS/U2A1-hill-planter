import becker.robots.City;

public class RobotMain {

	public static void main(String[] args) {
		City field = new City("../PlantHills.wld");
		RobotTask task = new RobotTask(field);
		task.run();
	}

}
