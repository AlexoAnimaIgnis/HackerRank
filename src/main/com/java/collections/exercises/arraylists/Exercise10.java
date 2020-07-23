package main.com.java.collections.exercises.arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Write a Java program to shuffle elements in a array list
 */
public class Exercise10 {
    public static void main(String... args) {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("orange");
        colors.add("yellow");
        colors.add("green");
        colors.add("blue");

        System.out.println("Original List:");
        colors.stream().forEach(s -> {System.out.println(s);});


        System.out.println("After Shuffle List:");
        Collections.shuffle(colors);
        colors.stream().forEach( s -> { System.out.println(s);});

    }
}
