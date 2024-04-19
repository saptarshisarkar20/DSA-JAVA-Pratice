package LeetCode;

public class MinimumLengthOfStringAfterDeletingSimilarEnds {
    public int minimumLength(String s) {
        if (s.length() < 2) return s.length();
        int i = 0, j = s.length() - 1;
        String temp = s;
        while (s.charAt(i) == s.charAt(j) && i <= j) {
            if (temp.length() < 2) return temp.length();
            temp = "";
            while (i < s.length() && i < j - 1 && s.charAt(i) == s.charAt(i + 1)) {
                i++;
                System.out.println(" i -> " + i);
            }
            while (j >= 0 && i < j - 1 && s.charAt(j) == s.charAt(j - 1)) {
                j--;
                System.out.println(" j -> " + i);
            }
            if (i < j)
                temp = s.substring(i + 1, j);
            i++;
            j--;
        }
        return temp.length();
    }
}