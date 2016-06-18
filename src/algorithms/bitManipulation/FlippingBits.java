package algorithms.bitManipulation;

import java.util.Scanner;

public class FlippingBits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for (int i = 0; i < n; i++) {
            long x = in.nextLong();
            System.out.println(((long) Math.pow(2, 32)) - 1 - x);
        }
    }
}
