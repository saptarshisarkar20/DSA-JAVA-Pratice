package Practice;

import java.util.Date;

public class Prac_DateTime_CWH {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.toString());
        System.out.println(d.getYear());
    }
}
