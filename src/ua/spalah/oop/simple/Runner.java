package ua.spalah.oop.simple;

import ua.spalah.oop.privatemethods.Worker;

/**
 * @author Kostiantyn Huliaiev
 */
public class Runner {

    public static void main(String[] args) {
        Dog puppy = new Dog("tuzik", "home dog", 15);

        Dog dogFromTheStreet = new Dog("street dog", 25);

        dogFromTheStreet.setName("sharik");
        dogFromTheStreet.setName("");

        String homelessDogName = dogFromTheStreet.getName();
        System.out.println(homelessDogName);

        puppy.bark();
        dogFromTheStreet.bark();

        Dog emptyDog = new Dog();
        System.out.println(emptyDog);


        Worker kostya = new Worker("Kostya", 1990, 10, 10);
        kostya.introduce();
    }
}
