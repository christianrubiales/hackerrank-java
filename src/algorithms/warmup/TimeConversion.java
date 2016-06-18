package algorithms.warmup;

import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.nextLine();
        
        if (time.startsWith("12")) {
            if (time.endsWith("AM")) {
                System.out.println("00" + time.substring(2, 8));
            } else if (time.endsWith("PM")) {
                System.out.println("12" + time.substring(2, 8));
            }
            return;
        }
            
        if (time.charAt(8) == 'P') {
            int h = Integer.parseInt(time.substring(0, 2));
            h = (h + 12) % 24;
            time = (h < 10 ? "0" : "") + h + (time.substring(2, 8));
            System.out.println(time);
        } else {
            System.out.println(time.substring(0, 8));
        }
    }
}
