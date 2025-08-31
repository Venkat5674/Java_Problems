import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZoneExample {
    public static void main(String[] args) {
        ZonedDateTime india = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime newYork = ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println("Time in India: " + india);
        System.out.println("Time in New York: " + newYork);
    }
}
