import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Homework_6 {
    public static void main(String[] args) {
        LocalDate publishDate = LocalDate.now().minusDays(0);
        LocalTime publishTime = LocalTime.now().minusMinutes(60);

        LocalDateTime timestamp = LocalDateTime.of(publishDate, publishTime);

        //LocalDateTime timestamp = LocalDateTime.of(2015, 01, 21, 20, 50);

        System.out.println("Исходный timestamp: " + timestamp);
        System.out.println("Результат работы программы: " + HumanReadableTimestampClass.getTimestamp(timestamp));
    }

    //todo: учесть нюанс с переходом дат - скорее всего покрывается использованием Duration
}
