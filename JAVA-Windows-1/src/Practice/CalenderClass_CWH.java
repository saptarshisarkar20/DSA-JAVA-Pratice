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

        //methods
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.SECOND));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.HOUR));  // 12-hour format
        System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // 24-hour format

        // For Diff Time Zone
        Calendar cc = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(cc.getCalendarType());
        System.out.println(cc.getTime());
        System.out.println(cc.getTimeZone());
    }
}
