public class BubbleSort {

    /*
    worst case Time complexity - O(n*n)
    Best case time complexity - O(n)
    Space complexity - O(1)
    It takes O(n) time for already sorted array
    Sorting in place
    Stable sort

    Used to detect small error like swap of two elements e.g. in polygon filling algorithm

     */


    public static void sortUsingBubbleSort(int[] arrayToSort) {

        PrintUtil.printArray(arrayToSort, "Un sorted array");

        for (int i = 0; i < arrayToSort.length; i++) {
            for (int j = 0; j < arrayToSort.length -1; j++) {
                if (arrayToSort[j] > arrayToSort[j+1]) {
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j+1];
                    arrayToSort[j+1] = temp;
                }
            }
        }

        PrintUtil.printArray(arrayToSort, "Sorted array Bubble Sort");

    }

    private static void bubbleSortRecursive(int[] arrayToSort, int index) {

        if (index == 1) {
            return;
        }

        for (int i = 0; i < index - 1; i++) {
            if (arrayToSort[i] > arrayToSort[i+1]) {
                int temp = arrayToSort[i];
                arrayToSort[i] = arrayToSort[i+1];
                arrayToSort[i+1] = temp;
            }
        }

        bubbleSortRecursive(arrayToSort, index - 1);

    }



    public static void sortUsingBubbleSortRecursive(int[] arrayToSort) {
        PrintUtil.printArray(arrayToSort, "Un sorted array");
        bubbleSortRecursive(arrayToSort, arrayToSort.length);
        PrintUtil.printArray(arrayToSort, "Sorted array Bubble Sort recursive");

    }

}
