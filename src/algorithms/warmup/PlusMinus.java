package algorithms.warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float t = in.nextFloat(), p = 0, n = 0, z = 0;
        while (in.hasNextFloat()) {
            float a = in.nextFloat();
            if (a > 0) p++;
            if (a < 0) n++;
            if (a == 0) z++;
        }
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(df.format(p/t));
        System.out.println(df.format(n/t));
        System.out.println(df.format(z/t));
    }
}
