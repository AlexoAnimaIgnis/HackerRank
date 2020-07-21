package main.com.java.collections.exercises.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Write a Java program to iterate a linked list in reverse order
 */
public class Exercise4 {
    public static void main(String... args) {

        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("pink");
        colors.add("indigo");
        colors.add("violet");

        Iterator<String> iterator = colors.descendingIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
