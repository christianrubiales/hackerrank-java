package algorithms.graphTheory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class PrimsMSTSpecialSubtree {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        Map<Integer, List<Node>> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<Node>());
        }
        for (int i = 0; i < m; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int r = in.nextInt();
            
            map.get(x).add(new Node(x, y, r));
            map.get(y).add(new Node(y, x, r));
        }
        
        int v = 1;
        int total = 0;
        Set<Integer> mst = new HashSet<>();
        mst.add(v);
        SortedSet<Node> available = new TreeSet<Node>(new Comparator<Node>() {
			public int compare(Node o1, Node o2) {
				return o1.r - o2.r;
			}
		});
        boolean[] visited = new boolean[n+1];
        visited[1] = true;
        for (int i = 0; i < n - 1; i++) {
        	available.addAll(map.get(v));
        	Node next = null;
        	Iterator<Node> iter = available.iterator();
        	while (next == null || visited[next.y]) {
        		next = iter.next();
        	}
        	visited[next.y] = true;
//        	System.err.println(next);
        	total += next.r;
        	available.remove(next);
        	map.get(next.x).remove(new Node(next.x, next.y, next.r));
        	map.get(next.y).remove(new Node(next.y, next.x, next.r));
        	v = next.y;
        }
        System.out.println(total);
    }
    
    static class Node {
        int x;
        int y;
        int r;
        Node(int x, int y, int r) {
            this.x = x;
            this.y = y;
            this.r = r;
        }
        public String toString() {
        	return "[x:"+x+",y:"+y+",r:"+r+"]";
        }
        public boolean equals(Object obj) {
        	return x == ((Node) obj).x && y == ((Node) obj).y && r == ((Node) obj).r;
        }
    }

}
