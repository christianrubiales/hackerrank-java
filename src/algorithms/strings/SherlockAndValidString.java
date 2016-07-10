package algorithms.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SherlockAndValidString {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        Map<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Integer count = counts.get(s.charAt(i));
            if (count == null) {
                count = 0;
            }
            ++count;
            counts.put(s.charAt(i), count);
        }
        boolean valid = true;
        Set<Integer> values = new HashSet<Integer>(counts.values());
        if (values.size() > 2) {
            valid = false;
        } else if (values.size() == 2) {
            Integer[] arr = (Integer[]) values.toArray(new Integer[values.size()]);
            int[] temp = new int[2];
            for (Character c : counts.keySet()) {
        		if (counts.get(c) == arr[0]) {
        			++temp[0];
        		} else {
        			++temp[1];
        		}
        	}
            if (temp[0] == 1 || temp[1] == 1) {
            	valid = true;
            } else if (temp[0] == temp[1]) {
            	valid = false;
            } else {
            	int min = temp[0] <= temp[1] ? temp[0] : temp[1];
            	int max = temp[0] > temp[1] ? temp[0] : temp[1];
            	if (min - 1 == max || min - 1 == 0) {
            		valid = true;
            	} else {
            		valid = false;
            	}
            }
        }
        
        System.out.println(valid ? "YES" : "NO");
	}

}
