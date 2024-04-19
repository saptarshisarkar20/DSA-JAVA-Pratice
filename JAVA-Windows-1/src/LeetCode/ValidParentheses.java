package LeetCode;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

    }

    public boolean isValid(String s) {
        if (s.isEmpty()) return true;
        if (s.length() % 2 == 1) return false;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == '[' || curr == '{' || curr == '(') {
                st.push(curr);
            } else {
                if (st.isEmpty()) return false;
                char stTop = st.peek();
                if (stTop == '(' && curr == ')') {
                    st.pop();
                } else if (stTop == '{' && curr == '}') {
                    st.pop();
                } else if (stTop == '[' && curr == ']') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}