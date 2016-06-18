package algorithms.sorting;

import java.util.Scanner;

public class RunningTimeOfAlgorithms {

	public static int insertionSortPart2(int[] ar) {
		int swaps = 0;
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
					ar[k] = ar[k - 1];
					swaps++;
				}
				ar[minIndex] = V;
			}
		}
		return swaps;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		System.out.println(insertionSortPart2(ar));
	}
}
