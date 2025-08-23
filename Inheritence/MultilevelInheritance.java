// Base class
class Vehicle {
    void run() {
        System.out.println("Vehicle is running...");
    }
}

// Child class
class Car extends Vehicle {
    void wheels() {
        System.out.println("Car has 4 wheels.");
    }
}

// Grandchild class
class SportsCar extends Car {
    void speed() {
        System.out.println("Sports car runs very fast!");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.run();     // from Vehicle
        sc.wheels();  // from Car
        sc.speed();   // from SportsCar
    }
}
