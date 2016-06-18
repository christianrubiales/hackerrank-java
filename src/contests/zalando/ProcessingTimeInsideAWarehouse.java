package contests.zalando;

import java.util.Scanner;

public class ProcessingTimeInsideAWarehouse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] E = new int[M];
        
        for (int i = 0; i < M; i++) {
            E[i] = in.nextInt();
        }
        
        int j = 1;
        while (true) {
            int P = 0;
            for (int i = 0; i < M; i++) {
                P += j / E[i];
            }
            if (P >= N) {
                break;
            }
            j++;
        }
        System.out.println(j);
    }

}
