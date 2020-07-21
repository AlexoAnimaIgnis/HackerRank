package main.com.java.collections.exercises.linkedlist;

import java.util.LinkedList;

/**
 * Write a Java program to insert the specified element at the specified position in the linked list
 */
public class Exercise5 {
    public static void main(String... args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("pink");
        colors.add("indigo");
        colors.add("violet");

        colors.stream().forEach(s -> {System.out.println(s);});
        colors.add(3, "fuschia pink");
        colors.stream().forEach(s -> {System.out.println(s);});

    }
}
