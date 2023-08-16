package CodingNinjas;

public class BinarySearch_CN {
    public static int search(int[] nums, int target) {
        // Write your code here.
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (target == nums[mid]) return mid;
            if (target < nums[mid]) j = mid - 1;
            else i = mid + 1;
        }
        return -1;
    }
}
