package ua.spalah.inheritance.animals;


import java.util.Objects;

public class Dog extends Pet {

    @Override
    public void pet() {
        System.out.println("Stroking a dog!");
    }

    public void bark() {
        System.out.println("bark");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Dog)) return false;
        Dog that = (Dog) obj;

        return Objects.equals(getNick(), that.getNick())
                && Objects.equals(getBreed(), that.getBreed());
//        return getNick().equals(that.getNick())
//                && getBreed().equals(that.getBreed());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNick(), getBreed());
    }

    @Override
    public String toString() {
        return "Dog [name = " + getNick() + ", breed = " + getBreed() + "]";
    }
}
