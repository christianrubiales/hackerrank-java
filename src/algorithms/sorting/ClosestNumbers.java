package algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ClosestNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        // read
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        // save closest pairs
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < n - 1; i++) {
            if (arr[i+1] - arr[i] < min) {
                min = arr[i+1] - arr[i];
                list.clear();
                list.add(arr[i] + "," + arr[i+1]);
            } else if (arr[i+1] - arr[i] == min) {
                list.add(arr[i] + "," + arr[i+1]);
            }
        }
        
        // print
        for (String s : list) {
            String[] split = s.split(",");
            System.out.print(split[0] + " " + split[1] + " ");
        }
    }
}
