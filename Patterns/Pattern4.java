import java.util.Scanner;

public class InvertedStarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // number of rows

        for (int i = 1; i <= N; i++) { // iterate over rows
            for (int j = 1; j <= N - i + 1; j++) { // stars in current row
                System.out.print("*");
                if (j != N - i + 1) System.out.print(" "); // space between stars
            }
            System.out.println(); // move to next row
        }

        sc.close();
    }
}
