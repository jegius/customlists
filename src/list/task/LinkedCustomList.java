package list.task;

import list.CustomList;

import java.util.Iterator;

public class LinkedCustomList<T> implements CustomList<T> {

    private int size;
    Node<T> first;
    private Node head;

    private Node<T> node(int index) {
        Node<T> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    @Override
    public CustomList<T> add(Object element) {
        /* Реализуй этот метод */
        Node node = new Node(element);

        if (this.head == null) {
            this.head = node;
        } else {
            Node iterator = this.head;
            while (iterator.next != null) {
                iterator = iterator.next;
            }
            iterator.next = node;
        }
        size++;
        return this;
    }

    @Override
    public CustomList<T> add(T element, int index) {
        if (index == 0) {
            first = new Node<>(element, first);
        } else {
            Node<T> prev = node(index - 1);
            prev.next = new Node<>(element, prev.next);
        }
        size++;
        return this;
    }

    @Override
    public T get(Integer index) {
        /* Реализуй этот метод */
        return node(index).element;
    }

    @Override
    public CustomList<T> remove(Integer index) {
        /* Реализуй этот метод */
        Node<T> node = first;
        if (index == 0) {
            first = first.next;
        } else {
            Node<T> prev = node(index - 1);
            node = prev.next;
            prev.next = node.next;
        }
        size--;
        return this;
    }

    @Override
    public CustomList<T> removeAll() {
        /* Реализуй этот метод */
        size = 0;
        first = null;
        return this;
    }

    @Override
    public CustomList<T> addAll(CustomList<T> newCustomList) {
        /* Реализуй этот метод */
        int index = size;
        for (T o : newCustomList) {
            add(o, index);
            index++;
        }
        return this;
    }

    @Override
    public int size() {
        /* Реализуй этот метод */
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        /* Реализуй этот метод */
        return null;
    }
}
