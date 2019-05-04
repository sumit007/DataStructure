/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting.application;

import searching.PivotedBinarySearch;
import util.PrintUtil;

/**
 *
 * @author sumit
 */
public class SortingRotatedArray {
    
    private static void reverseArray(int[] array, int start, int end) {
        int i = start;
        int j = end;
        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
   
    private static void sortRotatedArray(int[] array) {
        
        PrintUtil.printArray(array, "UnSorted Array");
        
        for (int i = 0; i < array.length -1; i++) {
            if (array[i] > array[i+1]) {
                reverseArray(array, 0, i );
                reverseArray(array, i + 1, array.length-1);
                reverseArray(array, 0, array.length-1);
            }
        }
        
        PrintUtil.printArray(array, "Sorted Array");
        
    }
    
    public static void demoSortingRotatedArray() {
        int arr[] = { 6, 7, 8,9,10, 1, 2, 3, 4,5 }; 
        sortRotatedArray(arr);
    }
}
