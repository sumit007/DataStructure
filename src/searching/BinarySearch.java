/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

/**
 *
 * @author sumit
 */
public class BinarySearch {
    
    private static int binarySearchUtil(int[] array, int item, int start, int end) {
        
        if (end >= start) {
            int mid = start + (end - start) / 2;

            if (array[mid] == item) {
                return mid;
            }

            if (array[mid] > item) {
                return binarySearchUtil(array, item, start, mid - 1);

            } else {
                return binarySearchUtil(array, item, mid + 1, end);

            }
        }
        
        return -1;
    }
    
    public static int binarySearch(int[] array, int item) {
        return binarySearchUtil(array, item, 0, array.length);
    }
    
    public static void demoBinarySearch() {
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 10; 
        
        System.out.println("item " + x + " is present at index " + binarySearch(arr, 10));
    }
}
