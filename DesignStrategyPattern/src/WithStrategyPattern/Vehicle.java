package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {

	DriveStrategy driveStrategyObj;

	public Vehicle(DriveStrategy driveStrategyObj) {
		super();
		this.driveStrategyObj = driveStrategyObj;
	}
	
	public void drive() {
		driveStrategyObj.drive();
	}
	
}
