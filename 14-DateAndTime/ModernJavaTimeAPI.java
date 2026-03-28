import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Demonstration of the modern java.time API introduced in Java 8.
 * This is the recommended way to handle dates and times in Java.
 */
public class ModernJavaTimeAPI {
    public static void main(String[] args) {
        
        System.out.println("---> 1. Modern java.time Classes <---");
        
        // 1. LocalDate (Only Date)
        LocalDate d = LocalDate.now();
        System.out.println("Local Date: " + d);

        // 2. LocalTime (Only Time)
        LocalTime t = LocalTime.now();
        System.out.println("Local Time: " + t);

        // 3. LocalDateTime (Both Date and Time)
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Local Date & Time: " + dt);

        System.out.println("\n---> 2. Formatting Dates (DateTimeFormatter) <---");
        // Creating a custom format
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd-MM-yyyy -- E H:m a");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

        // Applying the format to our LocalDateTime object
        String myFormattedDate1 = dt.format(df1);
        String myFormattedDate2 = dt.format(df2);
        
        System.out.println("Custom Format 1: " + myFormattedDate1);
        System.out.println("ISO Format 2: " + myFormattedDate2);
    }
}
