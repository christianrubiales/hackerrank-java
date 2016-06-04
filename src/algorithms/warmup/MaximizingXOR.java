package algorithms.warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaximizingXOR {
/*
 * Complete the function below.
 */

    /**
     * Test with:
     * 5
     * 6
     * must be 3
     */
    static int maxXor(int l, int r) {
    	int max = 0;
    	
        for (int i = l; i <= r; i++) {
            for (int j = i; j <= r; j++) {
            	if ((i ^ j) > max) {
            		max = i ^ j;
            	}
            }
        }
    	
    	return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
//        _l = 1; _r = 10; // must be 15
//        _l = 10; _r = 15; // must be 7
//        _l = 5; _r = 6; // must be 3
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }
}
