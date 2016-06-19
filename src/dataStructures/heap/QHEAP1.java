package dataStructures.heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class QHEAP1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        
        for (int i = 0; i < n; i++) {
            int q = in.nextInt();
            if (q == 1) {
                heap.offer(in.nextInt());
            } else if (q == 2) {
                heap.remove(in.nextInt());
            } else if (q == 3) {
                System.out.println(heap.peek());
            }
        }
    }
}
