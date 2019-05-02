/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructures.tree.heap;

/**
 *
 * @author sumit
 */
public class MaxHeap {
    private final int[] heap;
    private int size;
    private final int maxSize;
    
    public MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        this.heap = new int[maxSize + 1];
        size = 0;
        this.heap[0] = Integer.MAX_VALUE;
    }
    
    private int parent(int pos) {
        return (pos/2);
    }
    
    private int leftChild(int pos) {
        return (2 * pos);
       
    }
    
    private int rightChild(int pos) {
        return (2 * pos) + 1;
    }
    
    private boolean isLeaf(int pos) {
        return pos >= (size/2) && pos <= size;
    }
    
    private void swap(int fPos, int sPos) {
        int temp = heap[fPos];
        heap[fPos] = heap[sPos];
        heap[sPos] = temp;
    }
    
    private void heapify(int pos) {
        
        if (isLeaf(pos)) {
            return;
        }
        
        if(heap[leftChild(pos)] > heap[pos] ||
                heap[rightChild(pos)] > heap[pos]) {
            
            if(heap[leftChild(pos)] > heap[rightChild(pos)]) {
                swap(pos, leftChild(pos)); 
                heapify(leftChild(pos)); 
            } else {
                swap(pos, rightChild(pos)); 
                heapify(rightChild(pos)); 
            }
            
        }
    }
    
    public void insert(int element) {
        heap[++size] = element;
        
        int current = size;
        while (heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            
            current = parent(current);
        }
    }
    
    public void print() { 
        for (int i = 1; i <= size / 2; i++) { 
            System.out.print(" PARENT : " + heap[i] + " LEFT CHILD : " + 
                      heap[2 * i] + " RIGHT CHILD :" + heap[2 * i + 1]); 
            System.out.println(); 
        } 
    }
    
    public int extractMax() { 
        int popped = heap[1]; 
        heap[1] = heap[size--]; 
        heapify(1); 
        return popped; 
    } 
    
    /**
     * Utility methods to find the Kth element
     * 
     */
    public int getMaxInHeap() {
        return heap[0];
    }
    
    public void replaceMaxInHeap(int newMax) {
        heap[0] = newMax;
        heapify(0);
    }
    
    public void testMaxHeap(MaxHeap maxHeap) {
        maxHeap.print(); 
        System.out.println("The max val is " + maxHeap.extractMax());
        maxHeap.print(); 
        System.out.println("The max val is " + maxHeap.extractMax());
        maxHeap.print(); 
    }
    
    public static MaxHeap initialiseHeap(int[] array) {
        MaxHeap maxHeap = new MaxHeap(15); 
        for (int i : array) {
            maxHeap.insert(i);
        }
        
        return maxHeap;
    }
    
}
