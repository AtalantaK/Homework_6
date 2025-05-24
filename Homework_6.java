import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Homework_6 {
    public static void main(String[] args) {
        LocalDate publishDate = LocalDate.now().minusDays(0);
        LocalTime publishTime = LocalTime.now().minusMinutes(10);
        LocalDateTime timestamp = LocalDateTime.of(publishDate, publishTime);

        System.out.println("Исходный timestamp: " + timestamp);
        System.out.println("Результат работы программы: " + HumanReadableTimestampClass.getTimestamp(timestamp));
    }
}
