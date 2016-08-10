package contests.projectEuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjectEuler002EvenFibonacciNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		long max = 0;
		long[] arr = new long[(int) t];
		
		for (int i = 0; i < t; i++) {
			long n = in.nextLong();
			arr[i] = n;
			max = Math.max(max, n);
		}
		
		List<Long> fib = new ArrayList<>();
		List<Long> evenFib = new ArrayList<>();
		
		fib.add(0L);
		fib.add(1L);
		while (fib.get(fib.size() - 1) < max) {
			int i = fib.size();
			fib.add(fib.get(i-1) + fib.get(i-2));
			if (fib.get(i) % 2 == 0) {
				evenFib.add(fib.get(i));
			}
		}

		for (int i = 0; i < t; i++) {
			long sum = 0;
			for (int j = 0; j < evenFib.size(); j++) {
				if (evenFib.get(j) <= arr[i]) {
					sum += evenFib.get(j);
				} else {
					break;
				}
			}
			System.out.println(sum);
		}
	}
}
