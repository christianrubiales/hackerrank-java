package algorithms.sorting;

import java.util.Scanner;

public class CountingSort1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] counts = new int[100];
        
        int x;
        for (int i = 0; i < n; i++) {
            x = in.nextInt();
            counts[x] = ++counts[x];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(counts[i] + " ");    
        }
    }
}
