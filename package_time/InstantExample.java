package package_time;

import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        Instant now = Instant.now();  // Current timestamp (UTC)
        System.out.println("Current Instant (UTC): " + now);

        Instant later = now.plusSeconds(3600); // Add 1 hour
        System.out.println("One hour later: " + later);
    }
}
