import java.util.Scanner;

public class TrafficSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the full line, e.g. "Yellow 15"
        String input = sc.nextLine();
        String[] parts = input.split(" ");

        String light = parts[0];
        int hour = Integer.parseInt(parts[1]);

        String result = "";

        if (light.equalsIgnoreCase("Green")) {
            result = "Go";
        } else if (light.equalsIgnoreCase("Red")) {
            result = "Stop";
        } else if (light.equalsIgnoreCase("Yellow")) {
            if (hour >= 6 && hour < 18) {
                result = "Slow";
            } else {
                result = "Stop";
            }
        }

        System.out.println(result);
        sc.close();
    }
}
