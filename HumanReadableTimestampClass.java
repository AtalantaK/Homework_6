import java.time.LocalDateTime;
import java.time.Month;

public class HumanReadableTimestampClass implements HumanReadableTimestamp {

    public static String getTimestamp(LocalDateTime eventTimestamp) {
        LocalDateTime currentTimestamp = LocalDateTime.now();

        int yearDifference = currentTimestamp.getYear() - eventTimestamp.getYear();
        int monthDifference = currentTimestamp.getMonthValue() - eventTimestamp.getMonthValue();
        int dayDifference = currentTimestamp.getDayOfMonth() - eventTimestamp.getDayOfMonth();
        int hourDifference = currentTimestamp.getHour() - eventTimestamp.getHour();
        int minuteDifference = currentTimestamp.getMinute() - eventTimestamp.getMinute();

        if (yearDifference == 0 && monthDifference == 0 && dayDifference == 0 && hourDifference < 1) {
            if (minuteDifference == 1 || minuteDifference == 21 || minuteDifference == 31 || minuteDifference == 41 || minuteDifference == 51)
                return "Опубликовано " + minuteDifference + " минуту назад";
            else if (minuteDifference == 2 || minuteDifference == 3 || minuteDifference == 4 || minuteDifference == 22 || minuteDifference == 54)
                return "Опубликовано " + minuteDifference + " минуты назад";
            else return "Опубликовано " + minuteDifference + " минут назад";
        }
        return "exit";
    }
}
