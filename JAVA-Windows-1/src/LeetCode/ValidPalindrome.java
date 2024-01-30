package LeetCode;

public class ValidPalindrome {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < s.length() && !Character.isLetterOrDigit(s.charAt(i)))
                i++;
            while (j > 0 && !Character.isLetterOrDigit(s.charAt(j)))
                j--;
            if (i < s.length() && j > 0 && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
//                System.out.println(s.charAt(i) + " |||| " + s.charAt(j));
                return false;
            }
            i++;
            j--;

        }
        return true;
    }


    // LESS OPTIMIZED
    public boolean isPalindrome2(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                str += (Character.toLowerCase(ch));
            }
        }
        System.out.println(str);
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}