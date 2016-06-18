package algorithms.implementation;

import java.util.Scanner;

public class SherlockAndSquares {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
        
            int j = ((int) Math.sqrt(a));
            int k = ((int) Math.sqrt(b));
            
            int squares = 0;
            for (int x = j; x <= k; x++) {
                int s = x*x;
                if (s >= a && s <= b) {
                    squares++;
                }
            }
            
            System.out.println(squares);
        }
    }
}
