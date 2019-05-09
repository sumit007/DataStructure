/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting.application;

/**
 *
 * @author sumit
 */
public class CheckSortedAndRotatedArray {
    
    /**
     * Sorted rotated array - Algorithm
     * 
     * find the smallest element in array - pivot
     * 
     * check all the elements on the left of smallest element must be sorted
     * check all the elements on the right of smallest element is sorted
     * check last element of array is smaller than element just before the min element
     * 
     */
    
    private static String checkArrayIsRotatedSorted(int[] array) {
        
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        //find min element
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        
        if (minIndex == 0) {
            return "NO";
        }
        
        boolean flag1;
        //Check all elements on left of minIndex is sorted
        for (int i = 0; i < minIndex - 1; i++) {
            if (array[i] > array[i + 1]) {
                return "NO";
            }
        }
        
        for (int i = minIndex + 1; i < array.length -1; i++) {
            if (array[i] > array[i + 1]) {
                return "NO";
            }
        }
        
        if (array[array.length - 1] > array[minIndex -1] ) {
            return "NO";
        }
        
        return "YES";
    }
    
    public static void demoCheckSortedRotatedArray() {
        int arr[] = { 3, 4, 5, 1, 2 };  
      
         int n = arr.length; 
      
        System.out.println("is Array Sorted rotated " + checkArrayIsRotatedSorted(arr)); 
    }
    
}
