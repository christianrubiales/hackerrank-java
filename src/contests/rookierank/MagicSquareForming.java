package contests.rookierank;

import java.util.Scanner;

public class MagicSquareForming {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < 9; i++) {
        	sb.append(in.nextInt());
        }
        String s = sb.toString();
        
        String[] m = new String[]{"816357492","618753294","438951276","276951438","294753618","492357816","672159834","834159672"};

        int min = Integer.MAX_VALUE;
        for (String x : m) {
        	min = Math.min(min,check(s, x));
        }
        
        System.out.println(min);
	}
	
	private static int check(String s, String x) {
		int cost = 0;
		
		for (int i = 0; i < s.length(); i++) {
			cost += Math.abs(s.charAt(i) - x.charAt(i));
		}
		
		return cost;
	}
}
