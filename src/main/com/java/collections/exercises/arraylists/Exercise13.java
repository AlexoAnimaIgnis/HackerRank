package main.com.java.collections.exercises.arraylists;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to compare two array lists
 * **print YES OR NO IF ELEMENT of array 2 exists on another array1
 */
public class Exercise13 {
    public static void main(String... args) {
        List<Integer> numbers_1 = new ArrayList<>();
        numbers_1.add(1);
        numbers_1.add(2);
        numbers_1.add(3);

        List<Integer> numbers_2 = new ArrayList<>();
        numbers_2.add(3);
        numbers_2.add(4);

        System.out.println("Print YES OR NO IF ELEMENT of array 2 exists on another array1");
        numbers_2.stream().forEach( integer -> {
            if(numbers_1.contains(integer)) {
                System.out.println("YES!");
            } else {
                System.out.println("NO");
            }
        });

    }
}
