package contests.projectEuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ProjectEuler035CircularPrimes {

    public static void main(String[] args) {
    	getPrimes();
    	getCircularPrimes();
        Scanner in = new Scanner(System.in);
        System.out.println(sumCircularPrimes(in.nextInt()));
    }
    
    static final int MAX = 1000001;
    static Set<Integer> primes = new LinkedHashSet<>();
    static List<Integer> circularPrimes = new ArrayList<>();
    
    static long sumCircularPrimes(int max) {
        long sum = 0;

        for (int i = 0; i < max; i++) {
        	if (Collections.binarySearch(circularPrimes, i) > -1) {
        		sum += i;
        	}
        }
       
        return sum;
    }

    static void getCircularPrimes() {
        for (int i : primes) {
            if (i < 10) {
        		circularPrimes.add(i);
            } else {
                boolean allPrime = true;
            	if (containsZero(i)) {
                	allPrime = false;
            	} else {
	                int d = countDigits(i);
	                int t = i;
	                for (int j = 0; j < d - 1; j++) {
	                    t = rotate(t);
	                    if (!primes.contains(t)) {
	                    	allPrime = false;
	                    	break;
	                    }
	                }
            	}
                if (allPrime) {
                	circularPrimes.add(i);
                }
            }
        }
    }
    
    static void getPrimes() {
        boolean[] sieve = new boolean[MAX];
        for (int i = 2; i < MAX; i++) {
            sieve[i] = true;
        }
       
        for (int i = 2; i < MAX; i++) {
            for (int j = i + i; j < MAX; j += i) {
                sieve[j] = false;
            }
        }
        for (int i = 0; i < MAX; i++) {
            if (sieve[i]) {
                primes.add(i);
            }
        }
    }
   
    static Integer rotate(Integer number) {
        if (number > 9) {
            String s = String.valueOf(number);
            s = s.substring(1) + ("" + s.charAt(0));
            return Integer.parseInt(s);
        } else {
            return number;
        }
    }

    static boolean containsZero(int num) {
    	String s = String.valueOf(num);
    	
    	for (int i = 0; i < s.length(); i++) {
    		if (s.charAt(i) == '0') {
    			return true;
    		}
    	}
    	
    	return false;
    }
    
    static int countDigits(int num) {
        return String.valueOf(num).length();
    }
}
