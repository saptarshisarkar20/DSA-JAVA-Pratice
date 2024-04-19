package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for (int it : nums) {
            if (st.contains(it)) {
                return true;
            }
            st.add(it);
        }
        return false;
    }
}