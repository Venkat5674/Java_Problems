import java.util.Scanner;

public class TriangularNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int n = 1;   // term index
        int triangular = 1;

        while (triangular <= N) {
            System.out.print(triangular + " ");
            n++;
            triangular = n * (n + 1) / 2;  // next triangular number
        }
    }
}
