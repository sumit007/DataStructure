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
public class QuickSort {
    
    private static int partisionTakingLastIndexAsPivot(int[] arrayToSort, int iStart, int iEnd) {
        
        int pivot = arrayToSort[iEnd];
        
        int i = iStart - 1;
        
        for (int j = iStart; j < iEnd; j++) {
            
            if(arrayToSort[j] <= pivot) {
                i++;
                
                // swap arr[i] and arr[j] 
                int temp = arrayToSort[i]; 
                arrayToSort[i] = arrayToSort[j]; 
                arrayToSort[j] = temp; 
            }
        }
        
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arrayToSort[i+1]; 
        arrayToSort[i+1] = arrayToSort[iEnd]; 
        arrayToSort[iEnd] = temp; 
        
        return i+1;
        
    }
    
    private static void quickSort(int[] arrayToSort, int low, int high) {
        if (low < high) {
            int iPivot = partisionTakingLastIndexAsPivot(arrayToSort, low, high);
            
            quickSort(arrayToSort, low, iPivot - 1);
            quickSort(arrayToSort, iPivot + 1, high);
            
        }
    }
    
    public static void sort(int[] arrayToSort) {
        PrintUtil.printArray(arrayToSort, "Un sorted array");
        
        quickSort(arrayToSort, 0, arrayToSort.length-1);
        
        PrintUtil.printArray(arrayToSort, "Sorted array Quick Sort");
    }
    
}
