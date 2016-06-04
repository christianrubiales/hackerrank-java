package algorithms.warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HalloweenParty {

    /**
     * 1856378 -> 861534819721
     * 525494 -> 69035986009
     * 4137970 -> 4280698930225
     * 952497 -> 226812633752
     * 3477282 -> 3022872526881
     * 4915727 -> 6041092984632
     * 4743036 -> 5624097624324
     * 7987985 -> 15951976090056
     * 6440878 -> 10371227352721
     * 1523303 -> 580113007452
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();

        long k, c, f;
        for (int i = 0; i < tests; i++) {
        	k = in.nextLong();
        	c = (long) Math.ceil(((double) k)/2);
        	f = (long) Math.floor(((double) k)/2);
        	System.out.println(c*f);
        }
    }
}