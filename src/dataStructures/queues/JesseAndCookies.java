package dataStructures.queues;

import java.util.PriorityQueue;
import java.util.Scanner;

public class JesseAndCookies {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            queue.offer(in.nextInt());
        }
        int t = 0;
        for (int i = 0; i < n; i++) {
            if (queue.peek() >= k) {
                break;
            }
            if (queue.size() < 2) {
                t = -1;
                break;
            }
            int a = queue.poll();
            int b = queue.poll();
            queue.offer(a+2*b);
            t++;
        }
        System.out.println(t);
    }
}
