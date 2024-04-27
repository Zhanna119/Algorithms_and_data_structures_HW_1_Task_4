package org.example;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addNodeAtEnd(1);
        list.addNodeAtBeginning(2);
        list.addNodeAtPosition(3, 2);
        list.addNodeAtEnd(4);
        list.display();
        list.deleteNodeAtEnd();
        list.deleteNodeAtBeginning();
        list.deleteNodeAtPosition(2);
        list.display();
    }
}