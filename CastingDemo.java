/**
 * Q3: Upcasting vs Downcasting
 * This program demonstrates upcasting and downcasting in Java.
 *
 * a) Differences:
 *
 * Definition:
 * Upcasting: Casting a subtype object to a supertype reference.
 * It's like saying a 'Dog' is an 'Animal'.
 * Downcasting: Casting a supertype reference (that already points to a
 * subtype object) back to its original subtype reference.
 *
 * Syntax:
 * Upcasting: Implicit (done automatically by the compiler).
 * Animal myAnimal = new Dog();
 * Downcasting: Explicit (must be done manually by the programmer).
 * Dog myDog = (Dog) myAnimal;
 *
 * Safety:
 * Upcasting: Always safe and never fails. It's guaranteed that a Dog is an Animal.
 * This is checked at compile-time.
 * Downcasting: Can fail at runtime if the object being cast is not actually of the
 * target subtype. This can lead to a ClassCastException. It's only
 * safe if you are certain of the object's true type.
 */

// Superclass
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof! Woof!");
    }

    public void fetch() {
        System.out.println("The dog is fetching the ball.");
    }
}

public class CastingDemo {
    public static void main(String[] args) {
        // --- UPCASTING ---
        // A Dog object is created, and its reference is assigned to an Animal reference.
        // This is upcasting. It happens implicitly and is always safe.
        System.out.println("--- Demonstrating Upcasting ---");
        Animal myAnimal = new Dog(); // Implicit upcasting

        // We can call methods of the Animal class.
        // The overridden Dog version of makeSound() will be called due to polymorphism.
        myAnimal.makeSound();

        // NOTE: We cannot call the fetch() method using the 'myAnimal' reference
        // because the Animal class does not have a fetch() method.
        // myAnimal.fetch(); // This would cause a compile-time error.
        System.out.println("\nUpcasting complete. 'myAnimal' reference cannot access Dog-specific methods like fetch().\n");


        // --- DOWNCASTING ---
        // To access the fetch() method, we need to convert the Animal reference
        // back to a Dog reference. This is downcasting and must be explicit.
        System.out.println("--- Demonstrating Downcasting ---");

        // It's a good practice to check the instance type before downcasting
        // to avoid a ClassCastException.
        if (myAnimal instanceof Dog) {
            // Explicitly cast the Animal reference to a Dog reference.
            Dog myDog = (Dog) myAnimal;

            // Now we can call methods from both Animal and Dog classes.
            myDog.makeSound(); // Calls the overridden method
            myDog.fetch();     // Calls the Dog-specific method
            System.out.println("\nDowncasting successful! 'myDog' reference can now access fetch().");
        } else {
             System.out.println("Cannot downcast: the object is not a Dog.");
        }
    }
}
