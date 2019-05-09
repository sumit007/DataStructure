/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructures.linear.array.oned;

/**
 *
 * @author sumit
 * 
 * Inversion count for an array indicates how far the array is from being sorted.
 * Inversion count for sorted array is 0 while inversion count for reverse sorted array is maximum.
 * Formally speaking, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j
 */
public class InversionCount {
    
    /**
     * Simplest algorithm - 
     * for each element of array count the inversion for that.
    */
    
    private static void countInversionIterative(int[] array) {
        
        /*int inversionCount = 0;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] < array[j]) {
                    inversionCount++;
                }
            }
        }*/
        
        int inversionCount = 0; 
        int n = array.length;
        for (int i = 0; i < n - 1; i++) 
            for (int j = i + 1; j < n; j++) 
                if (array[i] > array[j]) 
                    inversionCount++; 
  
        
        System.out.println("Inversion count is " + inversionCount);
    }
    
    public static void countInversion() {
        int arr[] = new int[] { 1, 20, 6, 4, 15 }; 
        countInversionIterative(arr);
    }
    
}
