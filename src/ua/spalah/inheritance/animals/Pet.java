package ua.spalah.inheritance.animals;


import ua.spalah.interfaces.LivingCreature;

public abstract class Pet implements LivingCreature, Comparable<Pet> {

    private String nick;
    private String breed;
    private int age;

    public abstract void pet();

    public void walk() {
        System.out.println("Walking a " + nick);
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return nick;
    }

    @Override
    public int compareTo(Pet o) {
        return nick != null ? nick.compareTo(o.nick) : -1;
    }
}
