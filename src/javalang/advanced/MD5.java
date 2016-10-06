package javalang.advanced;

import java.security.MessageDigest;
import java.util.Scanner;

public class MD5 {

	public static void main(String[] args) throws Exception {
	      Scanner in = new Scanner(System.in);

	      MessageDigest md = MessageDigest.getInstance("MD5");
	      md.update(in.nextLine().getBytes());
	      byte[] digest = md.digest();
	      System.out.println(String.format("%032x", new java.math.BigInteger(1, digest)));
	}

}
