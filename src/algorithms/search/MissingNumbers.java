package algorithms.search;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] an = new int[n];
        for (int i = 0; i < n; i++) {
            an[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] am = new int[m];
        for (int i = 0; i < m; i++) {
            am[i] = in.nextInt();
        }
        Arrays.sort(an);
        Arrays.sort(am);
        
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (an[i] == am[j]) {
                i++;
                j++;
            } else {
                System.out.print(am[j] + " ");
                j++;
            }
        }
    }
}
