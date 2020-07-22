package main.com.java.collections.exercises.arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Write a Java program to sort a given array list
 */
public class Exercise8 {
    public static void main(String... args) {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("orange");
        colors.add("yellow");
        colors.add("green");
        colors.add("blue");

        System.out.println("Original order");
        colors.stream().forEach(s -> {System.out.println(s);});
        System.out.println("Sorted order");
        /**
         * using stream and aggregate
         */
        colors.stream().sorted().forEach(s -> {System.out.println(s);});
        /**
         * using collections.sort method
         */
        Collections.sort(colors);
        colors.stream().forEach(s -> { System.out.println(s);});


    }
}

