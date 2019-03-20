public class SelectionSort {

    private static int getMinIndex(int[] arrayToSort, int i, int minIndex) {
        for (int j = i + 1; j < arrayToSort.length; j++) {
            if (arrayToSort[j] < arrayToSort[minIndex]) {
                minIndex = j;
            }
        }
        return minIndex;
    }

    private static int getMinIndex(String[] arrayToSort, int i, int minIndex) {
        for (int j = i + 1; j < arrayToSort.length; j++) {
            if (arrayToSort[j].compareTo(arrayToSort[minIndex]) < 0) {
                minIndex = j;
            }
        }
        return minIndex;
    }

    /*
    1. select a first index
    2. find the smallest index in remaining array
    3. swap the number
    4. repeat 0..n

    Properties of Selection sort
    1. In-pace sort - not required extra space space complexity is O(n)
    2. takes O(n) swaps useful in case memory write is costly operation
    3. takes O(n*n) time complexity
     */

    public static void sortUsingSelectionSort(int[] arrayToSort) {

        PrintUtil.printArray(arrayToSort, "Un sorted array: ");

        for (int i = 0; i < arrayToSort.length; i++) {

            int minIndex = i;

            minIndex = getMinIndex(arrayToSort, i, minIndex);

            int temp = arrayToSort[minIndex];
            arrayToSort[minIndex] = arrayToSort[i];
            arrayToSort[i] = temp;
        }

        PrintUtil.printArray(arrayToSort, "Sorted array: ");

    }

    /*
    recursive selection sort
     */

    private static int getMinIndexRecursive(int[] arrayTosort, int i, int j) {
        if (i == j) {
            return i;
        }

        int key = getMinIndexRecursive(arrayTosort, i + 1, j);

        return arrayTosort[i] < arrayTosort[key] ? i : key;
    }

    private static void selectionSortRecursive(int[] arrayToSort, int n, int index) {

        if (index == n) {
            return;
        }

        int key = getMinIndexRecursive(arrayToSort, index, n-1);

        if (key != index) {
            int temp = arrayToSort[key];
            arrayToSort[key] = arrayToSort[index];
            arrayToSort[index] = temp;
        }

        selectionSortRecursive(arrayToSort, n, index+1);

    }

    public static void sortUsingSelectionSortRecursive(int[] arrayToSort) {
        PrintUtil.printArray(arrayToSort, "Un sorted array: ");

        selectionSortRecursive(arrayToSort, arrayToSort.length, 0);

        PrintUtil.printArray(arrayToSort, "Sorted array recursive: ");

    }

    /*
    Stable selection sort - Ordering of equal object should be preserved
     */

    public static void sortUsingStableSelectionSort(int[] arrayToSort) {
        PrintUtil.printArray(arrayToSort, "Un sorted array: ");

        for (int i = 0; i < arrayToSort.length; i++) {

            int minIndex = i;

            minIndex = getMinIndex(arrayToSort, i, minIndex);

            int key = arrayToSort[minIndex];

            while (minIndex > i) {
                arrayToSort[minIndex] = arrayToSort[minIndex-1];
                minIndex--;
            }

            arrayToSort[i] = key;

        }

        PrintUtil.printArray(arrayToSort, "Sorted array stable: ");
    }

    /*
    selection sort for sorting string using string.compare(string) function
     */
    public static void sortStringUsingSelectionSort(String[] arrayToSort) {

        PrintUtil.printArray(arrayToSort, "Un Sorted Array");

        for (int i = 0; i < arrayToSort.length; i++) {

            int minIndex = i;

            minIndex = getMinIndex(arrayToSort, i, minIndex);

            String temp = arrayToSort[minIndex];
            arrayToSort[minIndex] = arrayToSort[i];
            arrayToSort[i] = temp;

        }


        PrintUtil.printArray(arrayToSort, "Sorted Array string");
    }

}
