package main.com.java.collections.exercises.arraylists;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to extract a portion of a array list
 */
public class Exercise12 {
    public static void main(String... args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("Original list: ");
        numbers.stream().forEach(i->{System.out.println(i);});

        System.out.println("Extracted List");
        List<Integer> extractedNumber = numbers.subList(0, 2);
        extractedNumber.stream().forEach(integer -> {System.out.println(integer);});

    }
}
