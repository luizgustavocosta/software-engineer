package linkedlist;

import java.util.Objects;

import static java.util.Objects.nonNull;

public class Node<T> {

    Node<T> next;
    T data;

    public Node(Node head, T data) {
        this.next = head;
        this.data = data;
    }

    public Node(T data) {
        this(null, data);
    }

    public Node<T> insert(Node head, T data) {
        return new Node(head, data);
    }

    public static<T> int size(Node<T> head) {
        Objects.requireNonNull(head);
        int size = 1;
        Node<T> current = head;
        while (nonNull(current.next)) {
            current = current.next;
            size++;
        }
        return size;
    }
}
