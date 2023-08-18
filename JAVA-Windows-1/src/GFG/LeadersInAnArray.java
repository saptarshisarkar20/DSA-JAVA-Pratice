package GFG;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * n = 6
 * A[] = {16,17,4,3,5,2}
 * Output: 17 5 2
 * Explanation: The first leader is 17
 * as it is greater than all the elements
 * to its right.  Similarly, the next
 * leader is 5. The right most element
 * is always a leader so it is also
 * included.
 * Example 2:
 * <p>
 * Input:
 * n = 5
 * A[] = {1,2,3,4,0}
 * Output: 4 0
 * Explanation: 0 is the rightmost element
 * and 4 is the only element which is greater
 * than all the elements to its right.
 * Your Task:
 * You don't need to read input or print anything. The task is to complete the function leader() which takes array A and n as input parameters and returns an array of leaders in order of their appearance.
 * <p>
 * Expected Time Complexity: O(n)
 * Expected Auxiliary Space: O(n)
 * <p>
 * Constraints:
 * 1 <= n <= 107
 * 0 <= Ai <= 107
 */
public class LeadersInAnArray {
    static ArrayList<Integer> leaders(int[] arr, int n) {
        // Your code here
        int max = arr[n - 1], k = 0;
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                a.add(arr[i]);
            }
        }
        a.add(arr[n - 1]);
        Collections.sort(a);
        Collections.reverse(a);
        return a;
    }
}
/**
 * //{ Driver Code Starts
 * import java.io.*;
 * import java.util.*;
 * import java.util.stream.*;
 * <p>
 * class Array {
 * <p>
 * public static void main (String[] args) throws IOException {
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * PrintWriter ot = new PrintWriter(System.out);
 * int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
 * <p>
 * while(t-->0){
 * <p>
 * //input size of array
 * int n = Integer.parseInt(br.readLine().trim());
 * int arr[] = new int[n];
 * String inputLine[] = br.readLine().trim().split(" ");
 * <p>
 * //inserting elements in the array
 * for(int i=0; i<n; i++){
 * arr[i] = Integer.parseInt(inputLine[i]);
 * }
 * <p>
 * Solution obj = new Solution();
 * <p>
 * StringBuffer str = new StringBuffer();
 * ArrayList<Integer> res = new ArrayList<Integer>();
 * <p>
 * //calling leaders() function
 * res = obj.leaders(arr, n);
 * <p>
 * <p>
 * for(int i=0; i<res.size(); i++){
 * ot.print(res.get(i)+" ");
 * }
 * <p>
 * ot.printl        ;
 * }
 * ot.close();
 * <p>
 * }
 * }
 * <p>
 * // } Driver Code Ends
 * <p>
 * <p>
 * class Solution{
 * //Function to find the leaders in the array.
 * static ArrayList<Integer> leaders(int arr[], int n){
 * // Your code here
 * int max=arr[n-1],k=0;
 * ArrayList<Integer> a=new ArrayList<Integer>();
 * for(int i=n-2;i>=0;i--)
 * {
 * if(arr[i]>=max){
 * max=arr[i];
 * a.add(arr[i]);
 * }
 * }
 * a.add(arr[n-1]);
 * Collections.sort(a);
 * Collections.reverse(a);
 * return a;
 * }
 * }
 */