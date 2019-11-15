package Program;

import Program.Car.Car;
import Program.ParkingLot.DistanceLotToLot;
import Program.ParkingLot.DistanceManager;
import Program.ParkingLot.ParkingLot;
import Program.ParkingLot.ParkingLotLocation;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        System.out.println("List of vehicles in each parking lot:");

        Car car1 = new Car();
        System.out.println("before:" + car1.getMileage());

        car1.setMileage(12);
        System.out.println(car1.getMileage());


        DistanceManager disManager= DistanceManager.getDistanceManager();

        ArrayList<DistanceLotToLot> distances = disManager.getDistances();

        for (int i=0; i<distances.size(); i++) {
            System.out.println("Start: " + distances.get(i).getStart());
            System.out.println("End: " + distances.get(i).getEnd());
            System.out.println("Distance: " + distances.get(i).getDistance() + "km");
        }
    }
}
	
	

	
	
	
	
	

