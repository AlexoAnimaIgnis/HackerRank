package main.com.java.collections.exercises.linkedlist;

import java.util.LinkedList;
import java.util.List;

/**
 * Write a Java program to append the specified element to the end of a linked list.
 */
public class Exercise1 {
    public static void main(String... args) {
        List<String> color = new LinkedList<>();
        color.add("red");
        color.add("yellow");

        color.forEach(s -> { System.out.println(s);});
        color.add("orange");
        color.forEach(s -> {System.out.println(s);});
    }
}
