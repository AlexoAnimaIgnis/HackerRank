package main.com.java.collections.exercises.arraylists;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to update specific array element by given element
 */
public class Exercises5 {
    public static void main(String... args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("MAGENTA PINK");
        colors.add("Blue");
        colors.add("Indigo");
        colors.add("Violet");

        // initial list
        colors.forEach(s -> { System.out.println(s);} );

        colors.set(3, "Green");

        // updated list
        System.out.println("Updated list");
        colors.forEach(s -> { System.out.println(s);});

    }
}
