package dataStructures.queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class QueueUsingTwoStacks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        Deque<Integer> stack1 = new ArrayDeque<Integer>();
        Deque<Integer> stack2 = new ArrayDeque<Integer>();
        
        int q;
        while (n > 0) {
            n--;
            q = in.nextInt();
            
            if (q == 1) {
                stack1.push(in.nextInt());
            } else if (q == 2) {
                if (stack2.isEmpty()) {
                    while (!stack1.isEmpty()) {
                        stack2.push(stack1.pop());
                    }   
                }
                stack2.pop();
            } else {
                if (stack2.isEmpty()) {
                    while (!stack1.isEmpty()) {
                        stack2.push(stack1.pop());
                    }   
                }
                System.out.println(stack2.peek());
            }
        }
    }

}
