package warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numTests = in.nextInt();
        
        int height;
        int cycles;
        for (int i = 0; i < numTests; i++) {
        	height = 1;
        	cycles = in.nextInt();
            for (int j = 0; j < cycles; j++) {
	        	if (j % 2 == 0) {
	        		height *= 2;
	        	} else {
	        		height += 1;
	        	}
            }
            System.out.println(height);
        }
    }
}