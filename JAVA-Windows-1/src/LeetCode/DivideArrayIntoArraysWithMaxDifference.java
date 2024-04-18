package LeetCode;

import java.util.Arrays;

public class DivideArrayIntoArraysWithMaxDifference {
    public int[][] divideArray(int[] nums, int k) {
        int rowCnt = nums.length / 3;
        int[][] ans = new int[rowCnt][3];
        Arrays.sort(nums);
        int i = 0;
        int j = 2;
        while (j < nums.length) {
            if (nums[j] - nums[i] > k) return new int[0][0];
            i += 3;
            j += 3;
        }
        int colCnt = -1;
        for (int l = 0; l < nums.length; l++) {
            if (l % 3 == 0) colCnt++;
            ans[colCnt][l % 3] = nums[l];
        }
        return ans;
    }
}