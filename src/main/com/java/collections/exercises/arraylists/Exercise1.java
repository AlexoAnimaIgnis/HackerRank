package main.com.java.collections.exercises.arraylists;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to create a new array list, add some colors (string) and print out the collection
 */
public class Exercise1 {


    public static void main(String...  args) {

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");

        colors.forEach(s -> System.out.println(s));
    }
}
