package algorithms.strings;

import java.util.Scanner;

public class AlternatingCharacters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        
        String s;
        for (int i = 0; i < n; i++) {
            s = in.next();
            int c = 0;
            for (int j = 0; j < s.length() - 1; j++) {
                if (s.charAt(j) == s.charAt(j+1)) {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
