import java.util.Scanner;

public class NumPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // number of rows

        for (int i = 1; i <= N; i++) { // include the N-th row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j != i) System.out.print(" "); // space between numbers
            }
            System.out.println(); // move to next row
        }

        sc.close();
    }
}
