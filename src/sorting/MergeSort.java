package sorting;

import util.LinkedListNode;
import util.PrintUtil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sumit
 */
public class MergeSort {
    /*
    Algorithmic paradigm - Divide and conqure
    Time complexity - O(nlogn) for both worst and best cases
    Space complexity - O(n)
    inPlace sorting - No
    Stable sort - Yes
    
    */
    
    private static void mergeSortedArray(int[] arrayToSort, int iStart, int iMid, int iEnd) {
        int sLeft = iMid - iStart + 1;
        int sRight = iEnd - iMid;
        
        int[] leftArray = new int[sLeft];
        int[] rightArray = new int[sRight];
        
        for (int i = 0; i < sLeft; ++i) {
            leftArray[i] = arrayToSort[iStart + i];
        }
        
        for (int j = 0; j < sRight; ++j) {
            rightArray[j] = arrayToSort[iMid + j + 1];
        }
        
        int i = 0, j = 0;
        int k = iStart;
        
        while (i < sLeft && j < sRight) {
            if(leftArray[i] < rightArray[j]) {
                arrayToSort[k] = leftArray[i];
                i++;
               
            } else {
                arrayToSort[k] = rightArray[j];
                j++;
            }
            k++;
        }
        
        while (i < sLeft) {
            arrayToSort[k] = leftArray[i];
            i++;
            k++;
        }
        
        while(j < sRight) {
            arrayToSort[k] = rightArray[j];
            j++;
            k++;
        }
        
    }
    
    private static void mergeSort(int[] arrayToSort, int iStart, int iEnd) {
        
       if(iStart < iEnd) {
           
           int iMid = (iStart + iEnd) / 2;
           
           mergeSort(arrayToSort, iStart, iMid);
           mergeSort(arrayToSort, iMid + 1, iEnd );
           
           mergeSortedArray(arrayToSort, iStart, iMid, iEnd);
       }
       
       
        
    }
    
    public static void sortUsingMergeSort(int[] arrayToSort) {
        PrintUtil.printArray(arrayToSort, "Un sorted array");
        
        mergeSort(arrayToSort, 0, arrayToSort.length-1);
        
        PrintUtil.printArray(arrayToSort, "Sorted array Merge Sort");
    }
    
    
    private static LinkedListNode getMidOfLinkedList(LinkedListNode head) {
        
        if(head == null) {
            return head;
        }
        
        LinkedListNode fastNode = head.next, slowNode = head;
        
        while (fastNode != null ) {
            fastNode = fastNode.next;
            if(fastNode != null) {
                slowNode = slowNode.next;
                fastNode = fastNode.next;
            }
            
        }
        
        return slowNode;
    }
    
    private static LinkedListNode mergeSortedLinkedList(LinkedListNode leftList, LinkedListNode rightList) {
        
        LinkedListNode result;
        
        if(leftList == null) {
            return rightList;
        }
        
        if(rightList == null) {
            return leftList;
        }
        
        if (leftList.data <= rightList.data) {
            result = leftList;
            result.next = mergeSortedLinkedList(leftList.next, rightList);
            
        } else {
            result = rightList;
            result.next = mergeSortedLinkedList(leftList, rightList.next);
        }
        
        return result;
    }
    
    private static LinkedListNode sortLinkedListUsingMergeSort(LinkedListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        
        LinkedListNode mid = getMidOfLinkedList(head);
        LinkedListNode nextToMid = mid.next;
        mid.next = null;
        
        LinkedListNode leftSorted = sortLinkedListUsingMergeSort(head);
        LinkedListNode rightSorted = sortLinkedListUsingMergeSort(nextToMid);
        
        LinkedListNode sortedList = mergeSortedLinkedList(leftSorted, rightSorted);
        
        return sortedList;
          
    }

    public static LinkedListNode sortLinkedList(LinkedListNode head) {
        
        LinkedListNode tempNode = head;
        PrintUtil.printLinkedList(tempNode, "Unsorted linkedlist");
        
         LinkedListNode sortedList = sortLinkedListUsingMergeSort(tempNode);
        
        PrintUtil.printLinkedList(sortedList, "Sorted linkedlist");
        
        return head;
    }
    
}
