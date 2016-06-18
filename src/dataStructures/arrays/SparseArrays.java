package dataStructures.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        Map<String, Integer> map = new HashMap<String, Integer>(); // map string to count
        for (int i = 0; i < n; i++) {
            String s = in.next();
            Integer count = map.get(s);
            if (count == null) {
                count = 0;
            }
            count++;
            map.put(s, count);
        }
        
        // query
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            String s = in.next();
            System.out.println(map.containsKey(s) ? map.get(s) : "0");
        }
    }
}
