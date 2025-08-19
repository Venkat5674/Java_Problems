class Dog {
    String name;
    String breed;

    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    void bark() {
        System.out.println(name + " is barking! Woof Woof!");
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Bruno", "Labrador");
        Dog d2 = new Dog("Tommy", "German Shepherd");

        d1.bark();
        d2.bark();
    }
}
