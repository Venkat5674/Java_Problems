// Defining a class
class Car {
    // Properties (fields)
    String brand;
    int year;

    // Method (behavior)
    void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating an object of Car
        Car car1 = new Car();

        // Initializing object data
        car1.brand = "Toyota";
        car1.year = 2020;

        // Calling method using object
        car1.displayInfo();

        // Creating another object
        Car car2 = new Car();
        car2.brand = "Honda";
        car2.year = 2022;
        car2.displayInfo();
    }
}
