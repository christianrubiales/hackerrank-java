package security.terminologyConcepts;

import java.util.Scanner;

public class SecurityKeySpaces {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String m = in.next();
        int e = in.nextInt();
        char[] arr = "0123456789".toCharArray();
        
        for (Character c : m.toCharArray()) {
            int i = Integer.parseInt("" + c);
            System.out.print(arr[(i + e) % 10]);
        }
    }
}
