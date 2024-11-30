package coding.test.codingteststart.greedy;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {

    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.add(5);
        queue.add(1);
        queue.add(7);
        queue.add(9);
        queue.add(3);

        while (!queue.isEmpty()){
            System.out.println("queue = " + queue.poll());
        }
    }
}
