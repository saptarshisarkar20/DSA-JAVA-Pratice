package GFG;

import java.util.ArrayList;

public class SearchPatternRabinKarpAlgorithm {
    ArrayList<Integer> search(String pattern, String text) {
        // your code here
        int patLen = pattern.length();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            if (pattern.charAt(0) == text.charAt(i) && i + patLen <= text.length() && pattern.equals(text.substring(i, i + patLen)))
                ans.add(i + 1);
        }
        return ans;
    }
}