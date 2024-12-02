package practice.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTestClass {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        System.out.println("Is list1 empty? "+list1.isEmpty());
        list1.add(35);
        list1.add(23);
        list1.add(67);
        list1.add(82);
        list1.add(56);
        list1.add(49);
         System.out.println("Is list1 empty? "+list1.isEmpty());
        System.out.println("The given list is:"+list1);
        //basicOperations(list1);
        // traversingCollection(list1);
        // bulkOperations(list1);
       // arrayOperationSample(list1);
    }
}
