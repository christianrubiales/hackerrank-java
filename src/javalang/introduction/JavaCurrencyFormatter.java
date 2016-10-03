package javalang.introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(us.format(payment));

        NumberFormat in = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        System.out.println(in.format(payment));
	}

}
