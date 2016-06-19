package dataStructures.queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class TruckTour {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        Deque<Pump> pumps = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            pumps.addLast(new Pump(in.nextInt(), in.nextInt()));
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            int petrol = 0;
            boolean ok = true;
            for (Pump pump : pumps) {
                petrol += pump.amount;
                if (petrol < pump.distance) {
                    ok = false;
                    pumps.addLast(pumps.removeFirst());
                    index++;
                    break;
                } else {
                    petrol -= pump.distance;
                }
            }
            if (ok) {
                break;
            }
        }
        System.out.println(index);
    }
    
    public static class Pump {
        int amount;
        int distance;
        Pump(int amount, int distance) {
            this.amount = amount;
            this.distance = distance;
        }
    }
}
