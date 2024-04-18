package GFG;//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


import java.util.Scanner;


class MaxMin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Solution ob = new Solution();

            System.out.println(Solution.findSum(a, n));
        }

    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public static int findSum(int[] A, int N) {
        //code here
        int mmin = Integer.MAX_VALUE;
        int mmax = Integer.MIN_VALUE;
        for (int i : A) {
            mmax = Math.max(mmax, i);
            mmin = Math.min(mmin, i);
        }
        return mmax + mmin;

    }
}