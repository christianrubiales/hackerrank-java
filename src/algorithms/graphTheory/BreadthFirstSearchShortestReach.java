package algorithms.graphTheory;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BreadthFirstSearchShortestReach {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int m = in.nextInt();
            
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int j = 1; j <= n; j++) {
                map.put(j, new ArrayList<Integer>());
            }
            
            for (int j = 0; j < m; j++) {
                int a = in.nextInt();
                int b = in.nextInt();
                
                map.get(a).add(b);
                map.get(b).add(a);
            }
            
            int s = in.nextInt();
            int[] dist = new int[n+1];
            
            BitSet visited = new BitSet(n+1);
            visited.set(s);
            Deque<Node> queue = new ArrayDeque<>();
            
            Node node = new Node();
            node.data = s;
            node.distance = 0;
            dist[s] = 0;
            queue.addLast(node);
            
            while (!queue.isEmpty()) {
                Node x = queue.removeFirst();
              if (!visited.get(x.data)) {
                    visited.set(x.data);
                    dist[x.data] = x.distance;	
                }
                
                for (Integer y : map.get(x.data)) {
                	if (!visited.get(y)) {
                        node = new Node();
                        node.data = y;
                        node.distance = x.distance + 1;
                        queue.addLast(node);
                	}
                }
            }
                    
            for (int j = 1; j <= n; j++) {
            	if (j != s) {
                    System.out.print(dist[j] > 0 ? (dist[j]*6) + " " : "-1 ");
            	}
            }
            System.out.println();
        }
    }
    
    static class Node {
        Integer data;
        int distance;
        
        public String toString() {
        	return "data: " + data + ", distance: " + distance;
        }
    }
}
