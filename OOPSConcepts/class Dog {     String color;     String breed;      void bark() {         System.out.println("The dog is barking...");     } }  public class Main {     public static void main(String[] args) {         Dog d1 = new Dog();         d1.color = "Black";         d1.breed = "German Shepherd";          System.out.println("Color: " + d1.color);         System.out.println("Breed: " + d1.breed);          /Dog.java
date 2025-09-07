class Dog {
    String color;
    String breed;

    void bark() {
        System.out.println("The dog is barking...");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.color = "Black";
        d1.breed = "German Shepherd";

        System.out.println("Color: " + d1.color);
        System.out.println("Breed: " + d1.breed);

        // Call method
        d1.bark();
    }
}
