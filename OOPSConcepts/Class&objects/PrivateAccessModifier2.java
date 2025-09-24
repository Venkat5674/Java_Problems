public class Main{
    public static void main(String [] args){
        BankAccount acc = new BankAccount();
        
        acc.displayBalance();
    }
}

class BankAccount{
    private double balance = 1000;
    
    private void showBalance(){
        System.out.println("Current Balance : " + balance);
    }
    
    public void displayBalance(){
        showBalance();
    }
}
