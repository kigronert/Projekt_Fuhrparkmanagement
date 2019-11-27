package Program.Car;

import Program.Distance.DistanceManager;
import Program.ParkingLot.ParkingLot;
import Program.ParkingLot.ParkingLotLocation;
import Program.ParkingLot.ParkingLotManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Creates inital cars
 * Moves cars from one spot to another
 * Change defect car with car from Main Lot of the same type
 * Return List of all cars (sort by mileage)
 * */


public class CarManager {

    private static CarManager singleInstance = null;



    private static List<Car> allCars = new ArrayList<>();
    public static CarManager getCarManager(){
        if (singleInstance == null){
            singleInstance = new CarManager();
        }
        return singleInstance;
    }
    // Constructer
    private CarManager (){
        //create cars
        this.createInitialCars();
    }

    private void createInitialCars() {
        //Jeder Standort erhält 2 Sportwagen, 3 Wagen der Kompaktklasse, einen Wagen der Luxusklasse und einen Kleinbus.
        ParkingLotManager parkingLotManager = ParkingLotManager.getParkingLotManager();
        List<ParkingLot> parkingLotList = parkingLotManager.getParkingLots();

        for(int i =0; i<parkingLotList.size();i++){
            List<Car> carList = new ArrayList<>();
            carList.add(new Car(CarCategory.SP, parkingLotList.get(i).getParkingLotLocation()));
            carList.add(new Car(CarCategory.SP, parkingLotList.get(i).getParkingLotLocation()));
            carList.add(new Car(CarCategory.KO, parkingLotList.get(i).getParkingLotLocation()));
            carList.add(new Car(CarCategory.KO, parkingLotList.get(i).getParkingLotLocation()));
            carList.add(new Car(CarCategory.KO, parkingLotList.get(i).getParkingLotLocation()));
            carList.add(new Car(CarCategory.LU, parkingLotList.get(i).getParkingLotLocation()));
            carList.add(new Car(CarCategory.KL, parkingLotList.get(i).getParkingLotLocation()));
            //adding cars to parking Lot
            ParkingLot parkingLot = parkingLotList.get(i);
            parkingLot.setParkedCars(carList);

            allCars.addAll(carList);
        }
    }
    public List<Car> getAllCars() {
        return allCars;
    }

    public void setAllCars(List<Car> allCars) {
        CarManager.allCars = allCars;
    }

    public boolean transferCar (Car carToTransfer, ParkingLotLocation targetParkingLotLocation){
        // check if enough space at new parking lot
        //@todo

        // check if new location and old are the same
        ParkingLotLocation oldParkingLotLocation = carToTransfer.getCurrentParkingLot();
        if(oldParkingLotLocation == targetParkingLotLocation){
            return false;
        }


        // add km distance to car
        DistanceManager distanceManager = DistanceManager.getDistanceManager();
        int distance = distanceManager.getDistanceFromStartToEnd(oldParkingLotLocation, targetParkingLotLocation);
        carToTransfer.addMileage(distance);
        // move car to new location
        carToTransfer.setCurrentParkingLot(targetParkingLotLocation);

        ParkingLotManager parkingLotManager = ParkingLotManager.getParkingLotManager();
        //remove car from old location list
        ParkingLot oldParkingLot = parkingLotManager.getParkingLotByLocation(oldParkingLotLocation);
        oldParkingLot.removeCarFromList(carToTransfer);
        //add car to new location list
        ParkingLot targetParkingLot = parkingLotManager.getParkingLotByLocation(targetParkingLotLocation);
        targetParkingLot.addCarToList(carToTransfer);
        return true;
    }

}
