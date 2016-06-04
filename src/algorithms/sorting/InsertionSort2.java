package algorithms.sorting;

import java.util.Scanner;

public class InsertionSort2 {

	public static void insertionSortPart2(int[] ar) {
		// Fill up the code for the required logic here
		// Manipulate the array as required
		// The code for Input/Output is already provided
		
		for (int i = 1; i < ar.length; i++) {
			int minIndex = i;
			for (int j = i - 1; j > -1; j--) {
				if (ar[j] > ar[i]) {
					minIndex = j;
				}
			}
			if (minIndex < i) {
				int V = ar[i];
				for (int k = i; k > minIndex; k--) {
					ar[k] = ar[k-1];
				}
				ar[minIndex] = V;
			}
			printArray(ar);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
//		int[] ar = new int[]{1,4,3,5,6,2};
//		int[] ar = new int[]{9,8,6,7,3,5,4,1,2};
		insertionSortPart2(ar);
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
