import java.util.Scanner;

public class TranslationApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Translation App =====");
        System.out.println("1. English");
        System.out.println("2. Spanish");
        System.out.println("3. French");
        System.out.println("4. German");
        System.out.println("5. Italian");
        System.out.println("6. Hindi");
        System.out.println("7. Telugu");

        System.out.print("Enter your choice (1-7): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Hello (English)");
                break;
            case 2:
                System.out.println("Hola (Spanish)");
                break;
            case 3:
                System.out.println("Bonjour (French)");
                break;
            case 4:
                System.out.println("Hallo (German)");
                break;
            case 5:
                System.out.println("Ciao (Italian)");
                break;
            case 6:
                System.out.println("नमस्ते (Hindi)");
                break;
            case 7:
                System.out.println("హలో (Telugu)");
                break;
            default:
                System.out.println("Invalid choice! Please enter 1-7.");
        }

        sc.close();
    }
}
