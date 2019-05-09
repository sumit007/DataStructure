/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructures.linear.array.oned;

/**
 *
 * @author sumit
 */
public class NextPermutation {
    
    public static boolean findNextPermutation(int[] data) {
        
        if (data.length <= 1) {
            return false;
        }
        
        int last = data.length - 2;
        
        while (last >= 0) {
            if (data[last] < data[last + 1]) {
                break;
            }
            last--;
        }
        
        if (last < 0) {
            return false;
        }
        
        int nextGreater = data.length - 1;
        
        for (int i = nextGreater; i > last; i--) {
            if(data[i] > data[last]) {
                nextGreater = i;
                break;
            }
        }
        
        swap(data, nextGreater, last);
        reverse(data, 1 + last, data.length - 1);
        
        return true;
    }
    
    private static void swap(int[] data, int left, int right) {
        int temp = data[left];
        data[left] = data[right];
        data[right] = temp;
       
    }
    
    private static void reverse(int[] data, int left, int right) {
        
        while (left < right) {
            swap(data, left, right);
            left++;
            right--;
        }
    }
}
