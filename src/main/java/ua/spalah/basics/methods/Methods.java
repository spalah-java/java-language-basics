package ua.spalah.basics.methods;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Kostiantyn Huliaiev
 */
public class Methods {

    public static String[] people = {"Andy", "Mike", "Leonard", "Anna", "Julia"};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findPeople()));
        System.out.println(Arrays.toString(findPeople(true)));

        String[] women = findPeople(false);
        System.out.println(Arrays.toString(women));

        String name = findFirstWithNameStarts("J");
        System.out.println(name);
    }

    public static String[] findPeople() {
        return people;
    }

    public static String[] findPeople(boolean isMale) {
        ArrayList<String> requiredPeople = new ArrayList<>();
        for (String person : people) {
            if (isMale && isMale(person)) {
                requiredPeople.add(person);
            }
            if (!isMale && !isMale(person)) {
                requiredPeople.add(person);
            }
        }
//        if (isMale) {
//            for (String person : people) {
//                if (!person.endsWith("a")) {
//                    requiredPeople.add(person);
//                }
//            }
//        } else {
//            for (String person : people) {
//                if (person.endsWith("a")) {
//                    requiredPeople.add(person);
//                }
//            }
//        }
        return requiredPeople.toArray(new String[0]);
    }

    private static boolean isMale(String person) {
        return !person.endsWith("a");
    }

    public static String findFirstWithNameStarts(String prefix) {
        for (String person : people) {
            if (person.startsWith(prefix)) {
                return person;
            }
        }
        System.out.println("No people with this prefix: " + prefix + " foun");
        return "defaul";
    }

    public static String findFirstWithNameStartsVar(String prefix) {
        String result = "defaul";
        for (String person : people) {
            if (person.startsWith(prefix)) {
                result = person;
            }
        }
        System.out.println("No people with this prefix: " + prefix + " foun");
        return result;
    }
}
