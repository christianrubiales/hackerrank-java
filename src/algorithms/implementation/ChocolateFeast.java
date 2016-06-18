package algorithms.implementation;

import java.util.Scanner;

public class ChocolateFeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();//6
            int C = in.nextInt();//2
            int M = in.nextInt();//2
            
            int bought = N/C;//6/2 = 3
            int eaten = bought;
            int wrappers = bought; // 3
            
            while (wrappers >= M) {
                wrappers -= M;
                eaten++;
                wrappers++;
            }
            
            
            System.out.println(eaten);
        }
    }
}
