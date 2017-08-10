package com.giangnt.selflearning.javacollection;

import com.giangnt.selflearning.javacollection.singlylinkedlist.Node;
import com.giangnt.selflearning.javacollection.singlylinkedlist.SinglyLinkedListApp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {

        int[] listData = { 1, 3, 5, 9 };
        Node head = new Node(listData[0]);

        for (int count = 1; count < listData.length; count++) {
            SinglyLinkedListApp.prepareList(head, listData[count]);
        }

        System.out.printf("1. Single linked list is : ");
        SinglyLinkedListApp.print(head);

        int newData = 4;
        Node newNode = new Node(newData);
        head = SinglyLinkedListApp.insert(head, newNode);
        System.out.printf("2. Single linked list after inserting %d is : ", newData);
        SinglyLinkedListApp.print(head);

        newData = 7;
        newNode = new Node(newData);
        head = SinglyLinkedListApp.insert(head, newNode);
        System.out.printf("3. Single linked list after inserting %d is : ", newData);
        SinglyLinkedListApp.print(head);
    }
}
