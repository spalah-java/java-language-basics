package ua.spalah.inheritance.animals;


public class Cat extends Pet {

    @Override
    public void walk() {
        System.out.println(getName() + " doesn't want to go outside");
    }

    @Override
    public void pet() {
        System.out.println("Cat gets stroked");
    }

    public void meow() {
        System.out.println("meow");
    }
}
