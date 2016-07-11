package algorithms.sorting;

import java.util.Scanner;

public class RunningTimeOfQuicksort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = in.nextInt();
			arr2[i] = arr1[i];
		}
		insertionSortPart2(arr1);
		quicksort(arr2, 0, n - 1);
		System.out.println(insertionSortShifts - quickSortSwaps);
	}

	static long insertionSortShifts = 0;
	static long quickSortSwaps = 0;

	static void insertionSortPart2(int[] ar) {
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
					insertionSortShifts++;
				}
				ar[minIndex] = V;
			}
		}
	}
	
	static void quicksort(int[] arr, int low, int high) {
		if (low < high) {
			int p = partition(arr, low, high);
			
			quicksort(arr, low, p - 1);
			quicksort(arr, p + 1, high);
		}
	}

	static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low;
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
				i++;
				quickSortSwaps++;
			}
		}
		
		int t = arr[i];
		arr[i] = arr[high];
		arr[high] = t;
		quickSortSwaps++;
		
		return i;
	}
}
