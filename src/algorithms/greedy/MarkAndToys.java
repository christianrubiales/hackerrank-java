package algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MarkAndToys {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
        Arrays.sort(A);
        
        int T = 0;
        int c = 0;
        for (int i = 0; i < N; i++) {
            if (T + A[i] <= K) {
                T += A[i];
                c++;
            } else {
                break;
            }
        }
        System.out.println(c);
    }
}
