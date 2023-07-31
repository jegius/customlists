package list.task;


public class Node<T> {
    private T element;
    private Node<T> next;
    private Node<T> prev;
    private T data;

    public Node(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node(T element, Node<T> next) {
        this.element = element;
        this.next = next;
    }

}