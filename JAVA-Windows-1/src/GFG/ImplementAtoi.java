package GFG;

public class ImplementAtoi {
    int atoi(String s) {
        // Your code here
        boolean isNeg = false;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int digit = s.charAt(i) - 48;
            if (digit < 0 || digit > 9) {
                if (i == 0 && ch == '-')
                    isNeg = true;
                else if (i == 0 && ch == '+') {
                    isNeg = false;
                } else {
                    return -1;
                }
            } else {
                res = res * 10 + digit;
            }
        }
        if (isNeg) return -res;
        return res;
    }
}