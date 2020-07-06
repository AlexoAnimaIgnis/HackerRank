package main.com.java.lambdas;

import java.time.LocalDate;
import java.util.List;

public class Person {
    public enum Sex {
        MALE, FEMALE
    }

    interface CheckPerson {
        boolean test(Person p);
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

    /**
     * search members that match one characteristics
     * @param roster
     * @param age
     */
    public static void printPersonsOlderThan(List<Person> roster, int age){
        for(Person person: roster){
            if(person.getAge() >= age) {
                person.printPerson();
            }
        }
    }

    /**
     * generalized search methods
     * @param roster
     * @param fromAge
     * @param toAge
     */
    public static void printPersonWithinAgeRange(List<Person> roster, int fromAge, int toAge   ) {
        for(Person p: roster) {
            if(fromAge <= p.getAge() && p.getAge() < toAge) {
                p.printPerson();
            }
        }
    }

    public static void printPerons(List<Person> roster, CheckPerson tester) {

    }
}
