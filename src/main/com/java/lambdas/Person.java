package main.com.java.lambdas;

import java.time.LocalDate;
import java.util.List;

public class Person {
    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emaiAddress;

    public int getAge() {
        return 0;
    }

    public void printPerson() {

    }
}
