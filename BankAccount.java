import java.util.Scanner;

class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber) {
        this(accountNumber, 1000); // default balance
    }

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    BankAccount deposit(double amount) {
        balance += amount;
        return this;
    }

    BankAccount withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient Balance!");
        return this;
    }

    void displayBalance() {
        System.out.println("Account " + accountNumber + " Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        BankAccount acc = new BankAccount(accNo);

        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();
        System.out.print("Enter withdraw amount: ");
        double wd = sc.nextDouble();

        acc.deposit(dep).withdraw(wd).displayBalance();
    }
}
