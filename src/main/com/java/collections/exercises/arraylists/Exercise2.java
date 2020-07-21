package main.com.java.collections.exercises.arraylists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Write a Java program to iterate through all elements in a array list
 */
public class Exercise2 {

    public static void main(String... args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");

        Iterator iterator = colors.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
