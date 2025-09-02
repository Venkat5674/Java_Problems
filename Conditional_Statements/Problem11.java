import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: income
        long income = sc.nextLong();
        int taxPercent;

        // Determine tax bracket
        if (income <= 10000) {
            taxPercent = 0;
        } else if (income <= 50000) {
            taxPercent = 10;
        } else if (income <= 100000) {
            taxPercent = 20;
        } else {
            taxPercent = 30;
        }

        // Output the tax percentage
        System.out.println(taxPercent);

        sc.close();
    }
}
