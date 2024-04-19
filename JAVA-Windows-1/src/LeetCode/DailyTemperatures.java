package LeetCode;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n]; //in java by default initialized with zero
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (st.empty() || temperatures[i] <= temperatures[st.peek()]) {
                st.push(i);
            } else {
                while (!st.empty() && temperatures[i] > temperatures[st.peek()]) {
                    res[st.peek()] = i - st.peek();
                    st.pop();
                }
                st.push(i);
            }
        }
        return res;
    }
}