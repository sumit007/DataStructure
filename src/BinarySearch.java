public class BinarySearch {

    private static int bSearch(int[] arrayToSearch, int lIndex, int rIndex, int xNum) {

        if (rIndex >= lIndex) {

            int mid = lIndex + (rIndex -1) / 2;

            if (arrayToSearch[mid] == xNum) {
                return mid;
            }

            if (arrayToSearch[mid] > xNum) {
                return bSearch(arrayToSearch, lIndex, mid -1, xNum);
            }

            return bSearch(arrayToSearch, mid + 1, rIndex, xNum);

        }

        return -1;

    }

    public static int search(int[] arrayToSearch, int xNum) {

        int index  = bSearch(arrayToSearch, 0, arrayToSearch.length, xNum);

        if (index == -1) {
            System.out.println(xNum + " not present");
        } else {
            System.out.println(xNum + " is present at index " + index);
        }

        return index;

    }

}
