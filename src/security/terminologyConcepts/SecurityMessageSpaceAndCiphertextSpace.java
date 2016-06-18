package security.terminologyConcepts;

import java.util.Scanner;

public class SecurityMessageSpaceAndCiphertextSpace {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] arr = "1234567890".toCharArray();
        
        for (int i = 0; i < s.length(); i++) {
            char c = arr[Integer.parseInt("" + s.charAt(i))];
            System.out.print(c);
        }
    }
}
