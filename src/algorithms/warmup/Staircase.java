package algorithms.warmup;

import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(j < n - i - 1 ? ' ' : '#');
            }
            System.out.println();
        }
    }
}
