import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // number of rows

        for (int i = 1; i <= N; i++) { // iterate over rows
            for (int j = 1; j <= i; j++) { // iterate over columns in the current row
                System.out.print("*");
                if (j != i) System.out.print(" "); // space between stars, no trailing space
            }
            System.out.println(); // move to next row
        }

        sc.close();
    }
}
