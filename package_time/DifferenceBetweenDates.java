import java.time.LocalDate;
import java.time.Period;
import java.time.LocalTime;
import java.time.Duration;

public class DifferenceBetweenDates {
    public static void main(String[] args) {
        // Difference in Dates
        LocalDate date1 = LocalDate.of(2022, 5, 10);
        LocalDate date2 = LocalDate.of(2025, 8, 31);
        Period period = Period.between(date1, date2);

        System.out.println("Years: " + period.getYears() + ", Months: " + period.getMonths() + ", Days: " + period.getDays());

        // Difference in Time
        LocalTime t1 = LocalTime.of(10, 30);
        LocalTime t2 = LocalTime.of(15, 45);
        Duration duration = Duration.between(t1, t2);

        System.out.println("Hours: " + duration.toHours() + ", Minutes: " + duration.toMinutes());
    }
}
