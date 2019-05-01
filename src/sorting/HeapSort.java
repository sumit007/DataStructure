/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import util.PrintUtil;

/**
 *
 * @author sumit
 */
public class HeapSort {
    
    //sorting in increasing order using maxHeap
    private static void sort(int[] arrayToSort) {
        
        int size = arrayToSort.length;
        
        for (int i = size/2 - 1; i >= 0 ; i--) {
            heapify(arrayToSort, size, i); 
        }
        
        PrintUtil.printArray(arrayToSort, "Heapified array");
        
        for (int i = size-1; i >= 0; i--) { 
            // Move current root to end 
            int temp = arrayToSort[0]; 
            arrayToSort[0] = arrayToSort[i]; 
            arrayToSort[i] = temp; 
  
            // call max heapify on the reduced heap 
            heapify(arrayToSort, i, 0); 
        }
        
    }
    
    //Heapify max Heap
    private static void heapify(int[] arrayToSort, int size, int index) {
        
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        
        if (left < size && arrayToSort[left] > arrayToSort[largest]) {
            largest = left;
        }
        
        if(right < size && arrayToSort[right] > arrayToSort[largest]) {
            largest = right;
        }
        
        if (largest != index) {
            int swap = arrayToSort[index]; 
            arrayToSort[index] = arrayToSort[largest]; 
            arrayToSort[largest] = swap; 
            heapify(arrayToSort, size, largest); 
        } 
    }
    
    public static void demoHeapSort() {
        int arrayToSort[] = {12, 11, 13, 5, 6, 7}; 
        int n = arrayToSort.length; 

        PrintUtil.printArray(arrayToSort, "Unsorted array");
        
        HeapSort.sort(arrayToSort);
        
        PrintUtil.printArray(arrayToSort, "Sorted array after Heap sort");
    }
    
    //Sorting in decreasing order using min Heap
    
    private static void reverseSort(int[] arrayToSort) {
        int size = arrayToSort.length;
        
        for (int i = size/2 - 1; i >= 0; i--) {
            heapifyMinHeap(arrayToSort, size, i);
        }
        
        PrintUtil.printArray(arrayToSort, "Heapified array");
        
        for (int i = size-1; i >= 0; i--) { 
            // Move current root to end 
            int temp = arrayToSort[0]; 
            arrayToSort[0] = arrayToSort[i]; 
            arrayToSort[i] = temp; 
  
            // call max heapify on the reduced heap 
            heapifyMinHeap(arrayToSort, i, 0); 
        }
        
        
    }
    
    private static void heapifyMinHeap(int[] arrayToSort, int size, int index) {
        
        int smallest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        
        if(left < size && arrayToSort[left] < arrayToSort[smallest]) {
            smallest = left;
        }
        
        if (right < size && arrayToSort[right] < arrayToSort[smallest]) {
            smallest = right;
        }
        
        if (smallest != index) {
            int temp = arrayToSort[index];
            arrayToSort[index] = arrayToSort[smallest];
            arrayToSort[smallest] = temp;
            
            heapifyMinHeap(arrayToSort, size, smallest);
        }
        
    }
    
    public static void demoMinHeapSort() {
        int arrayToSort[] = {12, 11, 13, 5, 6, 7}; 
        int n = arrayToSort.length; 

        PrintUtil.printArray(arrayToSort, "Unsorted array");
        
        HeapSort.reverseSort(arrayToSort);
        
        PrintUtil.printArray(arrayToSort, "Reverse Sorted array after MinHeap sort");
    }
}
