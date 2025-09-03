import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 10000;  // initial balance
        int choice, amount;

        System.out.println("===== ATM Machine =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your balance is: ₹" + balance);
                break;
            case 2:
                System.out.print("Enter amount to deposit: ₹");
                amount = sc.nextInt();
                balance += amount;
                System.out.println("Amount deposited successfully!");
                System.out.println("Updated Balance: ₹" + balance);
                break;
            case 3:
                System.out.print("Enter amount to withdraw: ₹");
                amount = sc.nextInt();
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Please collect your cash!");
                    System.out.println("Updated Balance: ₹" + balance);
                } else {
                    System.out.println("Insufficient balance!");
                }
                break;
            case 4:
                System.out.println("Thank you for using ATM!");
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }

        sc.close();
    }
}
