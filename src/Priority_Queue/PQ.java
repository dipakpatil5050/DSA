package Priority_Queue;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PQ {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

//        queue.offer(3.0);
//        queue.offer(2.5);
//        queue.offer(1.0);
//        queue.offer(4.3);

        queue.offer("A");
        queue.offer("C");
        queue.offer("B");
        queue.offer("D");

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
//        System.out.println(queue.poll());
    }


}
