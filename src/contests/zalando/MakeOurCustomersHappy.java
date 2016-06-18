package contests.zalando;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakeOurCustomersHappy {
	
	static int WA;
	static int WB;
	static int WC;
	static int happy;
	static int A;
	static int B;
	static int C;
	static int AB;
	static int AC;
	static int BC;
	static int ABC;

	private static void WBBC(int BC) {
		if (WB >= BC) {
    		if (WC >= BC) {
    			WB -= BC;
    			WC -= BC;
    			happy += BC;
    		} else {
    			WB -= WC;
    			happy += WC;
    			WC = 0;
    		}
    	} else { // WB < BC
    		if (WC >= BC) {
    			BC -= WB;
	    		WC -= WB;
	    		happy += WB;
    			WB = 0;
    		} else {
    			happy += WB;
    			WB = 0;
    			WC = 0;
    		}
    	}
	}

	private static void WAAC(int AC) {
		if (WA >= AC) {
    		if (WC >= AC) {
    			WA -= AC;
    			WC -= AC;
    			happy += AC;
    		} else {
    			WA -= WC;
    			happy += WC;
    			WC = 0;
    		}
    	} else { // WA < AC
    		if (WC >= AC) {
    			AC -= WA;
	    		WC -= WA;
	    		happy += WA;
	    		WA = 0;
    		} else {
    			happy += WA;
    			WA = 0;
    			WC = 0;
    		}
    	}
	}

	private static void WAAB(int AB) {
		if (WA >= AB) {
    		if (WB >= AB) {
    			WA -= AB;
    			WB -= AB;
    			happy += AB;
    		} else {
    			WA -= WB;
    			happy += WB;
    			WB = 0;
    		}
    	} else { // WA < AB
    		if (WB >= AB) {
	    		AB -= WA;
	    		WB -= WA;
	    		happy += WA;
	    		WA = 0;
    		} else {
    			happy += WA;
    			WA = 0;
    			WB = 0;
    		}
    	}
	}

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	WA = in.nextInt();
    	WB = in.nextInt();
    	WC = in.nextInt();
    	int M = in.nextInt();
    	in.nextLine();

    	Map<String, Integer> map = new HashMap<String, Integer>();
    	for (int i = 0; i < M; i++) {
    		char[] t = in.nextLine().replace(",", "").toCharArray();
    		Arrays.sort(t);
    		String s = new String(t);
    		Integer c = map.get(s);
    		if (c == null) {
    			c = 0;
    		}
    		map.put(s, ++c);
    	}
    	A = map.containsKey("A") ? map.get("A") : 0;
    	B = map.containsKey("B") ? map.get("B") : 0;
    	C = map.containsKey("C") ? map.get("C") : 0;
    	AB = map.containsKey("AB") ? map.get("AB") : 0;
    	AC = map.containsKey("AC") ? map.get("AC") : 0;
    	BC = map.containsKey("BC") ? map.get("BC") : 0;
    	ABC = map.containsKey("ABC") ? map.get("ABC") : 0;
    	
    	happy = 0;
    	
    	// singles first
    	happy += WA > A ? A : WA;
    	WA -= WA > A  ? A : WA;
    	happy += WB > B ? B : WB;
    	WB -= WB > B  ? B : WB;
    	happy += WC > C ? C : WC;
    	WB -= WC > C  ? C : WC;
    	
    	// doubles
    	if (WA > WB) {
    		if (WA > WC) {
    			if (WB > WC) { // A > B > C
    		    	WAAB(AB);
    		    	WBBC(BC);
    		    	WAAC(AC);
    			} else { // A > C > B
    		    	WAAB(AB);
    		    	WAAC(AC);
    		    	WBBC(BC);
    			}
    		} else { // C > A > B
		    	WAAC(AC);
		    	WBBC(BC);
		    	WAAB(AB);
    		}
    	} else if (WB > WC) {
    		if (WA > WC) { // B > A > C
		    	WAAB(AB);
		    	WBBC(BC);
		    	WAAC(AC);
    		} else { // B > C > A
		    	WBBC(BC);
		    	WAAB(AB);
		    	WAAC(AC);
    		}
    	}
    	
    	int[] temp = new int[] {WA, WB, WC, ABC};
    	Arrays.sort(temp);
    	happy += temp[0];
    	
    	System.out.println(happy);
    }
}
