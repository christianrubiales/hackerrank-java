package algorithms.strings;

import java.util.Arrays;
import java.util.Scanner;

public class MakeItAnagram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] a = in.nextLine().toCharArray();
        char[] b = in.nextLine().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        
        int i = 0;
        int j = 0;
        int common = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                common += 2;
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println(a.length + b.length - common);
    }

}
