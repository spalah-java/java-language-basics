package ua.spalah.basics;

/**
 * @author Konstantin
 */
public class JavaGroup {
    public static final int AVERAGE_GROUP_SIZE = 10;

    protected final String name;
    private int size;

    public JavaGroup(String name, int size) {
        this.name = name;
        this.size = size;
        System.out.print(this.name + " ");
        checkSize();
    }

    public String getName() {
        return this.name;
    }

    public void addStudent() {
        size++;
    }

    private void checkSize() {
        if (size > AVERAGE_GROUP_SIZE) {
            System.out.println("Large group");
        } else if (size < AVERAGE_GROUP_SIZE) {
            System.out.println("Small group");
        } else {
            System.out.println("Average group");
        }
    }

    public static void main(String[] args) {
        new JavaGroup("spalah-java-15/16", 8);
        new JavaGroup("spalah-java-16/17", 14);
        new JavaGroup("spalah-java-17/18", 10);
    }
}
