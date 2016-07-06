package algorithms.implementation;

import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c)) {
                if (Character.isUpperCase(c)) {
                    System.out.print(Character.valueOf((char) (((c + k - 'A') % 26) + 'A')));
                } else {
                    System.out.print(Character.valueOf((char) (((c + k - 'a') % 26) + 'a')));
                }
            } else {
                System.out.print(c);
            }
        }
	}

}
