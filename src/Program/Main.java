package Program;

import Program.Car.Car;

public class Main {

    public static void main(String[] args) {

        System.out.println("List of vehicles in each parking lot:");

        Car car1 = new Car();
        System.out.println("before:" + car1.getMileage());

        car1.setMileage(12);
        System.out.println(car1.getMileage());

    }
}
	
	

	
	
	
	
	

