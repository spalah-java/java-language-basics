package ua.spalah.collections;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import ua.spalah.oop.Worker;

public class CollectionsMain {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Ann");
        strings.add("Lisa");
        strings.add("Bob");

        for (String s : strings) {
            System.out.println(s);
        }

        strings.remove("Lisa");
        strings.remove(0);
        System.out.println(strings);

        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            integers.add(i);
        }
        System.out.println(integers);

//        integers.remove(5);
        integers.remove((Integer) 5);
        System.out.println(integers);



        Set<String> names = new HashSet<>();
        names.add("Ann");
        names.add("Ann");
        names.add("Ann");
        names.add("Ann");
        names.add("Lisa");
        names.add("Bob");
        System.out.println(names);

        TreeSet<Worker> dogs = new TreeSet<>(new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        dogs.add(new Worker("Two"));
        dogs.add(new Worker("One"));
        dogs.add(new Worker("Three"));
        dogs.add(new Worker("Four"));
        dogs.add(new Worker("Five"));
        dogs.add(new Worker("Five"));

        for (Worker dog : dogs) {
            System.out.println(dog.getName());
        }
    }
}
