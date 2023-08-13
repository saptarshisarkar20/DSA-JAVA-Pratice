package LeetCode;

class Solution {
    public boolean validPartition(int[] nums) {
        return solAns(nums, new Boolean[nums.length + 1], 0);
    }

    private boolean solAns(int[] nums, Boolean[] dp, Integer ind) {
        Integer sz = nums.length;
        if (ind >= sz) return true;

        if (dp[ind] != null) return dp[ind];


        boolean res = false;

        if (ind + 1 < sz && nums[ind] == nums[ind + 1]) {
            res = res || solAns(nums, dp, ind + 2);
        }
        if (ind + 2 < sz && nums[ind] == nums[ind + 1] && nums[ind + 1] == nums[ind + 2]) {
            res = res || solAns(nums, dp, ind + 3);
        }
        if (ind + 2 < sz && nums[ind + 1] - nums[ind] == 1 && nums[ind + 2] - nums[ind + 1] == 1) {
            res = res || solAns(nums, dp, ind + 3);
        }

        return dp[ind] = res;
    }
}

public class CheckIfThereIsAValidPartitionForTheArray {

}
