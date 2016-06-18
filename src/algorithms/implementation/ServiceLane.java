package algorithms.implementation;

import java.util.Scanner;

public class ServiceLane {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int numPairs = in.nextInt();
        
        int[] widths = new int[size];
        for (int i = 0; i < size; i++) {
        	widths[i] = in.nextInt();
        }
        
        int[][] pairs = new int[numPairs][];
        for (int i = 0; i < numPairs; i++) {
        	pairs[i] = new int[2];
        	pairs[i][0] = in.nextInt();
        	pairs[i][1] = in.nextInt();
        }
//        System.out.println(Arrays.deepToString(pairs));
        
        int min;
        for (int i = 0; i < numPairs; i++) {
        	min = Integer.MAX_VALUE;
        	int[] pair = pairs[i];
        	
            for (int j = pair[0]; j <= pair[1]; j++) {
            	if (widths[j] < min) {
            		min = widths[j];
            	}
            }
            System.out.println(min);
        }
    }
}
