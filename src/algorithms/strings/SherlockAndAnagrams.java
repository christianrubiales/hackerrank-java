package algorithms.strings;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SherlockAndAnagrams {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for (int i = 0; i < t; i++) {
            String s = in.next();
            Map<String, Set<String>> map = new HashMap<>();
            for (int j = 0; j < s.length(); j++) {
                for (int k = j + 1; k <= s.length(); k++) {
                    String sub = sort(s.substring(j, k));
                    Set<String> set = map.get(sub);
                    if (set == null) {
                        set = new HashSet<>();
                        map.put(sub, set);
                    }
                    set.add(j+"-"+k);
                }
            }
            
            List<String> toRemove = new ArrayList<>();
            for (String key : map.keySet()) {
                if (map.get(key).size() < 2) {
                    toRemove.add(key);
                }
            }
            for (String key : toRemove) {
                map.remove(key);
            }
            long pairs = 0;
            for (String key : map.keySet()) {
            	pairs += ncr(map.get(key).size(), 2);
            }
            System.out.println(pairs);
        }
	}
	
	static String sort(String s) {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}

	static long ncr(int n, int r) {
		return fact(n).divide(fact(r).multiply(fact(n-r))).longValue();
	}
	
	static BigInteger fact(int n) {
		BigInteger f = new BigInteger("1");
		for (long i = 2; i <= n; i++) {
			f = f.multiply(new BigInteger("" + i));
		}
		return f;
	}

}
