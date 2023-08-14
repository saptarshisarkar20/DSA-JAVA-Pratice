package CodingNinjas;

import java.util.ArrayList;

/**
 * Problem Statement
 * You are given an array, 'ARR', consisting of ‘N’ integers. You are also given two other integers, ‘SUM’ and ‘MAXVAL’.  The elements of this array follow a special property that the absolute value of each element is not more than ‘MAXVAL’.
 * Your task is to determine the minimum number of integers required to be added into the array such that the sum of all the elements of the array becomes equal to ‘SUM’.
 * Constrain
 * 1 <= T <= 10
 * 1 <= N <= 10^6
 * -10^9 <= SUM <= 10^9
 * 1 <= MAXVAL <= 10^9
 * -MAXVAL <= NUMS[i] <= MAXVAL
 * <p>
 * Where 'T' denotes the number of test cases, ‘N’ represents the original number of elements present in the array, ‘SUM’ represents the required sum of all the elements in the array, ‘MAXVAL’ represents the maximum absolute value of any element in the array and ARR[i] represents the value of the elements in the array.
 * <p>
 * Time Limit: 1sec
 * Detailed explanation ( Input/output format, Notes, Images )
 * Sample Input 1:
 * 1
 * 3
 * 10 4
 * 2 -3 4
 * Sample Output 1:
 * 2
 * Explanation For Sample Input 1:
 * In this test case, the original sum of the array elements is 3. The required sum is 10 so we need some integers that can have a sum of 7. Since we can’t have an integer more than 4, we require at least two integers. In this case, adding 4 and 3 to the array will make the sum of the array 10, and thus, we print 2.
 * Sample Input 2:
 * 1
 * 3
 * -10 5
 * 2 1 4
 * Sample Output 2:
 * 4
 * Explanation For Sample Input 2:
 * In this test case, the original sum of the array elements is 7. The required sum is -10 so we need some integers that can have a sum of -17. Since we can’t have an integer more than 5, we require at least four integers. In this case, adding -5, -5, -5, and -2 to the array will make the sum of the array -10, and thus, we print 4.
 */

public class MinimumNumbersRequired_CN {
    public static int findMinNumbers(ArrayList<Integer> arr, int sum, int maxVal) {
        // Write your code here.
        Integer summ = 0;
        for (Integer i : arr) {
            summ += i;
        }

        Integer diff = sum - summ;

        int preAns = Math.abs(diff / maxVal);
        int postAns = diff % maxVal;
        if (postAns != 0) preAns += 1;
        return preAns;
    }
}
