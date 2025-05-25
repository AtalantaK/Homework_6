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

        if (minuteDifference < 60 && dayDifference == 0 && hourDifference == 0) {
            if (minuteDifference == 1 || minuteDifference == 21 || minuteDifference == 31 || minuteDifference == 41 || minuteDifference == 51)
                return "Опубликовано " + minuteDifference + " минуту назад";
            else if (minuteDifference == 2 || minuteDifference == 3 || minuteDifference == 4 || minuteDifference == 22 || minuteDifference == 54)
                return "Опубликовано " + minuteDifference + " минуты назад";
            else return "Опубликовано " + minuteDifference + " минут назад";
        } else if (dayDifference == 0) {
            if (hourDifference == 1 || hourDifference == 21)
                return "Опубликовано " + hourDifference + " час назад";
            else if (hourDifference == 2 || hourDifference == 3 || hourDifference == 4 || hourDifference == 22 || hourDifference == 23)
                return "Опубликовано " + hourDifference + " часа назад";
            else return "Опубликовано " + hourDifference + " часов назад";
        } else if (dayDifference == 1) {
            return "Опубликовано вчера";
        } else {
            if (dayDifference == 5 || dayDifference == 20 || dayDifference == 99 || dayDifference == 100 || dayDifference == 111)
                return "Опубликовано " + dayDifference + "дней назад";
            else if (dayDifference == 2 || dayDifference == 3 || dayDifference == 4 || dayDifference == 22 || dayDifference == 23 || dayDifference == 92)
                return "Опубликовано " + dayDifference + "дня назад";
            else return "Опубликовано " + dayDifference + "день назад";
        }
    }
}
