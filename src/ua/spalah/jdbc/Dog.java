package ua.spalah.jdbc;

public class Dog {

    private long id;
    private String nick;
    private String breed;
    private Gender gender;
    private double weight;

    public Dog(long id, String nick, String breed, Gender gender, double weight) {
        this.id = id;
        this.nick = nick;
        this.breed = breed;
        this.gender = gender;
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
