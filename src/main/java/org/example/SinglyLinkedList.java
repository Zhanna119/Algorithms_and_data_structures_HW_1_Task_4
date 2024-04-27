package org.example;

class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    private ListNode head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void addNodeAtBeginning(int data) {
        ListNode newNode = new ListNode(data);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
    }

    public void addNodeAtPosition(int data, int position) {
        if (position <= 0) {
            System.out.println("Invalid position.");
            return;
        }

        ListNode newNode = new ListNode(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        ListNode current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void addNodeAtEnd(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void deleteNodeAtBeginning() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete from beginning.");
            return;
        }
        head = head.next;
    }

    public void deleteNodeAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        if (position <= 0) {
            System.out.println("Invalid position.");
            return;
        }

        if (position == 1) {
            head = head.next;
            return;
        }

        ListNode current = head;
        ListNode prev = null;
        int count = 1;

        while (current != null && count != position) {
            prev = current;
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        prev.next = current.next;
    }

    public void deleteNodeAtEnd() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete from end.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        ListNode current = head;
        ListNode prev = null;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }

        prev.next = null;
    }

    public boolean search(int data) {
        ListNode current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

