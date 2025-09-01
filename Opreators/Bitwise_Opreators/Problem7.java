import java.util.Scanner;

public class AccessCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int permissions = sc.nextInt();  // permission state
        int bit1 = sc.nextInt();         // first bit position
        int bit2 = sc.nextInt();         // second bit position
        
        boolean result = isAccessGranted(permissions, bit1, bit2);
        
        System.out.println(result);
        
        sc.close();
    }

    public static boolean isAccessGranted(int permissions, int bit1, int bit2) {
        boolean check1 = (permissions & (1 << bit1)) != 0;
        boolean check2 = (permissions & (1 << bit2)) != 0;
        return check1 || check2;  // access granted if either bit is set
    }
}
