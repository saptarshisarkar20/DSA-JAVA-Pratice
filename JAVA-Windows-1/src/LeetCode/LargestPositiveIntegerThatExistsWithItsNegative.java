package LeetCode;

import java.util.Arrays;

public class LargestPositiveIntegerThatExistsWithItsNegative {
    public int findMaxK(int[] nums) {

        int left = 0, right = nums.length - 1;
        Arrays.sort(nums);
        while (left < right) {
            int temp = nums[left] + nums[right];
            if (temp == 0) {
                return nums[right];
            } else if (temp > 0) {
                right--;
            } else {
                left++;
            }
        }
        return -1;
    }
}