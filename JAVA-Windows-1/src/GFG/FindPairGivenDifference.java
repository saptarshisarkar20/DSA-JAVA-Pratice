package GFG;

import java.util.HashSet;

public class FindPairGivenDifference {
    public boolean findPair(int[] arr, int size, int n) {
        //code here.
        HashSet<Integer> st = new HashSet<>();
        for (int it : arr) {
            if (st.contains(it + n) || st.contains(it - n))
                return true;
            st.add(it);
        }
        return false;
    }
}