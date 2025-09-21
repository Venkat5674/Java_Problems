import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
       int num = sc.nextInt();
       if(num % 2 == 0){
             // Check if the number is divisible by 2
           System.out.println(num + " is Even");
            // If remainder is 0, the number is even
       }else{
           System.out.println(num + " is Odd");
           // Otherwise, the number is odd
       }
    }
}
