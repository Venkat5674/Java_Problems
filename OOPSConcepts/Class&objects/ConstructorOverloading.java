class Point {
    int x, y;

    // Default Constructor
    Point() {
        x = 0;
        y = 0;
    }

    // Parameterized Constructor
    Point(int a, int b) {
        x = a;
        y = b;
    }

    void print() {
        System.out.println("x = " + x + ", y = " + y);
    }
}

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point();        
        Point p2 = new Point(10, 20); 
        p1.print();  
        p2.print();  
    }
}
