package dataStructures.arrays;

import java.util.Scanner;

public class _2DArrayDS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matrix = new int[6][6];
        
        // read
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int sum = 0;
                for (int n = 0; n < 3; n++) {
                    for (int m = 0; m < 3; m++) {
                        if (!(n == 1 && (m == 0 || m == 2))) {
                            sum += matrix[i+n][j+m];
                        }
                    }
                }
                max = sum > max ? sum : max;
            }
        }
        System.out.println(max);
    }
}
