import java.io.*;

class OuterClass {
    static class StaticNestedClass {
        void display() {
            System.out.println("Inside static nested class.");
        }
    }
}

public class Test {
    public static void main(String[] args) throws IOException {
        // Creating an instance of the static nested class
        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        nested.display(); 
    }
}
