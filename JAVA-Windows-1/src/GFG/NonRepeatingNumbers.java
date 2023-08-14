package GFG;

/*
    * Given an array A containing 2*N+2 positive numbers, out of which 2*N numbers exist in pairs whereas the other two number occur exactly once and are distinct. Find the other two numbers. Return in increasing order.

    Example 1:

    Input:
    N = 2
    arr[] = {1, 2, 3, 2, 1, 4}
    Output:
    3 4
    Explanation:
    3 and 4 occur exactly once.
    Example 2:

    Input:
    N = 1
    arr[] = {2, 1, 3, 2}
    Output:
    1 3
    Explanation:
    1 3 occur exactly once.
    Your Task:
    You do not need to read or print anything. Your task is to complete the function singleNumber() which takes the array as input parameter and returns a list of two numbers which occur exactly once in the array. The list must be in ascending order.

    Expected Time Complexity: O(N)
    Expected Space Complexity: O(1)

    Constraints:
    1 <= length of array <= 106
    1 <= Elements in array <= 5 * 106
* */


public class NonRepeatingNumbers {
    public int[] singleNumber(int[] nums) {
        int Xor = 0;
        for (int num : nums) {
            Xor ^= num;
        }

        Xor = (Xor & -Xor);

        int a = 0, b = 0;
        for (int num : nums) {
            if ((num & Xor) > 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return a < b ? new int[]{a, b} : new int[]{b, a};
    }
}

/*

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[2 * n + 2];
            for (int i = 0; i < 2 * n + 2; i++) {
                v[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int[] ans = ob.singleNumber(v);
            for (int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    public int[] singleNumber(int[] nums) {
        // Code here
        int Xor = 0;
        for (int num : nums) {
            Xor ^= num;
        }

        Xor = (Xor & -Xor);

        int a = 0, b = 0;
        for (int num : nums) {
            if ((num & Xor) > 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return a < b ? new int[]{a, b} : new int[]{b, a};
    }
}
*/
