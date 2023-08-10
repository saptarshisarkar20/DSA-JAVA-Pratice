package Practice;


import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GregorianCalender_CWH {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.getTime());
        System.out.println(gc.isLeapYear(2020));
        System.out.println(gc.isLeapYear(2018));
        for (int i = 0; i < TimeZone.getAvailableIDs().length; i++) {
            System.out.println(TimeZone.getAvailableIDs()[i]);
        }
    }
}
