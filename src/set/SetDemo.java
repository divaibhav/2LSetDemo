/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 24-Nov-20
 *  Time: 4:09 PM
 */
package set;

import javax.print.DocFlavor;
import java.util.*;

/**
 * Creating a set which can hold integer objects
 * and will implement some methods of HashSet class
 */
public class SetDemo {
    public static void main(String[] args) {
        //creating a set
        Set<Integer> set = new HashSet<>();//capacity = 16 & load factor = 0.75
        //adding some elements in set
        System.out.println(set.add(10));
        System.out.println(set.add(15));
        System.out.println(set.add(151));
        System.out.println(set.add(87));
        System.out.println(set.add(53));
        //adding a duplicate value
        System.out.println(set.add(10));

        //printing set
        System.out.println(set);

        //traverse each
        //by using for each
        // sum of all elements of set
        int sum = 0;
        System.out.println("for each loop");
        for(Integer element: set){
            sum = sum + element;
            System.out.print(element +", ");
        }
        System.out.println();
        System.out.println("sum = " + sum);

        //traversing by iterator
        System.out.println("by using iterator");
        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + ",");
        }
        System.out.println();

        //creating an ArrayList
        List<Integer> list = new ArrayList<>();
        // initializing list with random values
        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random() * 100));
        }
        System.out.println(list);
        //addling all the elements of list to set
        set.addAll(list);
        System.out.println(set);
        System.out.println(set.size());

        //removing an element
        System.out.println(set.remove(1234));
        System.out.println(set.remove(87));

        System.out.println(set);

    }
}
