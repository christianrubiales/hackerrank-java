package dataStructures.advanced;

import java.io.*;
import java.util.*;

public class Triplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        SortedSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            set.add(in.nextInt());
        }
        int triplets = 0;
        int[] arr = new int[3];
        int limit = (int) Math.pow(set.size(), 2);
        for (int i = 0; i < limit; i++) {
            if (Integer.bitCount(i) == 3) {
                String s = Integer.toBinaryString(i);
                int c = 0;
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == '1') {
                        arr[c] = j;
                        c++;
                        if (c > 1 && arr[c - 1] <= arr[c - 2]) {
                            break;
                        }
                    }
                }
                if (c == 3) {
                    triplets++;
                }
            }
        }
        System.out.println(triplets);
    }
}