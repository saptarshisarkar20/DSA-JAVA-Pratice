package LeetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
 * <p>
 * Return the max sliding window.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
 * Output: [3,3,5,5,6,7]
 * Explanation:
 * Window position                Max
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 * 1 [3  -1  -3] 5  3  6  7       3
 * 1  3 [-1  -3  5] 3  6  7       5
 * 1  3  -1 [-3  5  3] 6  7       5
 * 1  3  -1  -3 [5  3  6] 7       6
 * 1  3  -1  -3  5 [3  6  7]      7
 * Example 2:
 * <p>
 * Input: nums = [1], k = 1
 * Output: [1]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 * 1 <= k <= nums.length
 */
public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        Integer i = 0;
        for (; i < k; i++) {
            while (!dq.isEmpty() && nums[i] >= nums[dq.getLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        while (i < nums.length) {
            ans.add(nums[dq.getFirst()]);
            while (!dq.isEmpty() && dq.getFirst() <= i - k) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && nums[i] >= nums[dq.getLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
            i++;
        }
        ans.add(nums[dq.getFirst()]);
        int[] res = new int[ans.size()];
        for (int j = 0; j < ans.size(); j++) {
            res[j] = ans.get(j);
        }
        return res;
    }
}