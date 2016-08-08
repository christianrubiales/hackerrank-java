package dataStructures.disjointSet;

import java.util.Scanner;

public class MergingCommunities {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int Q = in.nextInt();
        
        QuickUnion qu = new QuickUnion(n);
        
        for (int i = 0; i < Q; i++) {
        	String q = in.next();
        	
        	if ("M".equals(q)) {
        		qu.union(in.nextInt(), in.nextInt());
        	} else {
        		System.out.println(qu.sizes[qu.root(in.nextInt())]);
        	}
        }
    }
    
    private static class QuickUnion {
        int[] sizes;
        int[] parent;
        
        QuickUnion(int n) {
        	sizes = new int[n+1];
            parent = new int[n+1];
            for (int i = 0; i <= n; i++) {
            	sizes[i] = 1;
            }
            for (int i = 0; i <= n; i++) {
                parent[i] = i;
            }
        }
        
        int root(int i) {
            while (i != parent[i]) {
                parent[i] = parent[parent[i]];
                i = parent[i];
            }
            return i;
        }
                            
        void union(int p, int q) {
            int rp = root(p);
            int rq = root(q);
            int sp = sizes[rp];
            int sq = sizes[rq];

            parent[rp] = rq;
            if (rp != rq) {
	            sizes[rp] = sp + sq;
	            sizes[rq] = sizes[rp];
            }
        }
    }
}
