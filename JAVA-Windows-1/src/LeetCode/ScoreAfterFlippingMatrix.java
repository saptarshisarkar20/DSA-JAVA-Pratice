package LeetCode;

class ScoreAfterFlippingMatrix2 {
    public int matrixScore(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        int res = (1 << (m - 1)) * n;

        for (int i = 1; i < m; i++) {
            int curr = 0;
            for (int j = 0; j < n; j++) {
                if (a[j][i] == a[j][0]) {
                    curr++;
                }
            }
            res += (1 << (m - i - 1)) * Math.max(curr, n - curr);
        }

        return res;
    }
}

//NOT CORRECT
public class ScoreAfterFlippingMatrix {
    public static int binaryToDecimal(int num) {
        int r, temp, ans = 0, p = 0;
        // Store the original binary number for later
        // display
        temp = num;

        // Loop to convert binary to decimal
        while (num != 0) {
            // Get the rightmost digit of the binary number
            r = num % 10;

            // Update the decimal equivalent using bitwise
            // left shift
            ans += r * (1 << p);

            // Move to the next position
            p++;

            // Remove the rightmost digit from the binary
            // number
            num /= 10;
        }

        return ans;
    }


    private static void flipCol(int[][] grid, int c) {
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][c] == 0) grid[i][c] = 1;
            else grid[i][c] = 0;
        }
    }

    private static void flipRow(int[][] grid, int r) {
        for (int i = 0; i < grid[0].length; i++) {
            if (grid[r][i] == 0) grid[r][i] = 1;
            else grid[r][i] = 0;
        }
    }

    private static void checkCols(int[][] grid) {
        for (int j = 0; j < grid[0].length; j++) {
            int zC = 0, oC = 0;
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][j] == 0) zC++;
                else oC++;
            }
            if (zC > oC) flipCol(grid, j);
        }
    }

    private void checkRows(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == 0) flipRow(grid, i);
        }
    }

    public int matrixScore(int[][] grid) {
        checkRows(grid);
        checkCols(grid);

        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            int temp = 0;
            for (int j = 0; j < grid[0].length; j++) {
                temp = temp * 10 + grid[i][j];
            }
            res += binaryToDecimal(temp);
        }
        return res;
    }
}