package main.com.java.collections.exercises.arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Write a Java program of swap two elements in an array list.
 */
public class Exercise14 {
    public static void main(String... args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Collection before swap");
        numbers.stream().forEach( num -> {System.out.println(num);});

        /**
         * use collection
         */
        Collections.swap(numbers, 0,4);
        System.out.println("Collection after swap");
        numbers.stream().forEach( num -> {System.out.println(num);});
    }
}
