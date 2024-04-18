package LeetCode;

import java.util.ArrayList;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();
        int zeroCnt = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int curr = matrix[i][j];
                if (curr == 0) {
                    row.add(i);
                    col.add(j);
                    zeroCnt++;
                }
            }
        }

        for (int i = 0; i < zeroCnt; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[row.get(i)][j] = 0;
            }
        }

        for (int i = 0; i < zeroCnt; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][col.get(i)] = 0;
            }
        }


    }
}