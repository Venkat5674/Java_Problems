import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        int days = sc.nextInt();

        int fine;
        String result;

        switch (code) {
            case 1: // 1-5 days
                fine = days * 1;
                result = String.valueOf(fine);
                break;
            case 2: // 6-10 days
                fine = days * 2;
                result = String.valueOf(fine);
                break;
            case 3: // >10 days
                fine = days * 5;
                result = String.valueOf(fine);
                break;
            default:
                result = "Invalid Code";
        }

        System.out.println(result);
        sc.close();
    }
}
