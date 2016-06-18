package algorithms.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TwoArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            int K = in.nextInt();
            List<Integer> a = new ArrayList<Integer>();
            List<Integer> b = new ArrayList<Integer>();
            for (int j = 0; j < N; j++) {
                a.add(in.nextInt());
            }
            for (int j = 0; j < N; j++) {
                b.add(in.nextInt());
            }
            Collections.sort(a);
            Collections.sort(b, Collections.reverseOrder());
            String exists = "YES";
            int c = 0;
            for (int j = 0; j < N; j++) {
                if (a.get(j) + b.get(j) < K) {
                    exists = "NO";
                    break;
                }
            }
            System.out.println(exists);
        }
    }
}
