package ua.spalah.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        List<Person> people = getPeople();

        Set<Person> peopleFromDniproOldWay = getPeopleFromDniproOldWay(people);
        System.out.println(peopleFromDniproOldWay);

        Set<Person> peopleFromDnipro = getPeopleFromDnipro(people);
        System.out.println(peopleFromDnipro);

        long countPeopleInCityOldWay = countPeopleInCityOldWay(people, City.LVIV);
        System.out.println(countPeopleInCityOldWay);

        long countPeopleInCity = countPeopleInCity(people, City.LVIV);
        System.out.println(countPeopleInCity);

        List<String> emailsOldWay = computeEmailsOldWay(people);
        System.out.println(emailsOldWay);

        List<String> emails = computeEmails(people);
        System.out.println(emails);

        List<Person> sortedPeople = sort(people);
        sortedPeople.forEach(System.out::println);

        Map<City, Set<Person>> groupedByCity = groupByCity(people);
        System.out.println(groupedByCity);

        long totalSalaty = getTotalSalary(people);
        System.out.println(totalSalaty);
    }

    private static long getTotalSalary(List<Person> people) {
        return people.stream().mapToInt(Person::getSalary).sum();
    }

    private static Map<City, Set<Person>> groupByCity(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(Person::getCity, Collectors.toSet()));

    }

    private static List<Person> sort(List<Person> people) {
        return people.stream()
                .sorted(Comparator.comparing(Person::getCity).thenComparing(Person::getName))
                .collect(Collectors.toList());
    }

    private static List<String> computeEmails(List<Person> people) {
        return people.stream()
                .map(person -> person.getName() + "@" + person.getCity() + ".com")
                .collect(Collectors.toList());
    }

    private static List<String> computeEmailsOldWay(List<Person> people) {
        ArrayList<String> result = new ArrayList<>();
        for (Person person : people) {
            result.add(person.getName() + "@" + person.getCity() + ".com");
        }
        return result;
    }

    private static long countPeopleInCity(List<Person> people, City city) {
        return people.stream()
                .filter(p -> p.getCity() == city)
                .count();
    }

    private static long countPeopleInCityOldWay(List<Person> people, City city) {
        long count = 0;
        for (Person person : people) {
            if (person.getCity() == city) {
                count++;
            }
        }
        return count;
    }

    private static Set<Person> getPeopleFromDnipro(List<Person> people) {
        return people.stream()
                .filter(person -> person.getCity() == City.DNIPRO)
                .collect(Collectors.toSet());
    }

    private static Set<Person> getPeopleFromDniproOldWay(List<Person> people) {
        Set<Person> result = new HashSet<>();
        for (Person person : people) {
            if (person.getCity() == City.DNIPRO) {
                result.add(person);
            }
        }
        return result;
    }

    private static List<Person> getPeople() {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Nick", 500, City.KYIV));
        people.add(new Person("Mike", 1500, City.DNIPRO));
        people.add(new Person("Ann", 565, City.ODESSA));
        people.add(new Person("Kate", 4000, City.LVIV));
        people.add(new Person("Kyrylo", 4752, City.KHARKIV));
        people.add(new Person("Boris", 1235, City.DNIPRO));
        people.add(new Person("Julia", 1522, City.LVIV));
        people.add(new Person("Alexandra", 1822, City.LVIV));
        people.add(new Person("Mila", 2500, City.KYIV));
        return people;
    }
}
