package algorithms.dynamicProgramming;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger A = new BigInteger("" + in.nextLong());
        BigInteger B = new BigInteger("" + in.nextLong());
        int N = in.nextInt();
        
        BigInteger T = null;
        for (int i = 3; i <= N; i++) {
            T = new BigInteger(B.multiply(B).add(A).toString());
            A = B;
            B = T;
        }
        System.out.println(T);
    }
}
