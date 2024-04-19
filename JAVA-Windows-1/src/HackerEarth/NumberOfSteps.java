package HackerEarth;

import java.util.Scanner;

public class NumberOfSteps {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int count = 0;
        boolean notEqual = true;
        a[0] = scan.nextInt();
        int min = a[0];
        for (int i = 1; i < n; i++) {
            a[i] = scan.nextInt();
            min = Math.min(min, a[i]);
        }
        for (int i = 0; i < n; i++) {
            b[i] = scan.nextInt();
        }
        while (notEqual) {
            notEqual = false;
            for (int i = 0; i < a.length; i++) {
                while (a[i] > min && b[i] != 0) {
                    a[i] = a[i] - b[i];
                    count++;
                    notEqual = true;
                }
                min = Math.min(min, a[i]);
                if (min < 0) break;
            }
        }
        System.out.println(min < 0 ? -1 : count);
    }
}