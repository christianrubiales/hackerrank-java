package contests.zalando;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class MatchTheShoes {

    static class Shoe implements Comparable<Shoe> {
        
        int id;
        int orders = 0;
        
        public int compareTo(Shoe o) {
            if (this.orders == o.orders) {
                return this.id - o.id;
            }
            return o.orders - this.orders;
        }
        
        public int hashCode() {
            return id;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int M = in.nextInt();
        int N = in.nextInt();
        
        // id to orders
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < M; i++) {
        	map.put(i, 0);
        }
        for (int i = 0; i < N; i++) {
        	Integer id = in.nextInt();
        	if (map.containsKey(id)) {
        		map.put(id, map.get(id) + 1);
        	} else {
        		map.put(id, 1);
        	}
        }
        SortedSet<Shoe> shoes = new TreeSet<Shoe>();
        for (Integer id : map.keySet()) {
            Shoe shoe = new Shoe();
            shoe.id = id;
            shoe.orders = map.get(id);
            shoes.add(shoe);
        }
        int i = 0;
        for (Shoe shoe : shoes) {
            if (i == K) {
                break;
            }
            System.out.println(shoe.id);
            i++;
        }
    }

}
