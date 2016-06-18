package algorithms.warmup;

import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] m = new int[n][n];
        
        int d1 = 0, d2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = in.nextInt();
                if (i == j) {
                    d1 += m[i][j];
                }
                if (i == n-j-1) {
                    d2 += m[i][j];
                }
            }
        }
        System.out.println(Math.abs(d1-d2));
    }
}
