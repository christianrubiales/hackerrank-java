package contests.zalando;

import java.util.LinkedList;
import java.util.Scanner;

public class GiveMeTheOrder {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int N = in.nextInt();
    	
    	LinkedList<Integer> list = new LinkedList<Integer>();
    	for (int i = 0; i < N; i++) {
    		list.add(in.nextInt());
    	}

    	LinkedList<Integer> temp = new LinkedList<Integer>();
    	int M = in.nextInt();
    	for (int i = 0; i < M; i++) {
        	int L = in.nextInt();
        	int R = in.nextInt();
        	
        	temp.clear();
        	for (int j = L - 1; j < R; j++) {
        		temp.add(list.remove((int) L - 1));
        	}
        	
        	for (int j = 0; j < temp.size(); j++) {
        		list.add(j,temp.get(j));
        	}
//        	System.err.println(list);
    	}

    	System.out.print(list.get(0));
    	for (int j = 1; j < list.size(); j++) {
        	System.out.print(" " + list.get(j));
    	}
    	System.out.println();
    }
}
