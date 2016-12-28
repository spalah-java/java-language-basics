package ua.spalah.tips;


import ua.spalah.inheritance.animals.Dog;
import ua.spalah.inheritance.employees.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTips {

    public static void main(String[] args) {
        constructing();
        methods();
    }

    private static void constructing() {
        ArrayList<Employee> staff = new ArrayList<Employee>();
        Employee[] staffAsArray = new Employee[10];

        ArrayList<Employee> newStaff = new ArrayList<>(100);
    }

    private static void methods() {
        Dog dog1 = createDog("Roger", "Rottweiler");
        Dog dog2 = createDog("Bob", "Basset Hound");
        Dog dog3 = createDog("William", "Welsh Corgi");

        ArrayList<Dog> dogs = new ArrayList<>();

        System.out.println("Add ------");
        dogs.add(dog1);
        dogs.add(dog2);
        System.out.println("Size: " + dogs.size());
        System.out.println(dogs);

        System.out.println("Set ------");
        dogs.set(1, dog3);
        System.out.println("Size: " + dogs.size());
        System.out.println(dogs);

        System.out.println("Add with index ------");
        dogs.add(0, dog2);
        System.out.println("Size: " + dogs.size());
        System.out.println(dogs);

        System.out.println("Get ------");
        System.out.println(dogs.get(0));
        System.out.println(dogs.get(1));
        System.out.println(dogs.get(2));
//        System.out.println(dogs.get(3));

        System.out.println("Remove with index ------");
        dogs.remove(1);
        System.out.println("Size: " + dogs.size());
        System.out.println(dogs);

        System.out.println("Contains ------");
        System.out.println(dogs.contains(dog1));
        System.out.println(dogs.contains(dog2));
        System.out.println(dogs.contains(dog3));

        System.out.println("For each ------");
        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        toArray(dogs);
    }

    private static void toArray(ArrayList<Dog> dogs) {
        // toArray()
        Object[] objects = dogs.toArray();

//        Dog[] copyHere = new Dog[0];
//        Dog[] copyHere = new Dog[3];
        Dog[] copyHere = new Dog[dogs.size()];
        Dog[] dogsAsArray = dogs.toArray(copyHere);

        System.out.println(Arrays.toString(copyHere));
        System.out.println(Arrays.toString(dogsAsArray));
        System.out.println(copyHere == dogsAsArray);
    }

    private static Dog createDog(String name, String breed) {
        Dog dog = new Dog();
        dog.setName(name);
        dog.setBreed(breed);
        return dog;
    }
}
