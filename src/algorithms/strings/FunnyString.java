package algorithms.strings;

import java.util.Scanner;

public class FunnyString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        for (int i = 0; i < T; i++) {
            String s = in.next();
            
            boolean funny = true;
            for (int j = 0; j < s.length() - 1; j++) {
                if ((int) Math.abs(s.charAt(j) - s.charAt(j+1)) != 
                    (int) Math.abs(s.charAt(s.length() - j - 1) - s.charAt(s.length() - j - 2))) {
                    funny = false;
                    break;
                }
            }
            System.out.println(funny ? "Funny" : "Not Funny");
        }
    }
}
