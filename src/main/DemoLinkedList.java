/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dataStructures.linear.LinkedList;

/**
 *
 * @author sumit
 */
public class DemoLinkedList {
    public static void demoLinkedListCreateDeletePush() {
        int[] temp = {348, 232, 232, 323, 32, 233, 78};
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(temp);
        linkedList.delete(232);
    }
    
    public static void demoLinkedListSorting() {
        int[] temp = {64, 34, 25, 12, 22, 11, 90};
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(temp);
        
        linkedList.sort();
    }
}
