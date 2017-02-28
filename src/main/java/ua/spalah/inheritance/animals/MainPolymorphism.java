package ua.spalah.inheritance.animals;

public class MainPolymorphism {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setNick("Laaaaabr");
        dog.setBreed("Labrador");


        Cat tulip = new Cat();
        tulip.setNick("tulip");
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
