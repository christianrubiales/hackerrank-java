package contests.rookierank;

import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        int c = 0;
        int max = 0;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            max = height[height_i] > max ? height[height_i] : max;
        }
        
        for (int i = 0; i < n; i++) {
            if (height[i] == max) {
                c++;
            }
        }
        System.out.println(c);
	}

}
