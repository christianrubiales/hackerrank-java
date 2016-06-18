package algorithms.implementation;

import java.util.Scanner;

public class FindDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.next();
        while (in.hasNext()) {
            String n = in.next();
            int ctr = 0, i = Integer.parseInt(n);
            int c;
            for (int j = 0; j < n.length(); j++) {
                c = n.charAt(j) - '0';
                if (c > 0 && i % c == 0) {
                    ctr++;
                }
            }
            System.out.println(ctr);
        }
    }
}
