package ua.spalah.jdbc;

import ua.spalah.reflection.DbColumn;
import ua.spalah.reflection.DbTable;

@DbTable("barking_pet")
public class Dog {

    private long id;
    @DbColumn(columnName = "first_name", columnSize = 15)
    private String nick;
    private String breed;
    private Gender gender;
    @DbColumn(columnName = "вес")
    private double weight;

    public Dog() {
    }

    public Dog(long id) {
        this.id = id;
    }

    public Dog(long id, String nick, String breed, Gender gender, double weight) {
        this.id = id;
        this.nick = nick;
        this.breed = breed;
        this.gender = gender;
        this.weight = weight;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", nick='" + nick + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", weight=" + weight +
                '}';
    }
}
