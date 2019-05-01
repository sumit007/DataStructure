package main;


import dataStructures.linear.LinkedList;
import dataStructures.linear.array.InversionCount;
import dataStructures.tree.heap.MaxHeap;
import dataStructures.tree.heap.MinHeap;
import sorting.HeapSort;
import sorting.application.MergeSortInversionCount;

public class Main {

    public static void main(String[] args) {
        //DemoSorting.demoSortingAlgos();
        
        //Demo Linked List
        //DemoLinkedList.demoLinkedListCreateDeletePush();
        
        //DemoLinkedList.demoLinkedListSorting();
        
        //InversionCount.countInversion();
        //MergeSortInversionCount.printInversionCount();
        
        //DemoSorting.demoQuickSort();
        //int[] temp8 = {64, 34, 25, 12, 22, 11, 90};
        //MaxHeap.initialiseHeap(temp8);
        
        //HeapSort.demoHeapSort();
        
        int[] temp8 = {64, 34, 25, 12, 22, 11, 90};
        MinHeap.initialiseHeap(temp8);
        
    }
}

/*
Some key terms related to Sorting Algorithms

1. Stable Sort algorithm - A sorting algorithm is called stable if two objects with equal same key appears in same order in
sorted output as they are in unsorted output.
check @Link https://www.geeksforgeeks.org/stable-selection-sort/

2.
 */
