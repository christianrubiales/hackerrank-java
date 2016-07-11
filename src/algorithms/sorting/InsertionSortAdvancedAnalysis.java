package algorithms.sorting;

import java.util.Scanner;

public class InsertionSortAdvancedAnalysis {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            count = 0L;
            sort(arr);
            System.out.println(count);
        }
    }
	
	static Long count = 0L;
    
    static void sort(int[] arr) {
        int[] temp = new int[arr.length];
        sort(arr, temp, 0, arr.length -1);
    }
    
    static void sort(int[] arr, int[] temp, int low, int high) {
        if (low < high) {
            int middle = low + ((high - low)/2);
            sort(arr, temp, low, middle);
            sort(arr, temp, middle + 1, high);
            merge(arr, temp, low, middle, high);
        }
    }
    
    static void merge(int[] arr, int[] temp, int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }
        
        int i = low;
        int j = middle + 1;
        int k = low;
        
        while (i <= middle && j <= high) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
            	count += (middle - i + 1);
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        
        while (i <= middle) {
            arr[k] = temp[i];
            i++;
            k++;
        }
    }

}
