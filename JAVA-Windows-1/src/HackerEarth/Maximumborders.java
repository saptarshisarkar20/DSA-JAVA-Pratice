package HackerEarth;

import java.util.Scanner;

/*
* Problem
You are given a table with
 rows and
 columns. Each cell is colored with white or black. Considering the shapes created by black cells, what is the maximum border of these shapes? Border of a shape means the maximum number of consecutive black cells in any row or column without any white cell in between.

A shape is a set of connected cells. Two cells are connected if they share an edge. Note that no shape has a hole in it.

Input format

The first line contains
 denoting the number of test cases.
The first line of each test case contains integers
 denoting the number of rows and columns of the matrix. Here, '#' represents a black cell and '.' represents a white cell.
Each of the next
 lines contains
 integers.
Output format

Print the maximum border of the shapes.
* */
public class Maximumborders {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            T -= 1;
            int res = 0;
            int row = sc.nextInt();
            int col = sc.nextInt();
            for (int i = 0; i < row; i++) {
                char[] arr = sc.next().toCharArray();
                int tempCnt = 0;
                for (int j = 0; j < col; j++) {
                    if (arr[j] == '#') tempCnt++;
                }
                res = Math.max(res, tempCnt);
            }
            System.out.println(res);
        }
    }

}