import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateLesson {
    public static void LocalDateTimeApi(){
        // Current date
        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        // Current time
        LocalTime time1 = LocalTime.now();
        System.out.println(time1);

        // Current date-time
        LocalDateTime dtime1 = LocalDateTime.now();
        System.out.println(dtime1);
    }

    public static void main(String[] args) {
        LocalDateTimeApi();
    }
}
