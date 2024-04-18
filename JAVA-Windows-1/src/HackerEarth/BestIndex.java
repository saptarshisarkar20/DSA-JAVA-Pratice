package HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BestIndex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        long max = Long.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            long sum = 0;
            int left = arr.length - i;
            int vo = 1;
            int k = i;
            while (left > 0) {
                for (int j = 0; j < vo; j++) {
                    sum += arr[k++];
                }
                vo++;
                left -= vo;
            }
            if (max < sum) max = sum;
        }
        System.out.println(max);


    }
}