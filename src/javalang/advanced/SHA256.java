package javalang.advanced;

import java.security.MessageDigest;
import java.util.Scanner;

public class SHA256 {

	public static void main(String[] args) throws Exception {
	      Scanner in = new Scanner(System.in);

	      MessageDigest md = MessageDigest.getInstance("SHA-256");
	      md.update(in.nextLine().getBytes());
	      byte[] digest = md.digest();
	      System.out.println(String.format("%064x", new java.math.BigInteger(1, digest)));
	}

}
