import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Local_Date_and_Time {
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        System.out.println("DAte : "+d);
        LocalTime t=LocalTime.now();
        System.out.println("Local time ; "+t);

//        both date and time wil display
        LocalDateTime dt=LocalDateTime.now();
        System.out.println("Local Date and Time : "+dt);
    }
}
