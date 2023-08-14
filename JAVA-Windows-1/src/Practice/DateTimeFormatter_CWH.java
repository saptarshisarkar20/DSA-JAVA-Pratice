package Practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_CWH {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); //This is the date
        System.out.println(dt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd | MM | yyyy --> E | H:m a ");  // This is the format
        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_ORDINAL_DATE;

        String myDate2 = dt.format(dtf2);
        String myDate = dt.format(dtf); // Creating the date string
        System.out.println(myDate);
        System.out.println(myDate2);
    }
}
