package GFG;

public class RemoveConsecutiveCharacters {
    public String removeConsecutiveCharacter(String S) {
        // code here.
        StringBuilder ans = new StringBuilder();
        char curr = '1';
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (curr != ch) {
                ans.append(ch);
                curr = ch;
            }
        }
        return String.valueOf(ans);

    }
}