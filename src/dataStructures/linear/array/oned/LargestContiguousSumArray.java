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
 * programing paradigm used - Dynamic Programing
 * 
 */
public class LargestContiguousSumArray {
    
    public static void demoLargestContiguousSumArray() {
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
        
        largestContiguousSumSubArray(a);
    }
    
    private static void largestContiguousSum(int[] arr) {
        
        int maxSoFarNow = 0;
        int maxEndingHere = 0;
        
        for (int num : arr) {
            maxEndingHere = maxEndingHere + num;
            
            if (maxEndingHere < 0) {
                maxEndingHere  = 0;
            }
            
            if (maxSoFarNow < maxEndingHere) {
                maxSoFarNow = maxEndingHere;
            }
        }
        
        
        System.out.println(maxSoFarNow);
        
    }
    
    private static void largestContiguousSumAllNegativeNum(int[] arr) {
        
        int maxSoFarNow = arr[0];
        int maxEndingHere = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = maxEndingHere + arr[i];
            
            if (maxEndingHere < 0) {
                maxEndingHere  = 0;
            }
            
            if (maxSoFarNow < maxEndingHere) {
                maxSoFarNow = maxEndingHere;
            }
        }
        
        
        System.out.println(maxSoFarNow);
        
    }
    
    private static void largestContiguousSumSubArray(int [] arr) {
        int maxSoFar = 0;
        int maxEndingHere = 0;
        int sIndex = 0; 
        int lIndex = 0;
        
        for (int i = 0; i < arr.length; i++) {
            maxEndingHere = maxEndingHere + arr[i];
            
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
                sIndex = i + 1;
            }
            
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
                lIndex = i;
            }
        }
        
        System.out.println("Max Sum : " +  maxSoFar);
        System.out.println("Max Sum Start index : " +  sIndex);
        System.out.println("Max Sum End index : " +  lIndex);

    }
    
}
