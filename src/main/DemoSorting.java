/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import sorting.BubbleSort;
import sorting.InsertionSort;
import sorting.MergeSort;
import sorting.QuickSort;
import sorting.SelectionSort;

/**
 *
 * @author sumit
 */
public class DemoSorting {
    
    public static void demoSortingAlgos() {
        //Selection Sort
        demoSortingSelectionSort();

        //BubbleSort
        demoBubbleSort();
        
        //Insertion Sort
        demoInsertionSort();
        
        //Merge Sort
        demoMergeSort();
    }
    
    public static void demoSortingSelectionSort() {
        int[] temp = {348, 232, 232, 323, 32, 233, 232};
        SelectionSort.sortUsingSelectionSort(temp);
        System.out.println();
        System.out.println();
        int[] temp1 = {348, 232, 232, 323, 32, 233, 232};
        SelectionSort.sortUsingStableSelectionSort(temp1);
        System.out.println();
        System.out.println();
        int[] temp2 = {348, 232, 232, 323, 32, 233, 232};
        SelectionSort.sortUsingSelectionSortRecursive(temp2);
        System.out.println();
        System.out.println();
        String[] stringArray = {"GeeksforGeeks", "Practice.GeeksforGeeks", "GeeksQuiz"};
        SelectionSort.sortStringUsingSelectionSort(stringArray);
        System.out.println();
        System.out.println();
    }
    
    public static void demoBubbleSort() {
        int[] temp3 = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort.sortUsingBubbleSort(temp3);

        System.out.println();
        System.out.println();

        int[] temp4 = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort.sortUsingBubbleSortRecursive(temp4);

        System.out.println();
        System.out.println();
    }
    
    public static void demoInsertionSort() {
        int[] temp5 = {64, 34, 25, 12, 22, 11, 90};
        InsertionSort.sortUsingInsertionSort(temp5);

        System.out.println();
        System.out.println();

        int[] temp6 = {64, 34, 25, 12, 22, 11, 90};
        InsertionSort.sortUsingInsertionSortRecursive(temp6);

        System.out.println();
        System.out.println();
        
        int[] temp7 = {64, 34, 25, 12, 22, 11, 90};
        InsertionSort.sortUsingInsertionSortBinary(temp7);
        
        System.out.println();
        System.out.println();
    }
    
    public static void demoMergeSort() {
        int[] temp8 = {64, 34, 25, 12, 22, 11, 90};
        MergeSort.sortUsingMergeSort(temp8);
        
        System.out.println();
        System.out.println();
    }
    
    public static void demoQuickSort() {
        int[] temp8 = {64, 34, 25, 12, 22, 11, 90};
        QuickSort.sort(temp8);
        
        System.out.println();
        System.out.println();
    }
}
