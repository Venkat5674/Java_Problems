import java.util.*;

class DecitoBinary{
    
    public static void dectobin(int n){
        String s = "";
        while(n > 0){
            s = (n%2)+s;
            n = n/2;
        }
        System.out.print(s);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dectobin(n);
    }
}
