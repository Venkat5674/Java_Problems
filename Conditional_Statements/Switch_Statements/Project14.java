import java.util.Scanner;

class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();    // Region code
        int income = sc.nextInt();  // Income

        int tax;
        String result;

        switch (code) {
            case 1: // North → 5%
                tax = (income * 5) / 100;
                result = String.valueOf(tax);
                break;

            case 2: // South → 6%
                tax = (income * 6) / 100;
                result = String.valueOf(tax);
                break;

            case 3: // East → 7%
                tax = (income * 7) / 100;
                result = String.valueOf(tax);
                break;

            case 4: // West → 8%
                tax = (income * 8) / 100;
                result = String.valueOf(tax);
                break;

            default: // Invalid code
                result = "Invalid Region";
        }

        System.out.println(result);
        sc.close();
    }
}
