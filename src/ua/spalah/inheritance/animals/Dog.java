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

        return Objects.equals(getName(), that.getName())
                && Objects.equals(getBreed(), that.getBreed());
//        return getName().equals(that.getName())
//                && getBreed().equals(that.getBreed());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBreed());
    }

    @Override
    public String toString() {
        return "Dog [name = " + getName() + ", breed = " + getBreed() + "]";
    }
}
