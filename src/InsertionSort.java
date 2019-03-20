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

}
