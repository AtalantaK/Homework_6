import java.time.Duration;
import java.time.LocalDateTime;

public class HumanReadableTimestampClass implements HumanReadableTimestamp {

    public static String getTimestamp(LocalDateTime eventTimestamp) {

        //фиксируем текущую дату
        LocalDateTime currentTimestamp = LocalDateTime.now();

        //определяем разницу между текущей датой и датой переданной в функцию
        Duration timeDifference = Duration.between(currentTimestamp, eventTimestamp);

        //вычисляем разницу в днях, часах, минутах между текущей датой и датой переданной в функцию
        //для корректного отображения умножаем на -1
        int dayDifference = (int) timeDifference.toDays() * (-1);
        int hourDifference = (int) timeDifference.toHours() * (-1);
        int minuteDifference = (int) timeDifference.toMinutes() * (-1);

        //учитываем переход дат
        if (hourDifference < 0) hourDifference = 24 + hourDifference;

        if (dayDifference == 0 && hourDifference == 0 && minuteDifference == 0) return "Опубликовано только что";

        if (minuteDifference < 60 && dayDifference == 0 && hourDifference == 0) {
            if (minuteDifference == 1
                    || minuteDifference == 21
                    || minuteDifference == 31
                    || minuteDifference == 41
                    || minuteDifference == 51)
                return "Опубликовано " + minuteDifference + " минуту назад";
            else if (minuteDifference == 2 || minuteDifference == 3 || minuteDifference == 4
                    || minuteDifference == 22 || minuteDifference == 23 || minuteDifference == 24
                    || minuteDifference == 32 || minuteDifference == 33 || minuteDifference == 34
                    || minuteDifference == 42 || minuteDifference == 43 || minuteDifference == 44
                    || minuteDifference == 52 || minuteDifference == 53 || minuteDifference == 54)
                return "Опубликовано " + minuteDifference + " минуты назад";
            else return "Опубликовано " + minuteDifference + " минут назад";
        } else if (dayDifference == 0) {
            if (hourDifference == 1 || hourDifference == 21)
                return "Опубликовано " + hourDifference + " час назад";
            else if (hourDifference == 2
                    || hourDifference == 3
                    || hourDifference == 4
                    || hourDifference == 22
                    || hourDifference == 23)
                return "Опубликовано " + hourDifference + " часа назад";
            else return "Опубликовано " + hourDifference + " часов назад";
        } else if (dayDifference == 1) {
            return "Опубликовано вчера";
        } else {
            if ((dayDifference - 21) % 10 == 0 && (dayDifference - 11) % 100 != 0)
                return "Опубликовано " + dayDifference + " день назад";
            else if (((dayDifference - 2) % 10 == 0 || (dayDifference - 3) % 10 == 0 || (dayDifference - 4) % 10 == 0)
                    && (dayDifference - 12) % 100 != 0 && (dayDifference - 13) % 100 != 0 && (dayDifference - 14) % 100 != 0)
                return "Опубликовано " + dayDifference + " дня назад";
            else return "Опубликовано " + dayDifference + " дней назад";
        }

    }
}
