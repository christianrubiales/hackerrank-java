package algorithms.sorting;

import java.util.Scanner;

public class CountingSort2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] counts = new int[100];
        
        // count
        int x;
        for (int i = 0; i < n; i++) {
            x = in.nextInt();
            counts[x] = ++counts[x];
        }
        
        // print
        for (int i = 0; i < n; i++) {
            if (counts[i] > 0) {
                for (int j = 0; j < counts[i]; j++) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
