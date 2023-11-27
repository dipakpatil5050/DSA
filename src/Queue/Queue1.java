package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {

        // queue is an interface So we can not instantiate interface : that's why we are taking LinkedList
        Queue<String> queue = new LinkedList<String>();

//        .offer() =  use to add element into queue at last

        queue.offer("Dipak");
        queue.offer("Pratik");
        queue.offer("Pranav");
        queue.offer("Pankaj");
        queue.offer("Sumit");


        System.out.println(queue.contains("Dipak"));

//        System.out.println(queue.peek()); // gives or return the first element from the queue
//        queue.poll(); // to remove from queue



        System.out.println(queue);


    }
}
