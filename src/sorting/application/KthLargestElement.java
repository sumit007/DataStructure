/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting.application;

import dataStructures.tree.heap.MaxHeap;
import dataStructures.tree.heap.MinHeap;

/**
 *
 * @author sumit
 */
public class KthLargestElement {
    
    /**
     * Using Quick sort partition algorithm
     * best case o(n)
     * worst case o(n*n)
     * 
    */
    
    private static void KthLargestUsingQuickSelect(int[] array) {
        
    }
    
    /**
     * Using Max Heap
     */
    private static void KthLargestUsingMaxHeap(int[] array, int k) {
        MaxHeap maxHeap = MaxHeap.initialiseHeap(array);
        int kThLarhest;
        for(int i = 0; i < k - 1; i++) {
            maxHeap.extractMax();
        }
        
        kThLarhest = maxHeap.extractMax();
        System.out.println("Kth Largest number is: " + kThLarhest);
        
    }
    
    /**
     * Using Min Heap
     */
    private static void KthLargestUsingMinHeap(int[] array, int k) {
        int[] arr = new int[k];
        
        System.arraycopy(array, 0, arr, 0, k);
        
        MinHeap minHeap = MinHeap.initialiseHeap(arr);
        
        for (int i = k; i < array.length; i++) {
            if(array[i] >= minHeap.getMinInHeap()) {
                minHeap.replaceMinInHeap(array[i]);
            }
        }
        
        System.out.println("Kth Largest number is: " + minHeap.getMinInHeap());
        
    }
    
    public static void testKthLargestElement() {
        int arr[] = {12, 3, 5, 7, 19}; 
        int k = 4; 
        
        //KthLargestUsingMaxHeap(arr, k);
        KthLargestUsingMinHeap(arr, k);
    }
    
}
