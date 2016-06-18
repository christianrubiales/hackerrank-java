package contests.zalando;

import java.util.Scanner;

public class GiveMeTheOrder2 {
	
	static void reverse(int[] arr, int L, int R) {
		int t = 0;
		for (int i = 0; i < ((R - L) / 2); i++) {
			t = arr[L + i];
			arr[L + i] = arr[R - i - 1];
			arr[R - i - 1] = t;
		}
	}

	static void rotate(int[] arr, int len, int L, int R) {
		reverse(arr, 0, R);
		reverse(arr, 0, R - L + 1);
		reverse(arr, R - L + 1, R);
	}

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int N = in.nextInt();
    	
    	int[] arr = new int[N];
    	for (int i = 0; i < N; i++) {
    		arr[i] = in.nextInt();
    	}

    	int M = in.nextInt();
    	for (int i = 0; i < M; i++) {
        	int L = in.nextInt();
        	int R = in.nextInt();
        	
        	int len = R - L + 1;
        	rotate(arr, len, L, R);
    	}

    	System.out.print(arr[0]);
    	for (int j = 1; j < arr.length; j++) {
        	System.out.print(" " + arr[j]);
    	}
    	System.out.println();
    }
}
