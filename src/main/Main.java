package main;


import dataStructures.linear.LinkedList;
import dataStructures.linear.array.oned.InversionCount;
import dataStructures.linear.array.oned.LargestContiguousSumArray;
import dataStructures.linear.array.twod.MagicSquare;
import dataStructures.tree.heap.MaxHeap;
import dataStructures.tree.heap.MinHeap;
import searching.BinarySearch;
import searching.PivotedBinarySearch;
import sorting.CountingSort;
import sorting.HeapSort;
import sorting.application.CheckSortedAndRotatedArray;
import sorting.application.KthLargestElement;
import sorting.application.MergeSortInversionCount;
import sorting.application.SortAnArrayOfO1And2;
import sorting.application.SortNearlySortedArray;
import sorting.application.SortingRotatedArray;

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
        //HeapSort.demoMinHeapSort();
        
        //KthLargestElement.testKthLargestElement();
        
        //CountingSort.demoCountingSort();
        
        //SortNearlySortedArray.testSortNearlySortedArray();
        //SortAnArrayOfO1And2.testSortArrayOf01and2();
        
        //BinarySearch.demoBinarySearch();
        
        //PivotedBinarySearch.demoPivotedSearch();
       // SortingRotatedArray.demoSortingRotatedArray();
        //int[] temp8 = {64, 34, 25, 12, 22, 11, 90};
        //MinHeap.initialiseHeap(temp8);
        
        //CheckSortedAndRotatedArray.demoCheckSortedRotatedArray();
        
        //MagicSquare.generateAllMagicSquare(3);
        
        LargestContiguousSumArray.demoLargestContiguousSumArray();
        
    }
}

/*
Some key terms related to Sorting Algorithms

1. Stable Sort algorithm - A sorting algorithm is called stable if two objects with equal same key appears in same order in
sorted output as they are in unsorted output.
check @Link https://www.geeksforgeeks.org/stable-selection-sort/

2.
 */
