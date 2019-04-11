/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting.application;

import util.LinkedListNode;
import util.PrintUtil;

/**
 *
 * @author sumit
 */
public class MergeSortApplicationLinkedlistSort {
    
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
