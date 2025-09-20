import java.util.Scanner;

public class Hollow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i == 1) {
                // First row: single star
                System.out.println("*");
            } else if (i == N) {
                // Last row: all stars
                for (int j = 1; j <= N; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                // Middle rows: star, spaces, star
                System.out.print("*"); // first star

                // spaces increase with row number
                for (int j = 1; j <= i - 2; j++) {
                    System.out.print(" "); // single space between stars
                }

                System.out.println("*"); // last star
            }
        }

        sc.close();
    }
}
