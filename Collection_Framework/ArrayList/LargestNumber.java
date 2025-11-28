import java.util.*;

class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("Enter 5 numbers:");

        for(int i = 0; i < 5; i++){
            nums.add(sc.nextInt());
        }

        int max = Collections.max(nums);
        System.out.println("Largest number: " + max);
    }
}
