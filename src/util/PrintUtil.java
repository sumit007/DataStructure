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
    
    public static void printArray(char[] arrayToSort, String message) {
        System.out.println(message);
        for (char i1 : arrayToSort) {
            System.out.print(i1);
        }

        System.out.println();
    }
    
    public static void printLinkedList(LinkedListNode head, String message) {
        System.out.println(message);
        if(head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        
        LinkedListNode tempNode = head;
        
        while (tempNode != null) {
            System.out.print(tempNode.data + " -> ");
            tempNode = tempNode.next;
        }
        
        System.out.println();
    }

    public static void printLinkedList(LinkedListNode tempNode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
