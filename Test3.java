import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.util.Calendar;
public class Test3 {
    public static void main(String[] args) {
        LocalDate Date = LocalDate.now();
        System.out.println("today Date:" + Date);
        LocalTime Time = LocalTime.now();
        System.out.println("today Time:" + Time);
        LocalDateTime DateTime = LocalDateTime.now();
        System.out.println("tomorrow DateTime:" + DateTime);
        Year y = Year.now();
        System.out.println(y);
        Clock cl = Clock.systemUTC();
        System.out.println(cl);
        Calendar c = Calendar.getInstance();
        int maximum = c.getMaximum(Calendar.DAY_OF_WEEK);
        System.out.println("Maximum number of days in week:" + maximum);
        maximum = c.getMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Maximum number of days in month:" + maximum);
    }

}