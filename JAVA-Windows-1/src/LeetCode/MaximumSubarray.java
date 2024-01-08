package LeetCode;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i : nums) {
            currSum += i;
            currSum = Math.max(currSum, i);
            ans = Math.max(ans, currSum);
        }
        return ans;
    }
}