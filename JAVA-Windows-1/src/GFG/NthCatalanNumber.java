package GFG;

/**
 * Given a number N. The task is to find the Nth catalan number.
 * The first few Catalan numbers for N = 0, 1, 2, 3, … are 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, …
 * <p>
 * Catalan Number for N is equal to the number of expressions containing N pairs of paranthesis that are correct matched, i.e., for each of the N '(' there exist N ')' on there right and vice versa.
 * <p>
 * Since answer can be huge return answer modulo 1e9+7.
 * <p>
 * Note: Positions start from 0 as shown above.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 5
 * Output: 42
 * Example 2:
 * <p>
 * Input:
 * N = 4
 * Output: 14
 * Your Task:
 * Complete findCatalan() function that takes n as an argument and returns the Nth Catalan number. The output is printed by the driver code.
 * <p>
 * Expected Time Complexity: O(N^2).
 * Expected Auxiliary Space: O(N).
 * <p>
 * Constraints:
 * 1 <= N <= 103
 */
public class NthCatalanNumber {
    public static int findCatalan(int n) {
        // code here
        long[] catalan = new long[n + 1];
        long mod = (long) (1e9 + 7);
        catalan[0] = catalan[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                catalan[i] += catalan[j] * catalan[i - j - 1];
                catalan[i] %= mod;
            }
        }
        return (int) catalan[n];
    }


    //TLE
    /*public static int findCatalan(int n) {
        // code here
        List<Double> cn = new ArrayList<>();
        Double mod = 1e9 + 7;
        cn.add(1d);
        cn.add(1d);
        for (int i = 2; i <= n; i++) {
            cn.add(0d);
            for (int j = 0; j < i; j++) {
                cn.set(i, (cn.get(i) + cn.get(j) * cn.get(i - j - 1)) % mod);
            }
        }
        return cn.get(n).intValue();


    }*/

}