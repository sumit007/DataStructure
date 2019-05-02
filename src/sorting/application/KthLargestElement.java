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
    
    private static int partitionQuickSelect(int[] array, int l, int r) {
        int pivot = array[r];
        
        int i = l - 1;
        
        for (int j = l; j < r; j++) {
            if (array[l] <= pivot) {
                i++;
                
                int temp =  array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        
        int temp = array[i+1];
        array[i+1] = array[r];
        array[r] = temp;
        
       return i+1;
    }
    
    private static int useQuickSelect(int[] array, int l, int r, int k) {
        if(k > 0 && k <= (r - l + 1)) {
            int pos = partitionQuickSelect(array, l, r);
            
            if(pos - l == k - 1) {
                return array[pos];
            }
            
            if (pos - l > k - 1) {
                return useQuickSelect(array, l, pos-1, k); 
            }
            
            return useQuickSelect(array, pos + 1, r, k-pos+l-1); 
            
        }
        
        return Integer.MAX_VALUE;
    }
    
    private static void KthLargestUsingQuickSelect(int[] array, int k) {
        int l = 0;
        int r = array.length - 1;
        
        
        System.out.println("Kth Largest number is: " + useQuickSelect(array, l, r, k));
    }
    
    /**
     * Using Max Heap
     * 
     * complexity O(n + kLogn).
     */
    private static void KthLargestUsingMaxHeap(int[] array, int k) {
        MaxHeap maxHeap = MaxHeap.initialiseHeap(array);
        int kThLarhest;
        for(int i = 0; i < k ; i++) {
            maxHeap.extractMax();
        }
        
        kThLarhest = maxHeap.extractMax();
        System.out.println("Kth Largest number is: " + kThLarhest);
        
    }
    
    /**
     * Using Min Heap
     * 
     * complexity O(k + (n-k)*Logk)
     * 
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
        int arr[] = {12, 3, 5, 7, 4, 19};
        int k = 5; 
        
        KthLargestUsingMaxHeap(arr, k);
        KthLargestUsingMinHeap(arr, k);
        KthLargestUsingQuickSelect(arr, k);
    }
    
}
