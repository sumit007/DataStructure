package main;


import dataStructures.linear.LinkedList;

public class Main {

    public static void main(String[] args) {
        //DemoSorting.demoSortingAlgos();
        
        //Demo Linked List
        int[] temp = {348, 232, 232, 323, 32, 233, 78};
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(temp);
        
        linkedList.delete(232);
        
        
    }
}

/*
Some key terms related to Sorting Algorithms

1. Stable Sort algorithm - A sorting algorithm is called stable if two objects with equal same key appears in same order in
sorted output as they are in unsorted output.
check @Link https://www.geeksforgeeks.org/stable-selection-sort/

2.
 */
