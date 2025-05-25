import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Homework_6 {
    public static void main(String[] args) {

        LocalDate publishDate = LocalDate.now();
        LocalTime publishTime = LocalTime.now();
        LocalDateTime timestamp = LocalDateTime.of(publishDate, publishTime);
        System.out.println("\nИсходный timestamp: " + timestamp + ". "
                + HumanReadableTimestampClass.getTimestamp(timestamp) + "\n");

        //Проверяем смещение в днях
        for (int i = 1; i < 200; i++) {
            publishDate = LocalDate.now().minusDays(i);
            timestamp = LocalDateTime.of(publishDate, publishTime);
            System.out.println("Смещение в днях: " + i + ". " + HumanReadableTimestampClass.getTimestamp(timestamp));
        }
        System.out.println();

        //Проверяем смещение в часах
        for (int i = 1; i < 24; i++) {
            publishDate = LocalDate.now();
            publishTime = LocalTime.now().minusHours(i);
            timestamp = LocalDateTime.of(publishDate, publishTime);
            System.out.println("Смещение в часах: " + i + ". " + HumanReadableTimestampClass.getTimestamp(timestamp));
        }
        System.out.println();

        //Проверяем смещение в минутах
        for (int i = 1; i < 60; i++) {
            publishDate = LocalDate.now();
            publishTime = LocalTime.now().minusMinutes(i);
            timestamp = LocalDateTime.of(publishDate, publishTime);
            System.out.println("Смещение в минутах: " + i + ". " + HumanReadableTimestampClass.getTimestamp(timestamp));
        }
        System.out.println();


    }
}
