import java.util.Scanner;

class KmToMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();

        double meters = km * 1000;
        System.out.println("Meters = " + meters);
    }
}
