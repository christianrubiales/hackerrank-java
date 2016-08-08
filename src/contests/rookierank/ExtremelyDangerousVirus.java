package contests.rookierank;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtremelyDangerousVirus {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        BigInteger bi = new BigInteger(String.valueOf((a+b)/2));
        bi = bi.modPow(new BigInteger(in.next()), new BigInteger("1000000007"));
        
        System.out.println(bi.toString());
	}

}
