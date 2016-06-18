package contests.zalando;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class WhichWarehousesCanFulfillTheseOrders {

	static class Warehouse implements Comparable<Warehouse> {
		int id;
		int stock;
		
		public int compareTo(Warehouse o) {
			if (o.stock == this.stock) {
				return o.id - this.id;
			}
			
			return o.stock - this.stock;
		}

		public boolean equals(Warehouse o) {
			return this == o;
		}
		public int hashCode() {
			return id;
		}
		
		public String toString() {
			return "[stock:" + stock + ", id:" + id + "]";
		}
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt();
        int B = in.nextInt();
        int P = in.nextInt();
        
        // map product to warehouses and their stock
        Map<Integer, SortedSet<Warehouse>> map = new HashMap<Integer, SortedSet<Warehouse>>();
        for (int i = 0; i < W; i++) {
            for (int j = 0; j < P; j++) {
                int S = in.nextInt();
                if (S > 0) {
                    SortedSet<Warehouse> whstocks = map.get(j);
                    if (whstocks == null) {
                        whstocks = new TreeSet<Warehouse>();
                        map.put(j, whstocks);
                    }
                    Warehouse warehouse = new Warehouse();
                    warehouse.id = i;
                    warehouse.stock = S;
                    whstocks.add(warehouse);
                }
            }
        }
        in.nextLine();
        
        for (int i = 0; i < B; i++) {
            Set<Integer> warehouses = new HashSet<Integer>();
            String[] temp = in.nextLine().split(" ");
            for (int j = 0; j < P; j++) {
                int PO = Integer.parseInt(temp[j]);
                if (PO > 0) {
                	if (!map.containsKey(j)) {
	                    warehouses.clear();
	                    break;
                	}
                    int t = 0;
	                for (Warehouse whstock : map.get(j)) {
	                    t += whstock.stock;
	                    warehouses.add(whstock.id);
	                    if (t >= PO) {
	                    	break;
	                    }
	                }
	                if (t < PO) {
	                    warehouses.clear();
	                    break;
	                }
                }
            }
            System.out.println(warehouses.isEmpty() ? "-1" : warehouses.size());
        }
    }

}
