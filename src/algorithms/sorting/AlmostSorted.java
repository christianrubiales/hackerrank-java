package algorithms.sorting;

import java.util.Scanner;

public class AlmostSorted {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		int i = 0;
		int j = n - 1;
		
		for (i = 0; i < n-1; i++) {
			if (arr[i] > arr[i+1]) {
				break;
			}
		}
		for (j = n-1; j > 0; j--) {
			if (arr[j] < arr[j-1]) {
				break;
			}
		}
		
		if (i == n - 1 && j == 0) {
			System.out.println("yes");
		} else {
			int t = arr[j];
			arr[j] = arr[i];
			arr[i] = t;
			boolean sorted = true;
			for (int k = 0; k < n - 1; k++) {
				if (arr[k] > arr[k+1]) {
					sorted = false;
					break;
				}
			}
			
			if (sorted) {
				System.out.println("yes");
				System.out.println("swap " + (i+1) + " " + (j+1));
			} else {
				t = arr[j];
				arr[j] = arr[i];
				arr[i] = t;
				sorted = true;
				for (int k = i; k < j; k++) {
					if (arr[k] < arr[k+1]) {
						sorted = false;
						break;
					}
				}

				if (sorted) {
					if (i > 0 && (arr[j] < arr[i-1])) {
						sorted = false;
					}
					if (j < n-1 && arr[i] > arr[j+1]) {
						sorted = false;
					}
				}

				if (sorted) {
					System.out.println("yes");
					System.out.println("reverse " + (i+1) + " " + (j+1));
				} else {
					System.out.println("no");
				}
			}
		}
	}
}
