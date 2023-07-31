package list.task;

import list.CustomList;

import java.util.Iterator;

public class LinkedCustomList<T> implements CustomList<T> {

    private int size;
    private Node<T> first;
    private Node<T> head;

    private Node<T> getNodeByIndex(int index) {
        Node<T> node = first;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node;
    }

    @Override
    public CustomList<T> add(Object element) {
        /* Реализуй этот метод */
        Node<T> node = new Node(element);

        if (this.head == null) {
            this.head = node;
        } else {
            Node<T> previousNode = this.head;
            while (previousNode.getNext() != null) {
                previousNode = previousNode.getNext();
            }
            previousNode.setNext(node);
        }
        size++;
        return this;
    }

    @Override
    public CustomList<T> add(T element, int index) {
        if (index == 0) {
            first = new Node<>(element, first);
        } else {
            Node<T> prev = getNodeByIndex(index - 1);
            Node<T> getNextValue = new Node<>(element, prev.getNext());
            prev.setNext(new Node<>(element, getNextValue));
        }
        size++;
        return this;
    }

    @Override
    public T get(Integer index) {
        /* Реализуй этот метод */
        return getNodeByIndex(index).getElement();
    }

    @Override
    public CustomList<T> remove(Integer index) {
        /* Реализуй этот метод */
        if (index >= size || (index < 0)) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        Node<T> node = first;
        if (index == 0) {
            first = first.getNext();
        } else {
            Node<T> prev = getNodeByIndex(index - 1);
            node = prev.getNext();
            prev.setNext(node.getNext());
        }
        size--;
        return this;
    }

    @Override
    public CustomList<T> removeAll() {
        /* Реализуй этот метод */
        Node<T> getNode = null;
        this.size = 0;
        return this;
    }

    @Override
    public CustomList<T> addAll(CustomList<T> newCustomList) {
        /* Реализуй этот метод */
        //size = size + newCustomList.size();
        CustomList<T> newList = (CustomList<T>) new Object();
        int resultSize = size + newList.size();
        for (int index = size; index < resultSize; index++) {
            newList.add(newCustomList.get(index), size + 1);
            size++;
        }
        return newList;
    }

    @Override
    public int size() {
        /* Реализуй этот метод */
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        /* Реализуй этот метод */
        Iterator<T> iterator = new Iterator<>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size && getNodeByIndex(currentIndex) != null;
            }

            @Override
            public T next() {
                return (T) getNodeByIndex(currentIndex++);
            }
        };
        return iterator;
    }
}
