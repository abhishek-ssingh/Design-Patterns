import WithStrategyPattern.DriveStrategy;
import WithStrategyPattern.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{

    /**
     *  constructor requires super(), since its derived
     *
     *  when its object is created, it will pass NormalDriveStrategy obj to base vehicle
     *  so now we can use the NormalDriveStrategy drive obj
     */
    NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
