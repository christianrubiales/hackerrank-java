package contests.rookierank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AntiprimeNumbers {

	public static void main(String[] args) throws IOException {
		int[] m1 = new int[]{1,2,4,6,12,24,36,48,60,120,180,240,360,720,840};
		int[] m2 = new int[]{1260,1680,2520,5040,7560};
		int[] m3 = new int[]{10080,15120,20160,25200,27720,45360,50400,55440,83160};
		int[] m4 = new int[]{110880,166320,221760,277200,332640,498960,554400,665280,720720};
		int[] m5 = new int[]{1081080,1441440,2162160,2882880,3603600,4324320,6486480,7207200,8648640,10810800};

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine();
		int q = Integer.parseInt(line);
		
		StringBuilder sb = new StringBuilder();
		int a = 0;
		for (int j = 0; j < q; j++) {
			line = in.readLine();
			a = Integer.parseInt(line);
			if (a <= 840) {
				for (int i = 0; i < m1.length; i++) {
					if (m1[i] >= a) {
						sb.append(m1[i]).append('\n');
						break;
					}
				}
			} else if (a <= 7560) {
				for (int i = 0; i < m2.length; i++) {
					if (m2[i] >= a) {
						sb.append(m2[i]).append('\n');
						break;
					}
				}
			} else if (a <= 83160) {
				for (int i = 0; i < m3.length; i++) {
					if (m3[i] >= a) {
						sb.append(m3[i]).append('\n');
						break;
					}
				}
			} else if (a <= 720720) {
				for (int i = 0; i < m4.length; i++) {
					if (m4[i] >= a) {
						sb.append(m4[i]).append('\n');
						break;
					}
				}
			} else {
				for (int i = 0; i < m5.length; i++) {
					if (m5[i] >= a) {
						sb.append(m5[i]).append('\n');
						break;
					}
				}
			}
		}
		System.out.println(sb.toString());
	}
}
