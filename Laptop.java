class Laptop {
    String brand;
    double price;

    Laptop(String brand, double price) {
        this.brand = brand;   // using this
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Price: " + price);
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell", 55000);
        Laptop l2 = new Laptop("HP", 45000);

        l1.display();
        l2.display();
    }
}
