package algorithms.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangrams {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line;
        while (in.hasNextLine()) {
            line = in.nextLine().toLowerCase();
            Set<Character> set = new HashSet<Character>();
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) != ' ') {
                    set.add(line.charAt(i));
                }
            }
            System.out.println(set.size() == 26 ? "pangram" : "not pangram");
        }
    }
}
