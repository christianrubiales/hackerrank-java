package security.functions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecurityInvolution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, Integer> f = new HashMap<Integer, Integer>();
        
        for (int i = 1; i <= n; i++) {
            f.put(i, in.nextInt());
        }
        
        boolean involution = true;
        for (int i = 1; i <= n; i++) {
            if (f.get(f.get(i)) != i) {
                involution = false;
                break;
            }
        }
        System.out.println(involution ? "YES" : "NO");
    }
}
