package algorithms.implementation;

import java.util.Scanner;

public class LibraryFine {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt(), m1 = in.nextInt(), y1 = in.nextInt();
        int d2 = in.nextInt(), m2 = in.nextInt(), y2 = in.nextInt();
        int t1 = (y1*365) + (m1*31) + d1;
        int t2 = (y2*365) + (m2*31) + d2;
        
        if (y1 == y2) {
            if (m1 == m2) {
                if (d1 <= d2) {
                    System.out.println(0);
                } else {
                    System.out.println((d1 - d2) * 15);
                }
            } else if (m1 < m2) {
                System.out.println(0); 
            } else {
                System.out.println((m1 - m2) * 500);
            }
        } else if (y1 < y2) {
            System.out.println(0);
        } else {
            System.out.println(10000);
        }
    }
}
