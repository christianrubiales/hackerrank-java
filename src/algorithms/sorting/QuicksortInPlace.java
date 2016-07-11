package algorithms.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuicksortInPlace {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		quicksort(arr, 0, arr.length - 1);
	}

	static void quicksort(int[] arr, int low, int high) {
		if (low < high) {
			int p = partition(arr, low, high);
			
			for (int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
			
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
			}
		}
		
		int t = arr[i];
		arr[i] = arr[high];
		arr[high] = t;
		
		return i;
	}
}
