package security.functions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecurityFunctionInverses {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, Integer> f = new HashMap<Integer, Integer>();
        Map<Integer, Integer> g = new HashMap<Integer, Integer>();
        
        for (int i = 1; i <= n; i++) {
            int x = in.nextInt();
            f.put(i, x);
            g.put(x, i);
        }
        
        for (int i = 1; i <= n; i++) {
            System.out.println(g.get(i));
        }
    }
}
