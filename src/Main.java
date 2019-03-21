public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Selection Sort
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


        //BubbleSort
        int[] temp3 = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort.sortUsingBubbleSort(temp3);

        System.out.println();
        System.out.println();

        int[] temp4 = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort.sortUsingBubbleSortRecursive(temp4);

        System.out.println();
        System.out.println();

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


    }
}

/*
Some key terms related to Sorting Algorithms

1. Stable Sort algorithm - A sorting algorithm is called stable if two objects with equal same key appears in same order in
sorted output as they are in unsorted output.
check @Link https://www.geeksforgeeks.org/stable-selection-sort/

2.
 */
