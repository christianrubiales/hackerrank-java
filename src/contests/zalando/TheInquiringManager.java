package contests.zalando;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TheInquiringManager {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        // map time to orders max
        SortedMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < N; i++) {
            int X = in.nextInt();
            if (1 == X) {
                int P = in.nextInt();
                int T = in.nextInt();
                if (!map.containsKey(T)) {
                    map.put(T, P);
                } else {
                	map.put(T, P > map.get(T) ? P : map.get(T));
                }
            } else {
                int T = in.nextInt();
                List<Integer> toRemove = new ArrayList<Integer>(); 
                
                for (Integer time : map.keySet()) {
                    if (time < T - 59) {
                        toRemove.add(time);
                    } else {
                        break;
                    }
                }
                // remove
                for (Integer time : toRemove) {
                	map.remove(time);
                }
                
                SortedSet<Integer> orders = new TreeSet<Integer>(Collections.reverseOrder());
                for (Integer time : map.keySet()) {
                    orders.add(map.get(time));
                }
                System.out.println(orders.isEmpty() ? -1 : orders.first());
            }
        }
    }
}
