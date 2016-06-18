package algorithms.warmup;

import java.util.Scanner;

public class SimpleArraySum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = 0;
        for (int i = 0; i < n; i++) {
            t += in.nextInt();
        }
        System.out.println(t);
    }
}
