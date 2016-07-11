package algorithms.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quicksort2Sorting {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(in.nextInt());
		}
		quicksort(list);
	}

	static List<Integer> quicksort(List<Integer> list) {
		if (list.size() <= 1) {
			return list;
		}
		
		int p = list.get(0);
		List<Integer> left = new ArrayList<>();
		List<Integer> right = new ArrayList<>();
		
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) <= p) {
				left.add(list.get(i));
			} else {
				right.add(list.get(i));
			}
		}
		left = quicksort(left);
		right = quicksort(right);
		left.add(p);
		left.addAll(right); 
		
		for (Integer i : left) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		return left;
	}
}
