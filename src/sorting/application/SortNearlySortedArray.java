/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting.application;

import dataStructures.tree.heap.MinHeap;
import sorting.InsertionSort;
import util.PrintUtil;

/**
 *
 * @author sumit
 */
public class SortNearlySortedArray {
    
    /**
     * Insertion sort solution
     * 
     * complexity O(KN)
     * 
     */
    
    private static void sortUsingInsertionSort(int[] array, int k) {
        
        for(int i = 1; i < array.length; ++i) {
            int j = 0;
            while (array[j] < array[i]) {
                j++;
            }
            
            int temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
        
        PrintUtil.printArray(array, "Sorted Array");
    }
    
    private static void sortUsingMinHeap(int[] array, int k) {
        
        int[] temp = new int[k+1];
        System.arraycopy(array, 0, temp, 0, k+1);
        MinHeap minheap = MinHeap.initialiseHeap(temp);
        
        int index = 0;
        for (int i = k + 1; i < array.length; i++) {
            array[index++] = minheap.extractMin();
            minheap.insert(array[i]);
        }
        
        int num = minheap.extractMin();
        array[index++] = num;
        while (Integer.MIN_VALUE != num) {
            num = minheap.extractMin();
            array[index++] = num;
        }
        
        PrintUtil.printArray(array, "Sorted Array");
        
    }
    
    public static void testSortNearlySortedArray() {
        int k = 3; 
        int arr[] = { 2, 6, 3, 12, 56, 8 }; 
        
        //sortUsingInsertionSort(arr, k);
        //InsertionSort.sortUsingInsertionSortBinary(arr);
        sortUsingMinHeap(arr, k);
        
    }
    
}
