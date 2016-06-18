package algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger i = new BigInteger("" + n);
        for (int j = 1; j < n; j++) {
            i = i.multiply(new BigInteger("" + j));
        }
        System.out.println(i);
    }
}
