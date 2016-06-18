package contests.zalando;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakeOurCustomersHappy2 {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int WA = in.nextInt();
    	int WB = in.nextInt();
    	int WC = in.nextInt();
    	int M = in.nextInt();
    	in.nextLine();

    	boolean[][] orders = new boolean[M][3];
    	for (int i = 0; i < M; i++) {
    		String t = in.nextLine();
    		if (t.indexOf('A') > -1) {
    			orders[i][0] = true;
    		}
    		if (t.indexOf('B') > -1) {
    			orders[i][1] = true;
    		}
    		if (t.indexOf('C') > -1) {
    			orders[i][2] = true;
    		}
    	}
    	
    	long happy = 0;
    	for (long i = (long) Math.pow(2, M) - 1; i > -1; i--) {
    		String t = Long.toBinaryString(i);
//    		if (Long.bitCount(i) < happy) {
//    			break;
//    		}
    		for (int j = 0; j < M - t.length(); j++) {
    			t = "0" + t;
    		}
    		int ta = 0;
    		int tb = 0;
    		int tc = 0;
    		for (int j = 0; j < t.length(); j++) {
    			if (t.charAt(j) == '1') {
	    			if (orders[j][0]) {
	    				ta++;
	    			}
	    			if (orders[j][1]) {
	    				tb++;
	    			}
	    			if (orders[j][2]) {
	    				tc++;
	    			}
    			}
    		}
    		if (ta <= WA && tb <= WB && tc<= WC) {
    			happy = Long.bitCount(i) > happy ? Long.bitCount(i) : happy;
    		}
    	}
    	
    	System.out.println(happy);
    }
}
