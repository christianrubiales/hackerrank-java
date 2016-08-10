package contests.projectEuler;

import java.util.Scanner;

public class ProjectEuler001MultiplesOf3And5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        for (int i = 0; i < n; i++) {
            long x = in.nextLong() - 1;
            long s = 3*ap(x/3) + 5*ap(x/5) - 15*ap(x/15);
            System.out.println(s);
        }
    }
    
    public static long ap(long n) {
        return n*(n+1)/2;
    }
}
