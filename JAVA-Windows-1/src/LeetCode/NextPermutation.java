package LeetCode;

public class NextPermutation {

    private void rev(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public void nextPermutation(int[] nums) {

        int i = nums.length - 2;

//        2 1 5 4 3 0 0;
//        0 1 2 3 4 5 6;

        while (i >= 0) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
            i--;
        }
        if (i == -1) {
            rev(nums, 0, nums.length - 1);
            return;
        }

        int smB = Integer.MAX_VALUE;
        int indSm = -1;

        for (int j = nums.length - 1; j > i; j--) {
            if (nums[j] > nums[i] && smB > nums[j]) {
                smB = nums[j];
                indSm = j;
            }
        }

        int temp = nums[i];
        nums[i] = nums[indSm];
        nums[indSm] = temp;

        rev(nums, i + 1, nums.length - 1);
    }
}