package JavaCollections.Queue;

//Queue is an interface so we cannot directly implement it.

import java.util.*;
public class QueueLL {
    public static void main(String[] args) {
        
        Queue<Integer> queue=new LinkedList<>();

        //Inserting an element in queue.

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        //peek method is used to return the head of the queue.

        int head=queue.peek();
        System.out.println(head);

        //poll method is used to return and remove the element from the queue.

        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
