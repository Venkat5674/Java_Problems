import java.util.Scanner;

class HotelPricing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int room = sc.nextInt();   // 1 for Standard, 2 for Deluxe
        int season = sc.nextInt(); // 1 for Peak, 2 for Off-Peak

        String price;

        switch (room) {
            case 1: // Standard
                if (season == 1) {
                    price = "$100"; // Peak
                } else if (season == 2) {
                    price = "$80";  // Off-Peak
                } else {
                    price = "Invalid Input";
                }
                break;

            case 2: // Deluxe
                if (season == 1) {
                    price = "$200"; // Peak
                } else if (season == 2) {
                    price = "$150"; // Off-Peak
                } else {
                    price = "Invalid Input";
                }
                break;

            default:
                price = "Invalid Input";
        }

        System.out.println(price);
        sc.close();
    }
}
