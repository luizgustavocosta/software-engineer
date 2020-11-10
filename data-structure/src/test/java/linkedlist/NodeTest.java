package linkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Linked List")
class NodeTest {

    @Test
    void insertElements() {
        Node<Integer> head = new Node<>(42);
        final Node<Integer> newNode = head.insert(head, 84);
        assertEquals(2, newNode.size());
    }

    @Test
    void removeOneElementWhenTheListHasOneElement() {
        Node<Integer> head = new Node<>(82);
        final Node<Integer> newLinkedList = head.remove(head);
        assertNull(newLinkedList, "Is expected a null reference");
    }

    @Test
    void removeOneElementWhenTheListHasNElements() {
        Node<Integer> head = new Node<>(3);
        Node<Integer> otherElement = new Node<>(head, 5);
        Node<Integer> another = new Node<>(otherElement,8);

        assertEquals(3, another.size());

        final Node<Integer> newLinkedList = another.remove(otherElement);
        assertEquals(2, newLinkedList.size());
    }

    @Test
    void findElement() {
        final String google = "Google";
        final String fcb = "Facebook";
        final String amz = "Amazon";
        final String apple = "Apple";

        Node<String> head = new Node<>(google);
        Node<String> facebook = new Node<>(head, fcb);
        Node<String> amazon = new Node<>(facebook, amz);
        Node<String> tail = new Node<>(amazon, apple);

        assertEquals(google, head.find(google).getData());
        assertEquals(amz, amazon.find(amz).getData());
        assertEquals(apple, tail.find(apple).getData());
    }

}