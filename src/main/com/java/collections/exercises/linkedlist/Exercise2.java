package main.com.java.collections.exercises.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Write a Java program to iterate through all elements in a linked list
 */
public class Exercise2 {
    public static void main(String... args) {
        List<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("orange");
        colors.add("yellow");
        colors.add("green");

        /**
         * using iterator
         */
        Iterator<String> iterator = colors.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /**
         * using aggregate construct
         */
        colors.stream().forEach(s -> {System.out.println(s);});

        /**
         * using for loop
         */
        for(String s: colors) {
            System.out.println(s);
        }

    }
}
