package algorithms.search;

import java.util.Scanner;

public class IceCreamParlor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        for (int i = 0; i < T; i++) {
            int M = in.nextInt();
            int N = in.nextInt();
            
            int[] a = new int[N];
            for (int j = 0; j < N; j++) {
                a[j] = in.nextInt();
            }
            for (int j = 0; j < N; j++) {
            	boolean found = false;
                for (int k = 0; k < N; k++) {
	                if (j != k && a[j]+a[k] == M) {
	                    System.out.println((j+1) + " " + (k+1));
	                    found = true;
	                    break;
	                }
                }
                if (found) {
                	break;
                }
            }
        }
    }
}
