package security.terminologyConcepts;

import java.util.Scanner;

public class SecurityEncryptionScheme {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f = 1;
        
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        
        System.out.print(f);
    }
}
