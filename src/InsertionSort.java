/*

Time complexity - O(n*n)
Auxiliary space - O(1)
Takes max time to sort in case array is reverse sorted
Sorting in place - Yes
Stable - Yes

Insertion sort is used when number of elements is small.
It can also be useful when input array is almost sorted,
only few elements are misplaced in complete big array.

 */


import java.util.Arrays;

public class InsertionSort {

    public static void sortUsingInsertionSort(int[] arrayToSort) {

        PrintUtil.printArray(arrayToSort, "Un sorted array");

        for (int i = 1; i < arrayToSort.length; i++) {
            int j = 0;
            while (arrayToSort[j] < arrayToSort[i]) {
                j++;
            }

            int temp = arrayToSort[j];
            arrayToSort[j] = arrayToSort[i];
            arrayToSort[i] = temp;

        }

        PrintUtil.printArray(arrayToSort, "Sorted array Insertion Sort");

    }

    private static void insertionSortRecursive(int[] arrayToSort, int n) {

        if (n  <= 1) {
            return;
        }

        insertionSortRecursive(arrayToSort, n-1);

        int last = arrayToSort[n-1];
        int index = n - 2;

        while (index >= 0 && arrayToSort[index] > last) {
            arrayToSort[index + 1] = arrayToSort[index];
            index--;
        }

        arrayToSort[index + 1] = last;

    }

    public static void sortUsingInsertionSortRecursive(int[] arrayToSort) {
        PrintUtil.printArray(arrayToSort, "Un sorted array");

        insertionSortRecursive(arrayToSort, arrayToSort.length);

        PrintUtil.printArray(arrayToSort, "Sorted array Insertion Sort recursive");
    }


    public static void sortUsingInsertionSortBinary(int[] arrayToSort) {

        PrintUtil.printArray(arrayToSort, "Un sorted array");

        for (int i = 0; i < arrayToSort.length; i++) {

            int x = arrayToSort[i];

            int j = Math.abs(Arrays.binarySearch(arrayToSort, 0, i, x) + 1);

            System.arraycopy(arrayToSort, j, arrayToSort, j+1, i-j);

            arrayToSort[j] = x;

        }

        PrintUtil.printArray(arrayToSort, "Sorted array Insertion Sort BinarySearch");
    }

}
