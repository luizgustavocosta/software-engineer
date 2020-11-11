package linkedlist;

import java.util.Objects;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class Node<T> {

    private Node<T> next;
    private T data;

    public Node(Node<T> head, T data) {
        this.next = head;
        this.data = data;
    }

    public Node(T data) {
        this(null, data);
    }

    public Node<T> insert(Node<T> head, T data) {
        return new Node<>(head, data);
    }

    public int size() {
        int size = 1;
        Node<T> head = this;
        while (nonNull(head.next)) {
            head = head.next;
            size++;
        }
        return size;
    }

    public Node<T> remove(Node<T> target) {
        Objects.requireNonNull(target, "The target cannot be null");
        Node<T> head = this;
        while (head == target) {
            // Looking for the next head in case the target be the head
            head = head.next;
        }

        if (isNull(head)) {
            // In this case the target is the head :(
            return null;
        }
        Node<T> current = head;
        while (nonNull(current.next)) {
            if (current.next == target) {
                // Break the link between elements
                current.next = current.next.next;
            }
            current = current.next;
        }
        return head;
    }

    public Node<T> find(T value) {
        Node<T> cursor = this;
        while (!cursor.data.equals(value)) {
            cursor = cursor.next;
        }
        return cursor;
    }

    public static <T> Node<T> circularInsert(Node<T> head, T data) {
        Node<T> insertion = new Node<>(data);
        if (isNull(head)) {
            insertion.next = insertion; // Circular
            return insertion;
        }
        if (head.next == null) {
            head.next = insertion;
            insertion.next = head;
            return insertion;
        }
        insertion.data = head.data; // Swap
        head.data = data;
        insertion.next = head.next;
        head.next = insertion;
        return head;
    }

    public Node<T> next() {
        return this.next;
    }

    public T getData() {
        return data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return data.equals(node.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}
