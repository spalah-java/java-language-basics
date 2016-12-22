package ua.spalah.inheritance.animals;


public class Dog extends Pet {

    @Override
    public void pet() {
        System.out.println("Coooooool!");
    }

    public void bark() {
        System.out.println("bark");
    }
}
