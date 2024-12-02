package practice.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTestClass {
    public static void main(String[] args) {
        //Creating HashSet object

       // HashSet<String> set = new HashSet<String>();
     //  Set<String> set = new HashSet<String>();
       // Set<String> set = new LinkedHashSet<>();
        Set<String> set = new TreeSet<>();
        //Adding elements to HashSet

        set.add("JAVA");

        set.add("JSP");

        set.add("STRUTS");

        set.add("HIBERNATE");

        set.add("JSP");

        set.add("JAVA");

        //Printing the elements of HashSet

        System.out.println(set);     //Output : [STRUTS, HIBERNATE, JSP, JAVA]
    }
}
