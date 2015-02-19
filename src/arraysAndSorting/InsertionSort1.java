package arraysAndSorting;

import java.util.Scanner;

public class InsertionSort1 {

	public static void insertIntoSorted(int[] ar) {
		if (ar.length > 1) {
			int V = ar[ar.length - 1];
			int t = ar.length - 2;
			while (t > -1 && ar[t] > V) {
				ar[t + 1] = ar[t];
				t--;
				printArray(ar);
			}
			ar[t + 1 > -1 ? t + 1 : 0] = V;
		}
		printArray(ar);
	}

	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		// int[] ar = new int[] {3};
		// int[] ar = new int[] {2,3,1};
		insertIntoSorted(ar);
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
