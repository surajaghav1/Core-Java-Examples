import java.lang.reflect.GenericSignatureFormatError;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calender_in_java {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println("date : "+c.get(Calendar.DATE));
        System.out.println("Month : "+c.get(Calendar.MONTH));
        System.out.println("Year : "+c.get(Calendar.YEAR));
        System.out.println("Minute : "+c.get(Calendar.MINUTE));
        System.out.println("Second : "+c.get(Calendar.SECOND));
        System.out.println("Hour : "+c.get(Calendar.HOUR));
        System.out.println("Hour of Day (watch in 24 hours format) : "+c.get(Calendar.HOUR_OF_DAY));
        System.out.println("The current time is : ");
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

//        it will print all day and time of the year or current system
        System.out.println(c.getTime());

//        it is type of calender is ued in all over the world
        GregorianCalendar g=new GregorianCalendar();
        System.out.println(g.isLeapYear(2024));
    }
}
