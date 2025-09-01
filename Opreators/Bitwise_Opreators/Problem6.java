import java.util.Scanner;

public class ConditionalToggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int features = sc.nextInt();     // current features state
        int conditionBit = sc.nextInt(); // condition bit
        int targetBit = sc.nextInt();    // target bit to toggle
        
        int result = toggleIfCondition(features, conditionBit, targetBit);
        
        System.out.println(result);
        
        sc.close();
    }

    public static int toggleIfCondition(int features, int conditionBit, int targetBit) {
        if ((features & (1 << conditionBit)) != 0) {
            return features ^ (1 << targetBit); // toggle target bit
        }
        return features; // unchanged
    }
}
