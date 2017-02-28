package ua.spalah.oop.simple;

/**
 * @author Kostiantyn Huliaiev
 */
public class Dog {
    private String name;
    private String breed;
    private int age;
    private boolean isAlive = true;

    {
        breed = "breeeeeeed";
    }

    public Dog() {
    }

    public Dog(String name, String breed, int age) {
        this(breed, age);
        this.age = age;
    }

    public Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    public Dog(String name, String breed, int age, boolean isAlive) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.isAlive = isAlive;
    }

    public void bark() {
        System.out.println("I'm a dog named " + name + " and I'm barking");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.equals("")) {
            this.name = name;
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
