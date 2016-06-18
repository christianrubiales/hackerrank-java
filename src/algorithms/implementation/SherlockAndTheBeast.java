package algorithms.implementation;

import java.util.Scanner;

public class SherlockAndTheBeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        for (int k = 0; k < T; k++) {
            int N = in.nextInt();
            
            int i3 = 0;
            int i5 = 0;
            /*if (N % 3 == 0) {
                if (N % 5 == 0) {
                    while ((N - 5) % 3 == 0) {
                        i5++;
                        N -= 5;
                    }
                    i3 = N/3;
                } else {
                    i3 = N/3;
                }
            } else if (N % 5 == 0) {
                i5 = N/5;
            }*/
            
            /*
            int i = N;
            while (i > 0) {
                if ((i - 3) % 3 == 0 || (i - 3) % 5 == 0) {
                    i3++;
                    i -= 3;
                } else if ((i - 5) % 3 == 0 || (i - 5) % 5 == 0) {
                    i5++;
                    i -= 5;
                } else {
                    i3 = 0;
                    i5 = 0;
                    break;
                }
            }
            */
            /*
            if (N % 3 == 0) {
                i3 = N/3;
            } else if (N % 5 == 0) {
                i5 = N/5;
            } else {
                for (int i = N; i > -2; i--) {
                    if (i == -1) {
                        break;
                    }
                    if ((N - i) % 5 == 0 && (i % 3 == 0)) {
                        i3 = i/3;
                        i5 = (N-i)/5;
                        break;
                    }
                }
            }
            */
            
            /*if (i3+i5 > 0) {
                for (int j = 0; j < i3; j++) {
                    System.out.print("555");
                }
                for (int j = 0; j < i5; j++) {
                    System.out.print("33333");
                }
                System.out.println();
            } else {
                System.out.println(-1);
            }*/
            
            i3 = N;
            i5 = N;

            while (i5 % 3 != 0) {
                i5 -= 5;
            }
            
            if (i5 > -1) {
                for (int j = 0; j < i5; j++) {
                    System.out.print("5");
                }
                for (int j = 0; j < i3 - i5; j++) {
                    System.out.print("3");
                }
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
