import java.util.*;

class ReverseString{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
    
        String a = sc.nextLine();
        String b = "";
        
        int ptr = a.length()-1;
        while(ptr >= 0){
            b = b+a.charAt(ptr);
            ptr--;
        }
        System.out.println(b);
    }
}
