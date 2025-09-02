package abstraction;

public class MainTest {
    public static void main(String[] args) {
        // Calculator test
        Calci2 calc = new Calculator();
        calc.add(10, 5);
        calc.sub(10, 5);
        calc.mult(10, 5);
        calc.div(10, 5);

        // Animal test
        Animal cat = new Cat();
        cat.sound();
        cat.eat();
        cat.sleep();

        Animal dog = new Dog();
        dog.sound();
        dog.eat();
        dog.sleep();
    }
}
