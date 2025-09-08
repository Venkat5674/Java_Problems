import java.util.*;

public class SumUntilRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> seen = new HashSet<>();

        int sum = 0;
        while (true) {
            int num = sc.nextInt();
            if (num == 0) break;  // stop on 0

            sum += num;  // add to sum

            if (seen.contains(num)) {
                // first repeat found → stop including this one
                System.out.println(sum);
                return;
            }

            seen.add(num);
        }
    }
}
