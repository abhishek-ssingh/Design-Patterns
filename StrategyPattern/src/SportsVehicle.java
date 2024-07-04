import WithStrategyPattern.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

    /**
     *  constructor requires super(), since its derived
     *
     *  when its object is created, it will pass SportsDriveStrategy obj to base vehicle
     *  so now we can use the SportsDriveStrategy drive obj
     */
    SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
