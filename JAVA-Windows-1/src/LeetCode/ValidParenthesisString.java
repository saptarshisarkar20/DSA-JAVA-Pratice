package LeetCode;

public class ValidParenthesisString {
    public boolean checkValidString(String s) {

        int leftMin = 0, leftMax = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                leftMin++;
                leftMax++;
            } else if (s.charAt(i) == ')') {
                leftMin--;
                leftMax--;
            } else {
                leftMin--;
                leftMax++;
            }

            if (leftMin < 0) leftMin = 0;
            if (leftMax < 0) return false;
        }
        return leftMin == 0;
    }
}