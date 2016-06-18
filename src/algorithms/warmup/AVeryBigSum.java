package algorithms.warmup;

import java.util.Scanner;

public class AVeryBigSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long s = 0;
        for (int i = 0; i < n; i++) {
            s += in.nextLong();
        }
        System.out.println(s);
    }
}
