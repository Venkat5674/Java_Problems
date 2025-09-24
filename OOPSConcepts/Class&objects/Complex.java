public class Test {
    public static void main(String[] args) {
        Complex c1 = new Complex(10, 20);
        System.out.print("c1 = ");
        c1.print();

        Complex c2 = new Complex(20, 30);
        System.out.print("c2 = ");
        c2.print();

        // Adding c2 to c1
        c1.add(c2);
        System.out.print("After adding c2 to c1, c1 = ");
        c1.print();
    }
}

class Complex {
    int real, imag;

    // Constructor
    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    // Print method
    void print() {
        System.out.println(real + " + i" + imag);
    }

    // Add method
    void add(Complex c) {
        real = real + c.real;
        imag = imag + c.imag;
    }
}
