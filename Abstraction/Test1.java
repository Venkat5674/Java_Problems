package abstraction;
//default package
public class Test1 {
    public static void main(String[] args) {
        // Use child class object instead of abstract class
        A1 obj = new B1();
        obj.m1();
        obj.m2();
        obj.m3(); // concrete method
    }
}
