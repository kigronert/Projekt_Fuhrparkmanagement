package Program.Car;

import Program.ParkingLot.ParkingLotLocation;
import Program.RandomMileageGenerator;

public class Car {

    //Type
    private CarCategory carCategory;

    //mileage
    private int mileage;

    private ParkingLotLocation currentParkingLot;

    private boolean defect;

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public ParkingLotLocation getCurrentParkingLot() {
        return currentParkingLot;
    }

    public void setCurrentParkingLot(ParkingLotLocation currentParkingLot) {
        this.currentParkingLot = currentParkingLot;
    }



    public Car(CarCategory iCarCategory, ParkingLotLocation parkingLotLocation){
        this.carCategory = iCarCategory;
        this.defect = false;
        this.mileage = RandomMileageGenerator.getRandomMileage();
        this.currentParkingLot = parkingLotLocation;
    }
    /**
     * Getter for mileage
     *
     *
     * @return
     */
    public Integer getMileage() {
        return this.mileage;
    }

    /**
     * Setter for mileage
     *
     *
     * @param new_mileage
     *
     */
    public void setMileage(Integer new_mileage) {
        this.mileage = new_mileage;
    }

    public CarCategory getCarCategory() {
        return carCategory;
    }

    public void setCarCategory(CarCategory carCategory) {
        this.carCategory = carCategory;
    }

    public boolean isDefect() {
        return defect;
    }

    public void setDefect(boolean defect) {
        this.defect = defect;
    }

    public void addMileage (int addtionalMileage ){
        this.mileage += addtionalMileage;
    }
}
