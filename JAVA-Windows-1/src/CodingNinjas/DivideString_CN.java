package CodingNinjas;

import java.util.ArrayList;

public class DivideString_CN {
    public static ArrayList<String> divideString(String word, int n) {
        // Write your code here
        ArrayList<String> ans = new ArrayList<String>();
        int minLen = word.length() / n;
        if (word.length() % n != 0) {
            ans.add(" ");
            return ans;
        }

        for (int i = 0; i < word.length(); i += minLen) {
            if (i + minLen <= word.length())
                ans.add(word.substring(i, i + minLen));
            else
                ans.add(word.substring(i));
        }
        if (ans.isEmpty()) {
            ans.add(" ");
        }
        return ans;
    }
}
