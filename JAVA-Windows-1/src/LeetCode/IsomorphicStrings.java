package LeetCode;

import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Character> sot = new HashMap<>();
        HashMap<Character, Character> tos = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (sot.containsKey(s.charAt(i)) && sot.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            } else if (tos.containsKey(t.charAt(i)) && tos.get(t.charAt(i)) != s.charAt(i)) {
                return false;
            } else {
                sot.put(s.charAt(i), t.charAt(i));
                tos.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}