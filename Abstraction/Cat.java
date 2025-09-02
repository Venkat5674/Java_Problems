package abstraction;

public class Cat implements Animal {

    @Override
    public void sound() {
        System.out.println("Meow... Meow...");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating fish");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}
