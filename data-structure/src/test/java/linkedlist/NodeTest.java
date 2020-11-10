package linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void insertElements() {
        Node<Integer> head = new Node<Integer>(42);
        final Node<Integer> newNode = head.insert(head, 84);

        assertEquals(2, Node.size(newNode));
    }

}