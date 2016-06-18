package algorithms.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoStrings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        for (int i = 0; i < T*2; i++) {
            String s1 = in.next();
            String s2 = in.next();
            Set<Character> set = new HashSet<Character>();
            
            for (Character c : s1.toCharArray()) {
                set.add(c);
            }
            
            boolean hasCommon = false;
            for (Character c : s2.toCharArray()) {
                if (set.contains(c)) {
                    hasCommon = true;
                    break;
                }
            }
            System.out.println(hasCommon ? "YES" : "NO");
        }
    }
}
