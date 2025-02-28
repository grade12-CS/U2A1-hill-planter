import becker.robots.City;

public class RobotMain {

	public static void main(String[] args) {
		
		City field = new City("../PlantHills.wld");
		Thread task = new Thread(new RobotTask(field));
		Thread task2 = new Thread(new RobotTask2(field));
		Thread task4 = new Thread(new RobotTask4(field));
		Thread task3 = new Thread(new RobotTask3(field));
		System.out.println("start");
		task.start();
		task2.start();
		task3.start();
		task4.start();
	}

}
