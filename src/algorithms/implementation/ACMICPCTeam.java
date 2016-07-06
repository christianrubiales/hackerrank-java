package algorithms.implementation;

import java.util.BitSet;
import java.util.Scanner;

public class ACMICPCTeam {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        BitSet[] arr = new BitSet[n];
        
        for (int i = 0; i < n; i++) {
        	String s = in.next();
        	arr[i] = new BitSet(m);
            for (int j = 0; j < m; j++) {
            	if ('1' == s.charAt(j)) {
            		arr[i].set(j);
            	}
            }
        }
        
        int maxTopics = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
            	BitSet clone = ((BitSet) arr[i].clone());
            	clone.or(arr[j]);
                int x = clone.cardinality(); 
                maxTopics = x > maxTopics ? x : maxTopics;
            }
        }
        int maxTeams = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
            	BitSet clone = ((BitSet) arr[i].clone());
            	clone.or(arr[j]);
                if (clone.cardinality() == maxTopics) {
                    maxTeams++;
                }
            }
        }
        System.out.println(maxTopics);
        System.out.println(maxTeams);
	}

}
