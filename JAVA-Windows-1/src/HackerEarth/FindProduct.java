package HackerEarth;

import java.util.ArrayList;
import java.util.Scanner;

public class FindProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            int temp = sc.nextInt();
            arr.add(temp);
        }

        Long mod = 1000000007L;
        Long res = 1L;

        for (Integer i : arr) {
//            System.out.println(i);
            res = (res * i) % mod;
        }
        System.out.println(res);


    }
}