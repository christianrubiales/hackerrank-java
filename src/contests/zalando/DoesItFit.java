package contests.zalando;

import java.util.Arrays;
import java.util.Scanner;

public class DoesItFit {
	
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int W = in.nextInt();
    	int H = in.nextInt();
    	int[] D = new int[]{W, H};
    	Arrays.sort(D);
    	
    	int N = in.nextInt();
    	for (int i = 0; i < N; i++) {
        	String S = in.next();
        	if ("R".equals(S)) {
        		int w = in.nextInt();
        		int h = in.nextInt();
            	int[] d = new int[]{W, H};
            	Arrays.sort(d);
//        		if ((w <= W || w <= H) && (h <= W || h <= H) && (W*H >= w*h)) {
            	if (d[0] <= D[0] && d[1] <= D[1] && (W*H >= w*h)) {
        			System.out.println("YES");
        		} else {
        			System.out.println("NO");
        		}
        	} else {
        		int r = in.nextInt();
        		
        		double E = 1e-15;
        		double A = Math.PI * (r*r);
        		if (Math.abs((W*H) - A) > A * E) {
        			System.out.println("YES");
        		} else {
        			System.out.println("NO");
        		}
        	}
    	}
    }
}
