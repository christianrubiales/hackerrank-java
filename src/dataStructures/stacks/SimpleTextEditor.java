package dataStructures.stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SimpleTextEditor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        
        Deque<String> stack = new ArrayDeque<>();
        String s = "";
        stack.push(s);
        for (int i = 0; i < q; i++) {
            int c = in.nextInt();
            
            if (c == 1) {
                s += in.next();
                stack.push(s);
            } else if (c == 2) {
                s = s.substring(0, s.length() - in.nextInt());
                stack.push(s);
            } else if (c == 3) {
                System.out.println(s.charAt(in.nextInt() - 1));
            } else if (c == 4) {
                stack.pop();
                s = stack.peek();
            }
        }
    }
}
