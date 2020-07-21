package main.com.java.collections.exercises.arraylists;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given array list.
 */
public class Exercise4 {
    public static void main(String... args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Indigo");
        colors.add("Violet");

        System.out.println("Element at index 0: " + colors.get(0));
        System.out.println("Element at index 6: " + colors.get(6));
        System.out.println("Element at index 4: " + colors.get(4));

    }
}
