package GFG;

import java.util.ArrayList;

public class PrintDiagonally {
    static ArrayList<Integer> downwardDiagonal(int N, int[][] A) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        for (int c = 0; c < N; c++) {
            int temp = c;
            for (int i = 0; i <= c; i++) {
//                System.out.println(i + " , " + temp);
                res.add(A[i][temp]);
                temp--;
            }
        }

        for (int r = 1; r < N; r++) {
            int temp = r;
            for (int c = N - 1; c >= r; c--) {
//                System.out.println(temp + " , " + c);
                res.add(A[temp][c]);
                temp++;
            }
        }
        return res;

    }
}