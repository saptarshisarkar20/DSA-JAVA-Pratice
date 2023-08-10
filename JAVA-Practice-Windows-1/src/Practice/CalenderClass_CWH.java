package Practice;

import java.util.Calendar;
import java.util.TimeZone;

public class CalenderClass_CWH {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTime());
        System.out.println(c.getTimeZone().getID());

        // For Diff Time Zone
        Calendar cc = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(cc.getCalendarType());
        System.out.println(cc.getTime());
        System.out.println(cc.getTimeZone());
    }
}
