package dataStructures.disjointSet;

import java.util.Scanner;

public class ComponentsInAGraph {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        QuickUnion qu = new QuickUnion(2*n);
        for (int i = 0; i < n; i++) {
            qu.union(in.nextInt(), in.nextInt());
        }
        for (int i = 0; i <= 2*n; i++) {
            int ri = qu.root(i);
            if (i != ri) {
            	qu.parent[i] = ri;
            }
        }
        
        int[] counts = new int[2*n+1];
        for (int i = 0; i < counts.length; i++) {
            counts[qu.parent[i]]++;
        }
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > max) {
                max = counts[i];
            }
            if (counts[i] < min && counts[i] > 1) {
                min = counts[i];
            }
        }
        System.out.println(min + " " + max);
    }
    
    private static class QuickUnion {
        int[] parent;
        
        QuickUnion(int n) {
            parent = new int[n+1];
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
            parent[rp] = rq;
        }
    }
}
