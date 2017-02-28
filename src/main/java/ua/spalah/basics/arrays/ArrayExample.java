package ua.spalah.basics.arrays;

public class ArrayExample {

    public static void main(String[] args) {
        // объявление и инициализация
        int[] array;

        array = new int[1000];
        int[] array1 = new int[8];
        int[] array2 = new int[]{1, 2, 3, 4};
        int[] array3 = {11, 22, 33, 44};

        // размер массива
        int size = array3.length;

        // доступ к элементу массива по индексу
        int zeroElement = array2[0];


        String[] strings = {"one", "2", "three", "four"};
    }
}
