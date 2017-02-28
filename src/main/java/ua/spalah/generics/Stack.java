package ua.spalah.generics;

import java.util.Collection;
import java.util.Random;

public class Stack<E> {

    public void push(E e) {};

    public void pushAll(Iterable<? extends E> src) {
        for (E e : src) push(e);
    }

    public E pop() {
        return null;
    }

    public void popAll(Collection<? super E> dst) {
        while (!isEmpty()) {
            dst.add(pop());
        }
    }

    public boolean isEmpty() {
        return new Random().nextBoolean();
    }
}
