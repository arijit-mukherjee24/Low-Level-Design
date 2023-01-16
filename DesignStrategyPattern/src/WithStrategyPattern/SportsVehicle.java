package WithStrategyPattern;

import WithStrategyPattern.Strategy.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle {

	public SportsVehicle() {
		super(new SpecialDriveStrategy());
	}

}
