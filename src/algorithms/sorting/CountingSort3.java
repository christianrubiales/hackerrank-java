package algorithms.sorting;

import java.util.Scanner;

public class CountingSort3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] counts = new int[100];
        
        // count
        int x;
        for (int i = 0; i < n; i++) {
            x = in.nextInt();
            in.next();
            counts[x] = ++counts[x];
        }
        
        for (int i = 1; i < 100; i++) {
            counts[i] = counts[i] + counts[i-1];
        }
        
        // print
        for (int i = 0; i < 100; i++) {
            System.out.print(counts[i] + " ");
        }
    }
}
