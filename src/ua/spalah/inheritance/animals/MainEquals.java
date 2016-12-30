package ua.spalah.inheritance.animals;

public class MainEquals {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setNick("Laaaaabr");
        dog.setBreed("labrador");

        System.out.println("" + dog);

        Dog tuzik = dog;

        Dog tuzikFromDb = new Dog();
        tuzikFromDb.setNick("Laaaaabr");
        tuzikFromDb.setBreed("labrador");

        Dog sharik = new Dog();
        sharik.setNick("sharik");
        sharik.setBreed("labrador");

        System.out.println(dog == tuzik);
        System.out.println(dog.equals(tuzik));

        System.out.println(dog == tuzikFromDb);
        System.out.println(dog.equals(tuzikFromDb));

        System.out.println(dog == sharik);
        System.out.println(dog.equals(sharik));
    }
}
