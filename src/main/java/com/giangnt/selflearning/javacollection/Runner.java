package com.giangnt.selflearning.javacollection;

import com.giangnt.selflearning.javacollection.singlylinkedlist.Node;
import com.giangnt.selflearning.javacollection.singlylinkedlist.SinglyLinkedList;

public class Runner {
    public static void main(String[] args) {

        int[] listData = {1, 3, 5, 7, 9, 10, 13, 15};
        Node head = new Node(listData[0]);

        for (int count = 1; count < listData.length; count++) {
            SinglyLinkedList.prepareList(head, listData[count]);
        }

        System.out.printf("1. Initial singly linked list is : ");
        SinglyLinkedList.print(head);

        int newInt = 6;
        Node newNode = new Node(newInt);
        head = SinglyLinkedList.insert(head, newNode);
        System.out.printf("2. Singly linked list after inserting %d is : ", newInt);
        SinglyLinkedList.print(head);

        SinglyLinkedList.removeTail(head);
        System.out.printf("3. Singly linked list after removing tail node is : ");
        SinglyLinkedList.print(head);

        int compareVal = 6;
        SinglyLinkedList.removeIfGreaterThan(compareVal, head);
        System.out.printf("4. Singly linked list after removing nodes greater than %d is : ", compareVal);
        SinglyLinkedList.print(head);
    }
}
