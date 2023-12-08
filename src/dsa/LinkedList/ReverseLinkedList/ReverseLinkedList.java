package dsa.LinkedList.ReverseLinkedList;

import dsa.LinkedList.Node;

public class ReverseLinkedList {
    public Node reverse(Node head) {
        Node current = head;
        Node prev = null;
        Node next = null;

        while (current != null) {
            next = current.next; // Save the next node
            current.next = prev; // Reverse the link
            prev = current;      // Move prev to the current node
            current = next;      // Move current to the next node
        }

        // Prev now points to the new head of the reversed list
        return prev;
    }
}
