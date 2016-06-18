package security.functions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SecurityBijectiveFunctions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean bijective = true;
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if (set.contains(x)) {
                bijective = false;
                break;
            } else {
                set.add(x);
            }
        }
        System.out.println(bijective ? "YES" : "NO");
    }
}
