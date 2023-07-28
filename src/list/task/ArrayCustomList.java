package list.task;

import list.CustomList;

import java.util.Iterator;

public class ArrayCustomList<T> implements CustomList<T> {
    private final int START_SIZE = 10;
    private int size;
    private T[] myArray = (T[]) new Object[START_SIZE];

    @Override
    public CustomList<T> add(T element) {
        /* Реализуй этот метод */
        if (size == myArray.length) {
            T[] newArray = (T[]) new Object[myArray.length * 2];
            System.arraycopy(myArray, 0, newArray, 0, size);
            myArray = newArray;
        }
        myArray[size++] = element;
        return this;
    }

    @Override
    public CustomList<T> add(T element, int index) {
        return null;
    }

    @Override
    public T get(Integer index) {
        /* Реализуй этот метод */
        return null;
    }

    @Override
    public CustomList<T> remove(Integer index) {
        /* Реализуй этот метод */
        return null;
    }

    @Override
    public CustomList<T> removeAll() {
        /* Реализуй этот метод */
        return null;
    }

    @Override
    public CustomList<T> addAll(CustomList<T> newCustomList) {
        /* Реализуй этот метод */
        return null;
    }

    @Override
    public int size() {
        /* Реализуй этот метод */
        return 0;
    }

    @Override
    public Iterator<T> iterator() {
        /* Реализуй этот метод */
        return null;
    }
}
