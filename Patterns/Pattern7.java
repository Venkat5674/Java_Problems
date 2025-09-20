import java.util.Scanner;

public class SquareBorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // size of the square

        for (int i = 1; i <= N; i++) { // iterate over rows
            for (int j = 1; j <= N; j++) { // iterate over columns
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print("*"); // border
                } else {
                    System.out.print(" "); // inside space
                }
            }
            System.out.println(); // next row
        }

        sc.close();
    }
}
