package main.com.java.collections.exercises.arraylists;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to insert an element into the array list at the first position
 */
public class Exercise3 {

    public static void main(String... args) {
        List<String> colors = new ArrayList<>();
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Indigo");
        colors.add("Violet");

        colors.forEach( s-> {System.out.println(s);});
        colors.add(0, "Red");
        colors.forEach( s-> {System.out.println(s);});
    }
}
