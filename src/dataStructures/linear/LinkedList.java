/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructures.linear;

import sorting.application.MergeSortApplicationLinkedlistSort;
import util.LinkedListNode;
import util.PrintUtil;

/**
 *
 * @author sumit
 */
public class LinkedList {
    
    private LinkedListNode head;
    
    public LinkedList() {
        head = null;
    }
    
    public void push(int data) {
        if(head == null) {
            head = new LinkedListNode(data);
            
        } else {
            LinkedListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            
            LinkedListNode node = new LinkedListNode(data);
            temp.next = node;
        }
        
        //LinkedListNode tempNode = head;
        //PrintUtil.printLinkedList(tempNode, "LinkedList after push deletion");
    }
    
    public int delete(int num) {
        LinkedListNode tempNode = head, prevNode = null;
        
        PrintUtil.printLinkedList(tempNode, "LinkedList before deletion");
        
        tempNode = head;
        if (tempNode != null && tempNode.data == num) { 
            head = tempNode.next; // Changed head 
            PrintUtil.printLinkedList(tempNode.next, "LinkedList after deletion");
            return num; 
        } 
        
        
        while (tempNode != null  && num != tempNode.data) {
            prevNode = tempNode;
            tempNode = tempNode.next;
        }
        
        if (tempNode == null) {
            System.out.println(num + " Not present in the list");
            return -1;
            
        }
        
        prevNode.next = tempNode.next; 
        System.out.println(num + " is deleted from list");
        
        tempNode = head;
        PrintUtil.printLinkedList(tempNode, "LinkedList after deletion");
        
        return num;
    }
    
    public void createLinkedList(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            push(array[i]);
        }
        
        LinkedListNode tempNode = head;
        PrintUtil.printLinkedList(tempNode, "Created linkedlist");
    }
    
    public void sort() {
        LinkedListNode sortedHead = MergeSortApplicationLinkedlistSort.sortLinkedList(head);
        
    }
    
}
