import java.util.Scanner;

class Bike {
    String brand;
    double price;

    Bike() {
        this("Honda", 50000);
    }

    Bike(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println("Bike Brand: " + brand + ", Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bike b1 = new Bike();
        b1.display();

        System.out.print("Enter Custom Bike Brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        Bike b2 = new Bike(brand, price);
        b2.display();
    }
}
