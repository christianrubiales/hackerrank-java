package algorithms.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ModifiedKaprekarNumbers {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int q = in.nextInt();
        List<Long> list = new ArrayList<>();
        
        for (long i = p; i <= q; i++) {
            long s = i*i;
            if (s < 10) {
            	if (i == 1) {
            		list.add(i);
            	}
            } else {
                String x = String.valueOf(s);
                if (Long.parseLong(x.substring(0, x.length() / 2)) 
                    + Long.parseLong(x.substring(x.length() / 2)) == i) {
                    list.add(i);
                }
            }
        }
        
        if (list.isEmpty()) {
            System.out.println("INVALID RANGE");
        } else {
            for (long i : list) {
                System.out.print(i + " ");
            }
        }
	}

}
