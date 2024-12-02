package practice.collections.queue;


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueComparisonTestClass {
    public static void main(String[] args) {
        // Step 1: Create a PriorityQueue and a LinkedList
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        Queue<Integer> linkedList = new LinkedList<>();

        // Step 2: Add elements to the PriorityQueue
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(15);
        priorityQueue.add(55);

        // Step 3: Add elements to the LinkedList
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(15);
        linkedList.add(55);

        // Step 4: Peek the head of each queue
        System.out.println("Head of PriorityQueue: " + priorityQueue.peek());
        System.out.println("Head of LinkedList: " + linkedList.peek());

        // Step 5: Remove the head of each queue
        priorityQueue.remove();
        linkedList.remove();

        // Step 6: Print the queues after removal
        System.out.println("PriorityQueue after removal: " + priorityQueue);
        System.out.println("LinkedList after removal: " + linkedList);
    }

}
