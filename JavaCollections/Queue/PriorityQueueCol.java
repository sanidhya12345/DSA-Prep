package JavaCollections.Queue;

import java.util.*;
public class PriorityQueueCol {
    public static void main(String[] args) {
        //Unlike normal queues, priority queue elements are retrieved in sorted order.

        /*
            It is important to note that the elements of a priority queue may not be sorted. However, 
            elements are always retrieved in sorted order.
         */
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        pq.add(4);
        pq.add(1);
        pq.add(9);
        pq.add(5);

        System.out.println(pq);

        
    }
}
