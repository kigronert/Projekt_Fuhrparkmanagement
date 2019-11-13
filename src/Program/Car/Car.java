package Program.Car;

public class Car {

    //Type
    private CarCategory carCategory;

    //    mileage
    private int mileage;


    public Car(){

    }
    /**
     * Getter for mileage
     *
     *
     * @return
     */
    public Integer getmileage() {
        return this.mileage;
    }

    /**
     * Setter for mileage
     *
     *
     * @param new_mileage
     *
     */
    public void setmileage(Integer new_mileage) {
        this.mileage = new_mileage;
    }
}
