package algorithms.search;

import java.util.Arrays;
import java.util.Scanner;

public class Pairs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i ++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int c = 0;
        for (int i = 0; i < n; i ++) {
            if (Arrays.binarySearch(arr, k + arr[i]) > -1) {
                c++;
            }
        }
        System.out.println(c);
    }
}
