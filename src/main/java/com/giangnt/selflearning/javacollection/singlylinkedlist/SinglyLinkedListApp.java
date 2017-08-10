package com.giangnt.selflearning.javacollection.singlylinkedlist;
/**
 * Created by giangnguyen on 2017-08-10.
 */
public class SinglyLinkedListApp {
    public static Node insert(Node head, Node newNode) {

        // first node to be inserted
        if (null == head) {
            return newNode;
        }

        Node prev = null;
        Node iter = head;

        while (iter != null && iter.data < newNode.data) {
            // take backup of prev node
            // used in appending the new node
            prev = iter;
            iter = iter.next;
        }

        newNode.next = prev.next;
        prev.next = newNode;
        return head;
    }

    public static void prepareList(Node head, int data) {

        while (head.next != null){
            head = head.next;
            System.out.printf("head = "+ head.data);
        }
        head.next = new Node(data);
    }

    public static void print(Node head) {

        while (head != null) {
            System.out.printf("%d ", head.data);
            head = head.next;
        }
        System.out.println("");
    }
}

