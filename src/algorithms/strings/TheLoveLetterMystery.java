package algorithms.strings;

import java.util.Scanner;

public class TheLoveLetterMystery {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        String s;
        
        for (int i = 0; i < tests; i++) {
        	int changes = 0;
        	s = in.next();

        	char c1, c2;
        	for (int j = 0; j < s.length() / 2; j++) {
        		c1 = s.charAt(j);
        		c2 = s.charAt(s.length() - j - 1);
        		if (c2 > c1)  {
        			changes += (c2 - c1);
        		} else  {
        			changes += (c1 - c2);
        		}
        	}
            System.out.println(changes);
        }
    }
}
