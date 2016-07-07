package algorithms.implementation;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class EqualStacks {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        Deque<Integer> s1 = new ArrayDeque<>();
        for(int h1_i=0; h1_i < n1; h1_i++){
            s1.push(in.nextInt());
            sum1 += s1.peek();
        }
        Deque<Integer> s2 = new ArrayDeque<>();
        for(int h2_i=0; h2_i < n2; h2_i++){
            s2.push(in.nextInt());
            sum2 += s2.peek();
        }
        Deque<Integer> s3 = new ArrayDeque<>();
        for(int h3_i=0; h3_i < n3; h3_i++){
            s3.push(in.nextInt());
            sum3 += s3.peek();
        }
        
        while (!(sum1 == sum2 && sum2 == sum3 && sum1 == sum3)) {
            if ((sum1 >= sum2 && sum1 > sum3) || (sum1 > sum2 && sum1 >= sum3)) {
                sum1 -= s1.removeLast();
            } else if ((sum2 >= sum1 && sum2 > sum3) || (sum2 > sum1 && sum2 >= sum3)) {
                sum2 -= s2.removeLast();
            } else {
                sum3 -= s3.removeLast();
            }
        }
        System.out.println(sum1);
	}

}
