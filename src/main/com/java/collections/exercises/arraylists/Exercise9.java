package main.com.java.collections.exercises.arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Write a Java program to copy one array list into another
 */
public class Exercise9 {

    public static void main(String... args) {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("orange");
        colors.add("yellow");
        colors.add("green");
        colors.add("blue");

        List<String> colors_2 = new ArrayList<>();
        colors_2.add("indigo");
        colors_2.add("pink");

        System.out.println("Original list:");
        colors.stream().forEach(s-> {System.out.println(s);});

        System.out.println("After copying: ");
        /**
         * this method replaces the elements
         */
        Collections.copy(colors, colors_2);

        /**
         * this code just ADDS the elements at the end of the list
         * colors.addAll(colors_2);
         */
        colors.stream().forEach(s-> {System.out.println(s);});
    }
}

