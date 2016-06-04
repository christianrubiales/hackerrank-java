package algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class IntroToTutorialChallenges {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int V = in.nextInt();
		int n = in.nextInt();
		int[] ar = new int[n];

		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		System.out.println(Arrays.binarySearch(ar, V));
	}

}
