package ua.spalah.java8.interfaces;

public interface SomeInterface {

    int x2(int i);

    default int x4(int i){
        return x2(x2(i));
    };
}
