package Program;

import Program.Car.Car;
import Program.Car.CarManager;
import Program.Distance.DistanceLotToLot;
import Program.Distance.DistanceManager;
import Program.ParkingLot.ParkingLot;
import Program.ParkingLot.ParkingLotLocation;
import Program.ParkingLot.ParkingLotManager;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        System.out.println("List of vehicles in each parking lot:");

//        Car car1 = new Car();
//        System.out.println("before:" + car1.getMileage());
//
//        car1.setMileage(12);
//        System.out.println(car1.getMileage());


//        DistanceManager disManager= DistanceManager.getDistanceManager();
//
//        List<DistanceLotToLot> distances = disManager.getDistances();

//
//        for (int i=0; i<distances.size(); i++) {
//            System.out.println("Start: " + distances.get(i).getStart());
//            System.out.println("End: " + distances.get(i).getEnd());
//            System.out.println("Distance: " + distances.get(i).getDistance() + "km");
//        }
//
//        System.out.println(ParkingLotLocation.LotA.getAvailableSpots());

        ParkingLotManager parkManager = ParkingLotManager.getParkingLotManager();
        CarManager carManager = CarManager.getCarManager();
//        carManager.getAllCars();
//        System.out.println(carManager.getAllCars().get(0).getCurrentParkingLot());
//        carManager.transferCar(carManager.getAllCars().get(0),ParkingLotLocation.LotB);
//        System.out.println(carManager.getAllCars().get(0).getCurrentParkingLot());

        ParkingLotManager parkingLotManager = ParkingLotManager.getParkingLotManager();
        ParkingLot mainLot = parkingLotManager.getParkingLotByLocation(ParkingLotLocation.MainLot);
        ParkingLot lotA = parkingLotManager.getParkingLotByLocation(ParkingLotLocation.LotA);
        Car car = mainLot.getParkedCars().get(0);
        mainLot.getParkedCars().forEach(current->{
            System.out.println(current.getCarCategory());
        });
        System.out.println("lot a");
        lotA.getParkedCars().forEach(current->{
            System.out.println(current.getCarCategory());
        });

        carManager.transferCar(car,ParkingLotLocation.LotA);
        System.out.println("transferd car");

        mainLot.getParkedCars().forEach(current->{
            System.out.println(current.getCarCategory());
        });
        System.out.println("lot a");
        lotA.getParkedCars().forEach(current->{
            System.out.println(current.getCarCategory());
        });



    }
}
	
	

	
	
	
	
	

