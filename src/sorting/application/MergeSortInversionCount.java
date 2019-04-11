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
public class MergeSortInversionCount {
    /**
     * Inversion count in Array optimized
     * 
     * inversionCount += (iMid - i)
    */
    
    public static void printInversionCount() {
        int arr[] = new int[] { 1, 20, 6, 4, 5 }; 
        
        System.out.println("Inversion count is : " + countInversionUsingMergeSort(arr));
    }
    
    private static int countInversionUsingMergeSort(int[] array) {
        
        int count = _mergeSortUpdated(array, 0, array.length-1);
        
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        
        return count;
    }
    
    private static int _mergeSortUpdated(int[] array, int iStart, int iEnd) {
        int iMid, inversionCount = 0;
        
        if (iStart < iEnd) {
            iMid = (iStart + iEnd)/2;
            
            inversionCount = _mergeSortUpdated(array, iStart, iMid);
            inversionCount += _mergeSortUpdated(array, iMid+1, iEnd);
            
            inversionCount += _mergeSortedArray(array, iStart, iMid, iEnd);
        }
        
        return inversionCount;
    }
    
    private static int _mergeSortedArray(int array[], int iStart, int iMid, int iEnd) {
        int inversionCount = 0;
        
        int sLeft = iMid - iStart + 1;
        int sRight = iEnd - iMid;
        
        int[] left = new int[sLeft];
        int[] right = new int[sRight];
        
        for (int i = 0; i < sLeft; ++i) {
            left[i] = array[iStart + i];
        }
        
        for (int j = 0; j < sRight; ++j) {
            right[j] = array[iMid + j + 1];
        }
        
        int i = 0, j = 0;
        int k = iStart;
        
        while(i < sLeft && j < sRight) {
            if(left[i] < right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
                inversionCount = inversionCount + (iMid - i);
            }
            
            k++;
        }
        
        while (i < sLeft) {
            array[k] = left[i];
            i++;
        }
        
        while (j < sRight) {
            array[k] = right[j];
            j++;
        }
        
        return inversionCount;
        
    }
    
}
