package algorithms.implementation;

import java.util.Scanner;

public class AngryProfessor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            
            int c = 0;
            for (int j = 0; j < a; j++) {
                if (in.nextInt() <= 0) {
                    c++;
                }
            }
            System.out.println(c >= b ? "NO" : "YES");
        }
    }
}
