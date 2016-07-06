package algorithms.implementation;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int rows = (int) Math.sqrt(s.length());
        int cols = (int) Math.ceil(Math.sqrt(s.length()));
        if (rows * cols < s.length()) {
        	rows++;
        }
        char[][] matrix = new char[rows][cols];
        
        int i = 0;
        int j = 0;
        int x;
        for (int m = 0; m < s.length(); m++) {
            matrix[i][j] = s.charAt(m);
            j++;
            if (j == cols) {
                j = 0;
                i++;
            }
        }
        for (int m = 0; m < cols; m++) {
            for (int n = 0; n < rows; n++) {
                if (matrix[n][m] > 0) {
                    System.out.print(matrix[n][m]);
                }
            }
            System.out.print(" ");
        }
	}

}
