import java.util.*;

public class QuadrilateralClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        if (a == b && b == c && c == d) {
            System.out.println("Square");
        } else if (a == c && b == d) {
            System.out.println("Rectangle");
        } else {
            System.out.println("Other");
        }
    }
}
