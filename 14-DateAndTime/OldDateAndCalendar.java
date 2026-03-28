import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Demonstration of the older Date and Calendar classes (Pre Java 8).
 * Note: Many methods in java.util.Date are now deprecated.
 */
public class OldDateAndCalendar {
    public static void main(String[] args) {
        
        System.out.println("---> 1. System Time (Milliseconds) <---");
        System.out.println("Milliseconds since Jan 1, 1970: " + System.currentTimeMillis());
        System.out.println("Years passed since 1970: " + (System.currentTimeMillis() / 1000 / 3600 / 24 / 365));

        System.out.println("\n---> 2. java.util.Date Class <---");
        Date d = new Date();
        System.out.println("Current Date object: " + d);
        System.out.println("Time in ms: " + d.getTime());
        // System.out.println(d.getYear()); // Deprecated method example

        System.out.println("\n---> 3. java.util.Calendar Class <---");
        Calendar c = Calendar.getInstance();
        System.out.println("Calendar Time: " + c.getTime());
        System.out.println("Current Year: " + c.get(Calendar.YEAR));
        System.out.println("Current Month [0-11]: " + c.get(Calendar.MONTH)); 
        System.out.println("Current Time: " + c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        System.out.println("\n---> 4. Gregorian Calendar & TimeZones <---");
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println("Is 2018 a leap year? " + cal.isLeapYear(2018));
        System.out.println("Is 2024 a leap year? " + cal.isLeapYear(2024));
        
        System.out.println("Available TimeZones (First 3):");
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
}
