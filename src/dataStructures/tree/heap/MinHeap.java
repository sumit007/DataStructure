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
public class MinHeap {
    
    private final int[] minHeap;
    private int size;
    private final int capacity;
    
    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.minHeap = new int[capacity];
        this.minHeap[0] = Integer.MIN_VALUE;
        this.size = 0;
    }
    
    private boolean isLeafNode(int pos) {
        return pos > size/2 && pos <= size;
    }
    
    private int parent(int pos) {
        return pos/2;
    }
    
    private int leftChild(int pos) {
        return 2 * pos;
    }
    
    private int rightChild(int pos) {
        return 2 * pos + 1;
    }
    
    private void swap(int fPos, int sPos) {
        int temp = this.minHeap[fPos];
        this.minHeap[fPos] = this.minHeap[sPos];
        this.minHeap[sPos] = temp;
    }
    
    private void heapify(int pos) {
        if(isLeafNode(pos)) {
            return;
        }
        
        if(this.minHeap[leftChild(pos)] < this.minHeap[pos] 
                || this.minHeap[rightChild(pos)] < this.minHeap[pos]) {
            
            if(this.minHeap[leftChild(pos)] < this.minHeap[rightChild(pos)]) {
                swap(leftChild(pos), pos);
                heapify(leftChild(pos));
            } else {
                swap(rightChild(pos), pos);
                heapify(rightChild(pos));
            }
        }
    }
    
    public void insert(int element) {
        this.minHeap[++size] = element;
        
        int current = size;
        
        while (this.minHeap[current] < this.minHeap[parent(current)]) {
            swap(current, parent(current));
            
            current = parent(current);
        }
    }
    
    public void print() { 
        for (int i = 1; i <= size / 2; i++) { 
            System.out.print(" PARENT : " + this.minHeap[i] + " LEFT CHILD : " + 
                      this.minHeap[2 * i] + " RIGHT CHILD :" + this.minHeap[2 * i + 1]); 
            System.out.println(); 
        } 
    }
    
    public int extractMin() { 
        int popped = this.minHeap[1]; 
        this.minHeap[1] = this.minHeap[size--];
        heapify(1); 
        return popped; 
    } 
    
    /**
     * Utility methods to find the Kth Largest element
     * 
     * @return 
     */
    public int getMinInHeap() {
        return this.minHeap[1];
    }
    
    public void replaceMinInHeap(int newMax) {
        this.minHeap[1] = newMax;
        heapify(1);
    }
    
    public static MinHeap initialiseHeap(int[] array) {
        
        MinHeap minHeap = new MinHeap(15); 
        for (int i : array) {
            minHeap.insert(i);
        }
  
        /*System.out.println("The Max Heap is "); 
        minHeap.print(); 
        System.out.println("The max val is " + minHeap.extractMax());
        maxHeap.print(); 
        System.out.println("The max val is " + maxHeap.extractMax());
        maxHeap.print(); */
        
        return minHeap;
    }
    
}
