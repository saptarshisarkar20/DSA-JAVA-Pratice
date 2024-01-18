package HackerEarth;

import java.util.Scanner;

public class Factorial_ {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N < 3) {
            System.out.println(N);
        } else {
            long ans = 1;
            for (int i = 1; i <= N; i++) {
                ans *= i;
            }
            System.out.println(ans);
        }
    }
}