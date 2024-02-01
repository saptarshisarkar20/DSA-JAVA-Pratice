package GFG;

import java.util.ArrayList;
import java.util.Collections;

public class ChocolateDistributionProblem {
    public long findMinDiff(ArrayList<Integer> a, int n, int m) {
        // your code here
        if (n < m) return -1;
        int ans = Integer.MAX_VALUE;
        Collections.sort(a);
        for (int i = 0, j = m - 1; i <= n - m; i++, j++) {
            ans = Math.min(a.get(j) - a.get(i), ans);
        }
        return ans;
    }
}