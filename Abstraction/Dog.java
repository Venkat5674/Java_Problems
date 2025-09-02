package abstraction;

public class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Woof woof...");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
