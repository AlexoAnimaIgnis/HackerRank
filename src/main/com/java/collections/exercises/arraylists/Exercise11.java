package main.com.java.collections.exercises.arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Write a Java program to reverse elements in a array list
 */
public class Exercise11 {
    public static void main(String... args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Original List:");
        numbers.stream().forEach( i -> { System.out.println(i); });

        System.out.println("Reversed List:");
        Collections.reverse(numbers);
        numbers.stream().forEach(i->{System.out.println(i);});

    }
}
