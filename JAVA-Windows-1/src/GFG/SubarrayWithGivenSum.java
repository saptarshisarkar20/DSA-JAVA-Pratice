package GFG;

import java.util.ArrayList;

/**
 * Given an unsorted array A of size N that contains only positive integers, find a continuous sub-array that adds to a given number S and return the left and right index(1-based indexing) of that subarray.
 * <p>
 * In case of multiple subarrays, return the subarray indexes which come first on moving from left to right.
 * <p>
 * Note:- You have to return an ArrayList consisting of two elements left and right. In case no such subarray exists return an array consisting of element -1.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 5, S = 12
 * A[] = {1,2,3,7,5}
 * Output: 2 4
 * Explanation: The sum of elements
 * from 2nd position to 4th position
 * is 12.
 * Example 2:
 * <p>
 * Input:
 * N = 10, S = 15
 * A[] = {1,2,3,4,5,6,7,8,9,10}
 * Output: 1 5
 * Explanation: The sum of elements
 * from 1st position to 5th position
 * is 15.
 * Your Task:
 * You don't need to read input or print anything. The task is to complete the function subarraySum() which takes arr, N, and S as input parameters and returns an ArrayList containing the starting and ending positions of the first such occurring subarray from the left where sum equals to S. The two indexes in the array should be according to 1-based indexing. If no such subarray is found, return an array consisting of only one element that is -1.
 * <p>
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 * <p>
 * Constraints:
 * 1 <= N <= 105
 * 1 <= Ai <= 109
 * 0<= S <= 109
 */
public class SubarrayWithGivenSum {
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        if (s == 0) {
            list.add(-1);
            return list;
        }
        int i = 0, j = 0, sum = 0;
        while (i < n && j < n) {
            sum += arr[j];
            if (sum < s)
                j++;
            else if (sum == s) {
                list.add(i + 1);
                list.add(j + 1);
                return list;
            } else {
                while (sum >= s) {
                    sum = sum - arr[i++];
                    if (sum == s) {
                        list.add(i + 1);
                        list.add(j + 1);
                        return list;
                    }
                }
                j++;
            }
        }
        list.add(-1);

        return list;
    }
}
/**
 * //{ Driver Code Starts
 * import java.util.*;
 * import java.lang.*;
 * import java.io.*;
 * <p>
 * class Main{
 * static BufferedReader br;
 * static PrintWriter ot;
 * public static void main(String[] args) throws IOException{
 * <p>
 * br = new BufferedReader(new InputStreamReader(System.in));
 * ot = new PrintWriter(System.out);
 * <p>
 * int t = Integer.parseInt(br.readLine());
 * <p>
 * while(t-->0){
 * <p>
 * String s[] = br.readLine().trim().split(" ");
 * <p>
 * int n = Integer.parseInt(s[0]);
 * int k = Integer.parseInt(s[1]);
 * int a[] = new int[n];
 * s = br.readLine().trim().split(" ");
 * for(int i = 0; i < n; i++)
 * a[i] = Integer.parseInt(s[i]);
 * Solution obj = new Solution();
 * ArrayList<Integer> res = obj.subarraySum(a, n, k);
 * for(int ii = 0;ii<res.size();ii++)
 * ot.print(res.get(ii) + " ");
 * ot.println();
 * }
 * ot.close();
 * }
 * <p>
 * }
 * // } Driver Code Ends
 * <p>
 * <p>
 * class Solution
 * {
 * //Function to find a continuous sub-array which adds up to a given number.
 * static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
 * {
 * // Your code here
 * ArrayList<Integer> list = new ArrayList<>();
 * if(s==0)
 * {
 * list.add(-1);
 * return list;
 * }
 * int i=0,j=0,sum=0;
 * while(i<n&& j<n){
 * sum += arr[j];
 * if(sum<s)
 * j++;
 * else if(sum == s){
 * list.add(i+1);
 * list.add(j+1);
 * return list;
 * }
 * else{
 * while(sum >= s){
 * sum = sum - arr[i++];
 * if(sum == s){
 * list.add(i+1);
 * list.add(j+1);
 * return list;
 * }
 * }
 * j++;
 * }
 * }
 * list.add(-1);
 * <p>
 * return list;
 * }
 * }
 */