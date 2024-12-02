package practice.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTestClass {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        //System.out.println("Is list1 empty? "+list1.isEmpty());
        list1.add(35);
        list1.add(23);
        list1.add(67);
        list1.add(82);
        list1.add(56);
        list1.add(49);
       // System.out.println("Is list1 empty? "+list1.isEmpty());
       // System.out.println("The given list is:"+list1);
       //basicOperations(list1);
      // traversingCollection(list1);
      // bulkOperations(list1);
       arrayOperationSample(list1);
    }
    public static void basicOperations(List<Integer> l1)
    {
       /* System.out.println("Is the given list empty? "+l1.isEmpty());
        System.out.println("The given list is :"+l1);
        System.out.println("Number of elements in the list: "+l1.size());
        //Adding one element
        l1.add(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is :"+l1);
        System.out.println("The number of elements in the list: "+l1.size());
        //Checking for an element
       System.out.println("Is 566 available in the list:"+l1.contains(566));*/
        System.out.println("The given list before removing elements is :"+l1);
       l1.remove(2);//Removing element by its index
        l1.remove(3);//Removing element by its index
        System.out.println("After removing elements:");
        System.out.println("The given list is :"+l1);
        System.out.println("The number of elements in the list: "+l1.size());
    }
    public static void traversingCollection(List<Integer> l1) {
        //Aggregate function
        System.out.println("The given list is :"+l1);
        System.out.println("Traversing with stream aggregate function:");
        l1.stream().filter(m -> m%2==0).
                forEach(m-> System.out.print(m+" "));
        System.out.println("\nTraversing with for-each construct:");
        for(Integer i:l1)
            System.out.print(i+" ");
        Iterator<Integer> iterator = l1.iterator();
        System.out.println("\nThe first element in the list is:"+iterator.next());
        System.out.println("\n\nTraversing with iterator:");
        while(iterator.hasNext())
            System.out.print(iterator.next()+" ");
    }

    public static void bulkOperations(List<Integer> l1)
    {
        addAllSample(l1);
      // removeAllSample(l1);
       // containsAllSample(l1);
       //retainsAllSample(l1);
        clearSample(l1);
    }
    public static void addAllSample(List<Integer> l1)
    {
        List<Integer> l2 = new ArrayList<>();
        l2.add(135);
        l2.add(223);
        l2.add(267);
        l2.add(482);
        System.out.println("\nReceived list:"+l1);
        System.out.println("\nList to be added:"+l2);
        l1.addAll(l2);
        System.out.println("\nReceived list after adding another list:"+l1);
    }
    public static void removeAllSample(List<Integer> l1)
    {
        List<Integer> l2 = new ArrayList<>();
        l2.add(35);
        l2.add(223);
        l2.add(267);
        l2.add(782);
        System.out.println("\nReceived list:"+l1);
        System.out.println("\nList to be removed:"+l2);
        l1.removeAll(l2);
        System.out.println("\nReceived list after removing another list:"+l1);
    }
    public static void retainsAllSample(List<Integer> l1)
    {
        List<Integer> l2 = new ArrayList<>();
        l2.add(35);
        l2.add(213);
        l2.add(267);
        l2.add(812);
        System.out.println("\nList to be retained:"+l2);
        System.out.println("\nReceived list before retaining another list:"+l1);
        l1.retainAll(l2);
        System.out.println("\nReceived list after retaining another list:"+l1);
    }

    public static void containsAllSample(List<Integer> l1)
    {
        List<Integer> l2 = new ArrayList<>();
        l2.add(35);
        l2.add(223);
        l2.add(667);
        l2.add(582);
        System.out.println("\nReceived list:"+l1);
        System.out.println("\nList to be checked:"+l2);
        System.out.println("\nReceived list contains all the elements of another list?"+l1.containsAll(l2));
    }

    public static void clearSample(List<Integer> l1)
    {
        System.out.println("\nReceived list:"+l1);
        System.out.println("Is the given list empty? "+l1.isEmpty());
        l1.clear();
        System.out.println("Is the given list empty? "+l1.isEmpty());
    }
    public static void arrayOperationSample(List<Integer> l1)
    {
        Integer[] intArray = new Integer[l1.size()];
        l1.toArray(intArray);
        System.out.println("From Integer array:");
        for (int a : intArray)
        {
            System.out.print(a+" ");
        }
    }
}
