package main.com.java.lambdas;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class RosterPerson {

    interface CheckPerson {
        boolean test(Person p);
    }

    class CheckPersonEligibleForSelectiveService implements CheckPerson {

        @Override
        public boolean test(Person p) {
            return p.gender == Person.Sex.MALE &&
                    p.getAge() >= 18 &&
                    p.getAge() <= 25;
        }
    }

    /**
     * search members that match one characteristics
     *
     * @param roster
     * @param age
     */
    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person person : roster) {
            if (person.getAge() >= age) {
                person.printPerson();
            }
        }
    }

    /**
     * generalized search methods
     *
     * @param roster
     * @param fromAge
     * @param toAge
     */
    public static void printPersonWithinAgeRange(List<Person> roster, int fromAge, int toAge) {
        for (Person p : roster) {
            if (fromAge <= p.getAge() && p.getAge() < toAge) {
                p.printPerson();
            }
        }
    }

    /**
     * search criteria in a local class
     *
     * @param roster
     * @param tester
     */
    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    /**
     * print person using PREDICATE INTERFACE
     *
     * @param roster
     * @param tester
     */
    public static void printPersonsWithPredicate(List<Person> roster, Predicate<Person> tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    /**
     * process roster using consumer block
     *
     * @param roster
     * @param tester
     * @param block
     */
    public static void processPersons(
            List<Person> roster,
            Predicate<Person> tester,
            Consumer<Person> block
    ) {
        for (Person p : roster) {
            if (tester.test(p)) {
                block.accept(p);
            }
        }
    }

    /**
     * use a functional interface that returns a value
     * @param roster
     * @param tester
     * @param mapper
     * @param block
     */
    public static void processPersonsWithFunction(
            List<Person> roster,
            Predicate<Person> tester,
            Function<Person, String> mapper,
            Consumer<String> block
    ) {
        for(Person p: roster) {
            if(tester.test(p)){
                String data = mapper.apply(p);
                block.accept(data);
            }
        }
    }

    /**
     * extensive use of GENERICS
     * @param source
     * @param tester
     * @param mapper
     * @param block
     * @param <X>
     * @param <Y>
     */
    public static <X, Y> void processElements(
            Iterable<X> source,
            Predicate<X> tester,
            Function<X, Y> mapper,
            Consumer<Y> block
    ){
        for(X p: source){
            if(tester.test(p)) {
                Y data = mapper.apply(p);
                block.accept(data);
            }
        }
    }

    public static void main(String... args) {

    }
}
