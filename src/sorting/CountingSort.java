/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;
import util.PrintUtil;

/**
 *
 * @author sumit
 */
public class CountingSort {
    
    /**
     * 
     * @param arrayToSort - Unsorted array
     * 
     * time complexity O(n+k) where k is range and n is n umber of elements in array
     *  
     */
    
    private static final int CHAR_LENGHT = 255;
    private static final int DIGIT_LENGTH = 10;
    
    private static void sortUsingCountingSort(int[] arrayToSort) {
        
        int[] count = new int[DIGIT_LENGTH];
        
        for (int i = 0; i < DIGIT_LENGTH; i++) {
            count[i] = 0;
        }
        
        for (int i : arrayToSort) {
            count[i]++;
        }
        
        for (int i = 1; i < DIGIT_LENGTH; i++) {
            count[i] = count[i-1] + count[i];
        }
        
        int[] output = new int[arrayToSort.length];
        
        for (int i = arrayToSort.length - 1; i >= 0; i--) {
            output[count[arrayToSort[i]] - 1] = arrayToSort[i];
            --count[arrayToSort[i]];
        }
        
        System.arraycopy(output, 0, arrayToSort, 0, arrayToSort.length);
        
        PrintUtil.printArray(arrayToSort, "Sorted array  Counting Sort ");
    }
    
    private static void sortUsingCountingSortNegativeNumbers(int[] arrayToSort) {
        int max = Arrays.stream(arrayToSort).max().getAsInt();
        int min = Arrays.stream(arrayToSort).min().getAsInt();
        
        int range = max - min + 1;
        
        int[] count = new int[range];
        int[] output = new int[arrayToSort.length];
        
        for (int i = 0; i < arrayToSort.length; i++) {
            count[arrayToSort[i] - min]++;
        }
        
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i-1];
        }
        
        for (int i = 0; i < arrayToSort.length; i++) {
            output[count[arrayToSort[i] - min] - 1] = arrayToSort[i];
            count[arrayToSort[i] - min]--;
        }
        
        System.arraycopy(output, 0, arrayToSort, 0, arrayToSort.length);
        PrintUtil.printArray(arrayToSort, "Sorted array  Counting Sort ");
    }
    
    private static void sortUsingCountingSort(char[] arrayToSort) {
        
        int[] count = new int[CHAR_LENGHT];
        
        for (int i = 0; i < CHAR_LENGHT; i++) {
            count[i] = 0;
        }
        
        for (int i : arrayToSort) {
            count[i]++;
        }
        
        for (int i = 1; i < CHAR_LENGHT; i++) {
            count[i] = count[i-1] + count[i];
        }
        
        char[] output = new char[arrayToSort.length];
        
        for (int i = arrayToSort.length - 1; i >= 0; i--) {
            output[count[arrayToSort[i]] - 1] = arrayToSort[i];
            --count[arrayToSort[i]];
        }
        
        //System.arraycopy(output, 0, arrayToSort, 0, arrayToSort.length);
        System.arraycopy(output, 0, arrayToSort, 0, arrayToSort.length);
        
        PrintUtil.printArray(arrayToSort, "Sorted array  Counting Sort ");
    }
    
    public static void demoCountingSort() {
        //int[] arrayToSort = {1, 3, 4, 7,2, 4,3,4,2,1,3,1,6,7,3,0,2,1,0};
        
        //PrintUtil.printArray(arrayToSort, "Un sorted array");
        //sortUsingCountingSort(arrayToSort);
        
        
        /*char arrayToSort[] = {'g', 'e', 'e', 'k', 's', 'f', 'o', 
                    'r', 'g', 'e', 'e', 'k', 's' }; 
        PrintUtil.printArray(arrayToSort, "Un sorted array");
        sortUsingCountingSort(arrayToSort);*/
        
        int[] arrayToSort = {-5, -10, 0, -3, 8, 5, -1, 10};
        PrintUtil.printArray(arrayToSort, "Un sorted array");
        sortUsingCountingSortNegativeNumbers(arrayToSort);
    }
    
}
