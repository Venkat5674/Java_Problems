import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest;

        // Compare numbers
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println(largest);

        sc.close();
    }
}
