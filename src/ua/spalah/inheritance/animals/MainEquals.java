package ua.spalah.inheritance.animals;

public class MainEquals {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Laaaaabr");
        dog.setBreed("labrador");

        System.out.println("" + dog);

        Dog tuzik = dog;

        Dog tuzikFromDb = new Dog();
        tuzikFromDb.setName("Laaaaabr");
        tuzikFromDb.setBreed("labrador");

        Dog sharik = new Dog();
        sharik.setName("sharik");
        sharik.setBreed("labrador");

        System.out.println(dog == tuzik);
        System.out.println(dog.equals(tuzik));

        System.out.println(dog == tuzikFromDb);
        System.out.println(dog.equals(tuzikFromDb));

        System.out.println(dog == sharik);
        System.out.println(dog.equals(sharik));
    }
}
