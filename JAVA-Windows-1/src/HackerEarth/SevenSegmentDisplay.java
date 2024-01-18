package HackerEarth;

import java.util.Scanner;

public class SevenSegmentDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        long[] arr = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        for (long i = 0; i < t; i++) {
            String str = sc.next();
            long numMatch = 0;
            for (int j = 0; j < str.length(); j++) {
                // System.out.println("######" + (str.charAt(j)-48));
                numMatch += arr[str.charAt(j) - 48];

            }
            //    System.out.println("######" + numMatch);
            long no1 = 0;
            if (numMatch >= 2) {
                no1 = numMatch / 2;
            }
            if (numMatch % 2 == 1) {
                System.out.print(7);
                no1 -= 1;
            }
            for (long j = 0; j < no1; j++) {
                System.out.print(1);
            }
            System.out.println();
        }
    }
}