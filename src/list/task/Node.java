package list.task;


public class Node<T> {
    T element;
    Node<T> next;
    private Node prev;
    private T data;

    public Node(T element) {
        this.element = element;
    }

    public Node(T element, Node<T> next) {
        this.element = element;
        this.next = next;
    }

}