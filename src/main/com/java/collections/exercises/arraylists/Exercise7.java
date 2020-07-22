package main.com.java.collections.exercises.arraylists;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to search an element in a array list
 */
public class Exercise7 {
    public static void main(String... args) {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("orange");
        colors.add("yellow");
        colors.add("green");
        colors.add("blue");

        // look for yellow
        System.out.println(colors.contains("yellow") ? "Found" : "Not Found");

        // by using index
        System.out.println(colors.indexOf("green") != -1 ? "Found":"Not found");
    }
}
