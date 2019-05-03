/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting.application;

import util.PrintUtil;

/**
 *
 * @author sumit
 */
public class SortAnArrayOfO1And2 {
    
    private static void sortUsingDutchNationalFlagAlgo(int[] array) {
        int lo = 0;
        int mid = 0;
        int hi = array.length-1;
        
        while (mid <= hi) {
            
            switch (array[mid]) {
                case 0:
                    int temp = array[lo];
                    array[lo] = array[mid];
                    array[mid] = temp;
                    lo++; mid++;
                    
                    break;
                    
                case 1:
                    mid++;
                    break;
                    
                case 2:
                    temp = array[mid];
                    array[mid] = array[hi];
                    array[hi] = temp;
                    hi--;
            }
        }
        
        PrintUtil.printArray(array, "Sorted array after dutch flag problem");
    }
    
    public static void testSortArrayOf01and2() {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sortUsingDutchNationalFlagAlgo(arr);
    }
    
}
