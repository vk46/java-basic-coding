package com.vk.problem;

import com.vk.model.Node;

public class ReverseLinkedList {

    Node head;

    static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.push(20);
        list.push(40);
        list.push(60);
        list.push(80);

        System.out.println("Original Linked list: ");
        list.printList();

        list.head = reverse(list.head);

        System.out.println("Reversed Linked list: ");
        list.printList();
    }
}
