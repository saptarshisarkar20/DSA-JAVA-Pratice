package GFG;


//{ Driver Code Starts
//Initial Template for Java

import java.util.ArrayList;
import java.util.Collections;

class SearchPatternKMPAlgorithm {
    //    TIME LIMIT EXCEED
    ArrayList<Integer> search123(String pat, String txt) {
        // your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int patSZ = pat.length();
        for (int i = 0; i <= txt.length() - patSZ; i++) {
            if (txt.substring(i, i + patSZ).equals(pat)) {
                ans.add(i + 1);
            }
        }
        if (ans.isEmpty()) ans.add(-1);
        return ans;
    }


    //    OPTIMIZE
    ArrayList<Integer> KmpPi(String pat) {
        int sz = pat.length();
        ArrayList<Integer> pi = new ArrayList<>(Collections.nCopies(sz, 0));
        int prevInd = 0;
        int i = 1;
        while (i < sz) {
            if (pat.charAt(i) == pat.charAt(prevInd)) {
                pi.add(i, prevInd + 1);
                prevInd++;
                i++;
            } else if (prevInd == 0) {
                pi.add(i, 0);
                i++;
            } else {
                prevInd = pi.get(prevInd - 1);
            }
        }
        return pi;
    }

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int patSZ = pat.length();
        for (int i = 0; i <= txt.length() - patSZ; i++) {
            if (txt.substring(i, i + patSZ).equals(pat)) {
                ans.add(i + 1);
            }
        }
        if (ans.isEmpty()) ans.add(-1);
        return ans;
    }


}