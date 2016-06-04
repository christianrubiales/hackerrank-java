package algorithms.sorting;

import java.util.LinkedList;
import java.util.Scanner;

public class QuickSort1Partition {

	static void partition(int[] ar) {
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		int p = ar[0];
		
		list1.add(p);
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] < p) {
				list2.add(ar[i]);
			} else {
				list1.add(ar[i]);
			}
		}

		for (int i = 0; i < list2.size(); i++) {
			ar[i] = (int) list2.get(i);
		}

		for (int i = 0; i < list1.size(); i++) {
			ar[list2.size() + i] = (int) list1.get(i);
		}
	}

	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		partition(ar);
		printArray(ar);
	}
}
