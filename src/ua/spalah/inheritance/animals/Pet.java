package ua.spalah.inheritance.animals;


public abstract class Pet {

    private String name;
    private String breed;

    public abstract void pet();

    public void walk() {
        System.out.println("Walking a " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
