package GFG;

import java.util.HashSet;
import java.util.Set;

public class PanagramChecking {
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram(String s) {
        // your code here
        Set<Character> st = new HashSet<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            st.add(ch);
        }

        for (int i = 0; i < s.length(); i++) {
            char temp = Character.toLowerCase(s.charAt(i));
            st.remove(temp);
        }
        return st.isEmpty();

    }
}