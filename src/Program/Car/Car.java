package Program.Car;

public class Car {

    //Type
    private CarCategory carCategory;

    //    kilometerstand
    private int kilometerstand;


    public Car(){

    }
    /**
     * Getter für kilometerstand
     *
     * @return
     */
    public Integer getKilometerstand() {
        return this.kilometerstand;
    }

    /**
     * Setter für kilometerstand
     *
     * @param neuer_kilometerstand
     */
    public void setKilometerstand(Integer neuer_kilometerstand) {
        this.kilometerstand = neuer_kilometerstand;
    }
}
