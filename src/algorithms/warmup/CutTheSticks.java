package algorithms.warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CutTheSticks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sticks = in.nextInt();
        
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < sticks; i++) {
        	list.add(in.nextInt());
        }
        
        List<Integer> toRemove;
        while (!list.isEmpty()) {
        	toRemove = new ArrayList<Integer>();
        	
            int smallest = Integer.MAX_VALUE;
            for (int i = 0; i < list.size(); i++) {
            	if (list.get(i) < smallest) {
            		smallest = list.get(i);
            	}
            }
        	
            for (int i = 0; i < list.size(); i++) {
            	list.set(i, list.get(i) - smallest);
            	if (list.get(i) == 0) {
            		toRemove.add(list.get(i));
            	}
            }
            System.out.println(list.size());
        	list.removeAll(toRemove);
        }
    }
}