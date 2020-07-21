package main.com.java.collections.exercises.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Write a Java program to iterate through all elements in a linked list starting at the specified position
 */
public class Exercise3 {
    public static void main(String... args) {
        List<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("pink");
        colors.add("indigo");
        colors.add("violet");

        Iterator<String> iterator = colors.listIterator(2);
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
