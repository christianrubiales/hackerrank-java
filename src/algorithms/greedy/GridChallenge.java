package algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class GridChallenge {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            in.nextLine();
            char[][] matrix = new char[N][N];
            
            for (int j = 0; j < N; j++) {
                matrix[j] = in.nextLine().toCharArray();
                Arrays.sort(matrix[j]);
            }
            
            boolean possible = true;
            for (int j = 0; j < N; j++) {
                char[] unsorted = new char[N];
                char[] sorted = new char[N];
                for (int k = 0; k < N; k++) {
                    unsorted[k] = matrix[k][j];
                    sorted[k] = matrix[k][j];
                }
                Arrays.sort(sorted);
                boolean ok = true;
                for (int k = 0; k < N; k++) {
                    if (unsorted[k] != sorted[k]) {
                        ok = false;
                        break;
                    }
                }
                if (!ok) {
                    possible = false;
                    break;
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
    }
}
