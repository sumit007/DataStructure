package util;

public class PrintUtil {
    public static void printArray(int[] arrayToSort, String message) {
        System.out.println(message);
        for (int i1 : arrayToSort) {
            System.out.print(i1 + "  ");
        }

        System.out.println();
    }

    public static void printArray(String[] arrayToSort, String message) {
        System.out.println(message);
        for (String i1 : arrayToSort) {
            System.out.print(i1 + "  ");
        }

        System.out.println();
    }
}
