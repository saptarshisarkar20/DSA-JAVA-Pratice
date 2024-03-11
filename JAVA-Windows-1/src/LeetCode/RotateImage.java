package LeetCode;

public class RotateImage {
    public void rotate(int[][] mat) {
        /**
         *         [[1,2,3],
         *          [4,5,6],
         *          [7,8,9]]
         *
         *
         *
         *
         *
         *
         *
         */

        int n = mat.length;
        int left = 0, top = 0, right = n - 1, btm = n - 1;

        while (left < right && top < btm) {
            for (int i = 0; i < (right - left); i++) {
                int temp = mat[top][left + i];
                mat[top][left + i] = mat[btm - i][left];
                mat[btm - i][left] = mat[btm][right - i];
                mat[btm][right - i] = mat[top + i][right];
                mat[top + i][right] = temp;
            }
            top++;
            left++;
            btm--;
            right--;
        }

    }
}