package contests.rookierank;

import java.util.Scanner;

public class CountingValleys {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        int e = 0;
        int v = 0;
        for (int i = 0; i < n; i++) {
            e += s.charAt(i) == 'U' ? 1 : -1;
            if (i > 0 && e == 0 && s.charAt(i) == 'U') {
                v++;
            }
        }
        System.out.println(v);
	}

}
