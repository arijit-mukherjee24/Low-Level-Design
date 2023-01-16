package WithStrategyPattern;

import WithStrategyPattern.Strategy.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle {

	public OffRoadVehicle() {
		super(new SpecialDriveStrategy());
	}

}
