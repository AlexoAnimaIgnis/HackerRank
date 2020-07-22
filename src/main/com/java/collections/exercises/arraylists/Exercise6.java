package main.com.java.collections.exercises.arraylists;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to remove the third element from a array list.
 */
public class Exercise6 {
    public static void main(String... args) {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("orange");
        colors.add("yellow");
        colors.add("green");
        colors.add("blue");

        System.out.println("Original List value:");
        colors.stream().forEach(s -> { System.out.println(s);});

        // remove the third element which is yellow
        String value = colors.remove(2);
        System.out.println("Removed element: " + value);
        System.out.println("Updated list:");
        colors.stream().forEach(s -> {System.out.println(s);});

    }
}
