package ua.spalah.inheritance.animals;

public class MainPolymorphism {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setName("Laaaaabr");
        dog.setBreed("Labrador");


        Cat tulip = new Cat();
        tulip.setName("tulip");
        tulip.setBreed("British");

        dog.bark();
        tulip.meow();

        Pet[] pets = {dog, tulip};

        petAndWalk(pets);
    }

    public static void petAndWalk(Pet[] pets) {
        for (Pet pet : pets) {
            pet.pet();
            pet.walk();
        }
    }
}
