package GFG;
//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

//class GFG {
//    public static void main(String args[]) throws IOException {
//        BufferedReader read =
//                new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(read.readLine());
//        while (t-- > 0) {
//            int n = Integer.parseInt(read.readLine());
//            Solution ob = new Solution();
//
//            System.out.println(ob.nthFibonacci(n));
//        }
//    }
//}
//// } Driver Code Ends
//
//
////User function Template for Java
//
////User function Template for Java
//class Solution {
//
//}

public class NthFibonacciNumber {
    static int nthFibonacci(int n) {
        int a = 0;
        int b = 1;
        while (n > 0) {
            int temp = (a + b) % 1000000007;
            a = b;
            b = temp;
            n--;
        }

        return a;

    }
}
