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

    class CheckPersonEligibleForSelectiveService implements CheckPerson {

        @Override
        public boolean test(Person p) {
            return p.gender == Sex.MALE &&
                    p.getAge() >= 18 &&
                    p.getAge() <= 25;
        }
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

    /**
     * search criteria in a local class
     * @param roster
     * @param tester
     */
    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for(Person p: roster) {
            if(tester.test(p)) {
                p.printPerson();
            }
        }
    }
}
