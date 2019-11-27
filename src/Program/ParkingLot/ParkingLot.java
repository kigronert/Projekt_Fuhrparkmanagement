package Program.ParkingLot;

import Program.Car.Car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParkingLot {

    ParkingLotLocation parkingLotLocation;


//    liste mit parked cars
    List<Car> parkedCars = new ArrayList<Car>();

    //constructor
    public ParkingLot(ParkingLotLocation parkingLotLocation) {
        this.parkingLotLocation = parkingLotLocation;
    }

    public ParkingLotLocation getParkingLotLocation() {
        return parkingLotLocation;
    }

    public void setParkingLotLocation(ParkingLotLocation parkingLotLocation) {
        this.parkingLotLocation = parkingLotLocation;
    }

    public List<Car> getParkedCars() {
        return parkedCars;
    }

    public void setParkedCars(List<Car> parkedCars) {
        this.parkedCars = parkedCars;
    }

    public void removeCarFromList(Car car){
        Iterator<Car> itr = this.parkedCars.iterator();
        // remove all even numbers
        while (itr.hasNext()) {
            Car currentCar = itr.next();
            if (currentCar == car) {
                itr.remove();
            }
        }
    }

    public void addCarToList(Car car){
        this.parkedCars.add(car);
    }
}

