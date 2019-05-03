/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

/**
 *
 * @author sumit
 * 
 * Search an item in rotated sorted array
 * 
 */
public class PivotedBinarySearch {
    
    private static int binarySearch(int[] array, int item, int start, int end) {
        if (end < start) {
            return -1;
        }
        
        int mid = (start + end)/2;
        
        if (array[mid] == item) {
            return mid;
        }
        
        if (array[mid] > item) {
            return binarySearch(array, item, start, mid - 1);
        }
        
        return binarySearch(array, item, mid + 1, end);
    }
    
    /**
     * 
     * @param array
     * @return index of pivot element -1 array is not rotated
     * 
     * pivot element is that element for which next item and previous item are less than it.
     * 
     */
    private static int findPivot(int[] array, int start, int end) {
        
        if (start > end) return -1;
        
        if (end == start) return start;
        
        int mid = (end + start)/2;
        
        if (mid < end && array[mid] > array[mid + 1]) {
            return mid;
        }
        
        if (mid > start && array[mid] < array[mid - 1]) {
            return (mid -1);
        }
        
        if (array[start] >= array[mid + 1]) return findPivot(array, start, mid -1);
        
        return findPivot(array, mid + 1, end);
        
    }
    
    public static int pivotedBinarySearch(int[] array, int item) {
        
        int pivot = findPivot(array, 0, array.length);
        
        if (array[pivot] == item) {
            return pivot;
        }
        
        if (pivot == -1) {
            return binarySearch(array, item, 0, array.length);
        }
        
        if (array[0] <= item) {
            return binarySearch(array, item, 0, pivot -1);
            
        } else {
            return binarySearch(array, item, pivot + 1, array.length);
            
        }
        
    }
   
    public static void demoPivotedSearch() {
        int array[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int item = 3;
        System.out.println(item + " is present at index " + pivotedBinarySearch(array, item));
    }
}
