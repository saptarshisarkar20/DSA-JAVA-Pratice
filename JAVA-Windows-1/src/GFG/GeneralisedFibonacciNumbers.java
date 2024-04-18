package GFG;

public class GeneralisedFibonacciNumbers {

    /***
     * Time Limit Exceeded
     * @param a
     * @param b
     * @param c
     * @param n
     * @param m
     * @return
     */

    static long genFibNum(Long a, Long b, Long c, long n, long m) {
        // code here
        Long g1 = 1L;
        Long g2 = 1L;

        if (n < 3) return 1;

        for (int i = 2; i <= n; i++) {
            Long temp = getFibo(a, b, c, n, m, g1, g2);
            System.out.println(temp);
            g1 = g2;
            g2 = temp;
        }
        return g1;


    }

    private static Long getFibo(Long a, Long b, Long c, long n, long m, Long g1, Long g2) {
        //g(n) = a*g(n-1) + b*g(n-2) + c
        return (a * g1 + b * g2 + c) % m;
    }

}