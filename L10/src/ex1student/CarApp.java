package ex1student;

public class CarApp {

    public static void main(String[] args) {
        Car myCar = new Car("VW UP", "White", "AB 12.345", 50000);
        System.out.println("Test: " + myCar.toString());
        System.out.println();

        String brand = myCar.brand;
        System.out.println("Brand " + brand);
        System.out.println("My car: " + myCar.brand + ", " + myCar.color);

        myCar.km = 65000;
        System.out.println("Km nu: " + myCar.km + "\n");


        // b) Add a new car to the CarApp class. You decide the brand, the color, the registration
        // number of the car, km is 0.

        Car newCar = new Car("Mercedes", "Black", "Hilmar", 0);

        // c) In the CarApp class, add some code that prints the new car’s color and brand using the
        // fields in the Car class

        String color = newCar.color;
        brand = newCar.brand;

        System.out.println("Color: " + color + "\n" + "Brand: " + brand + "\n");

        // d) In the CarApp class, add some code that gives the new car a mileage (in km). Print the
        // new car’s mileage.

        newCar.km = 100;
        int mileage = newCar.km;

        System.out.println("Mileage: " + mileage + "\n");

        // e) In the Car class, add a method, that prints all information about a car. Test the method
        // in the CarApp class on both cars.

        myCar.getCar();
        newCar.getCar();

    }
}
