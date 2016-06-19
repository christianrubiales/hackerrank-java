package dataStructures.stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MaximumElement {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        Deque<Integer> stack = new ArrayDeque<Integer>();
        Deque<Integer> max = new ArrayDeque<Integer>();
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            
            if (1 == t) {
                int x = in.nextInt();
                stack.push(x);
                if (max.isEmpty()) {
                    max.push(x);
                } else {
                    max.push(x > max.peek() ? x : max.peek());
                }
            } else if (2 == t) {
                stack.pop();
                max.pop();
            } else if (3 == t) {
                System.out.println(max.peek());
            }
        }
    }
}
