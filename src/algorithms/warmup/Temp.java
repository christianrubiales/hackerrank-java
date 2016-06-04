package algorithms.warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Temp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();

        String string = process(in.next());
        String[] others = new String[tests - 1];
        for (int i = 0; i < others.length; i++) {
        	others[i] = process(in.next());
        }
        
        int u=0;
        for (int i = 0; i < string.length(); i++) {
            int t=0;
            for (int j = 0; j < others.length; j++) {
            	String temp = others[j];
            	if (temp.contains(""+string.charAt(i))) {
            		t++;
            	}
            }
            if (t == tests - 1) {
            	u++;
            }
        }
        System.out.println(u);
    }
    
    public static String process(String string) {
        // put string chars to set
        Set<Character> set = new TreeSet<Character>();
        for (int i = 0; i < string.toCharArray().length; i++) {
        	set.add(string.charAt(i));
        }
        // transfer from set to list to string
        string = "";
        List<Character> list = new ArrayList<Character>();
        list.addAll(set);
        for (int i = 0; i < list.size(); i++) {
        	string += list.get(i);
        }
        return string;
    }
}