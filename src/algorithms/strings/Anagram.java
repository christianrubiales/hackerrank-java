package algorithms.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        String s;
        char[] s1;
        char[] s2;
        while (in.hasNext()) {
            s = in.next();
            if (s.length() % 2 != 0 || s.length() == 0) {
                System.out.println(-1);
            } else {
                s1 = s.substring(0, s.length() / 2).toCharArray();
                s2 = s.substring(s.length() / 2).toCharArray();
                
                Map<Character, Integer> map = new HashMap<Character, Integer>();
                
                for (Character ch : s1) {
                    Integer i = map.get(ch);
                    if (i == null) {
                        i = 0;
                        map.put(ch, i);
                    }
                    i++;
                    map.put(ch, i);
                }
                
                int c = 0;
                for (Character ch : s2) {
                    if (map.containsKey(ch)) {
                        int i = map.get(ch);
                        if (i > 0) {
                            i--;
                            map.put(ch, i);
                        } else {
                            c++;
                        }
                    } else {
                        c++;
                    }
                }
                System.out.println(c);
            }
        }
    }
}
