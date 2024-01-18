package HackerEarth;

import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (Character.isUpperCase(ch)) {
                System.out.print(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                System.out.print(Character.toUpperCase(ch));
            }
        }
    }
}