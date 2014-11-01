import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GameOfThronesI {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
       
        String ans = "YES";
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        
        char[] arr = inputString.toCharArray();
        Arrays.sort(arr);
        inputString = new String(arr);
        
        if (inputString.length() <= 1) {
        	ans = "NO";
        } else {//aaabbbb
        	boolean isEven = inputString.length()%2==0;
        	int singleChar = 0; 
        	char curr = inputString.charAt(0);
        	String substring = "" + curr;
        	for (int i = 1; i < inputString.length(); i++) {
        		if (curr != inputString.charAt(i)) {
        			if (substring.length()%2!=0) {
        				singleChar++;
        			}
        			curr = inputString.charAt(i);
        			substring = "" + curr;
        		} else {
        			substring += inputString.charAt(i);
        		}
        		if (isEven) {
        			if (singleChar > 0) {
	                    System.out.println("NO");
	                    return;
        			}
        		} else {
        			if (singleChar > 1) {
	                    System.out.println("NO");
	                    return;
        			}
        		}
        	}
        }
        
        System.out.println(ans);
        myScan.close();
    }
}
