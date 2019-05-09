/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructures.linear.array.twod;

import java.util.Arrays;
import util.PrintUtil;

/**
 *
 * @author sumit
 */
public class MagicSquare {
    
    public static int[][] generateMagicSquare(int n) {
        
        int[][] arr = generateSquareOfOrderN(n);
        
        PrintUtil.printArray(arr, n ,"Magic array of order " + n + " is:");
        
        return arr;
    }
    
    private static int[][] generateSquareOfOrderN(int n) {
        int magic[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                magic[i][j] = 0;
            }
        }
        
        int i = n/2;
        int j = n - 1;
        
        
        for (int num = 1; num <= n * n; ) {
            
            /**
            * condition 1 - If the calculated row position is -1 & calculated column position is n, 
            * the new position would be: (0, n-2).
            * 
            */
            if (i == -1 && j == n) {
                i = 0;
                j = n-2;
                
            } else {
                /**
                 * condition 2 -  At any time, if the calculated row position becomes -1, 
                 * it will wrap around to n-1. Similarly, if the calculated column position becomes n, 
                 * it will wrap around to 0.
                 */
                
                if (j == n) {
                    j = 0;
                }
                
                if (i < 0) {
                    i = n-1;
                }
                
            }
            
            /**
             * If the magic square already contains a number at the calculated position, 
             * calculated column position will be decremented by 2, 
             * and calculated row position will be incremented by 1.
             * 
             */
            if (magic[i][j] != 0) {
                j -= 2;
                i++;
                
            } else {
                magic[i][j] = num++;
                i--;
                j++;
            }
        }
        
        return magic;
    }
    
    public static boolean checkMagicSquare(int[][] array, int n) {
        
        int magicSum = 0;
        for (int j = 0; j < n; j++) {
            magicSum += array[0][j];
        }
        
        //check all row's sum is equals to magicSum
        for (int i = 0; i < n; i++) {
            int tSum = 0;
            for (int j = 0; j < n; j++) {
                tSum += array[i][j];
            }
            
            if (tSum != magicSum) {
                return false;
            }
        }
        
        //check all coloums sum is equals to magicSum
        
        for (int j = 0; j < n; j++) {
            int tSum = 0;
            for (int i = 0; i < n; i++) {
                tSum += array[i][j];
            }
            
            if (tSum != magicSum) {
                return false;
            }
        }
        
        //Check diagonal elements sum is magicSum
        int tSum = 0;
        for (int i = 0; i < n; i++) {
            tSum += array[i][i];
        }
        
        if (tSum != magicSum) {
            return false;
        }
        
        tSum = 0;
        for (int i = n-1; i > 0; i++) {
            tSum += array[n-i][i];
        }
        
        return tSum == magicSum;
        
    }
    
    public static int[][][] generateAllMagicSquare(int n) {
        
        int[][][] magic = new int[n][n][n];
        
        for (int i = 0; i < n; i++) {
            magic[i] = generateSquareOfOrderN(n);
        }
        
        for (int[][] array2D: magic) {
            for (int[] array1D: array2D) {
               for(int item: array1D) {
                  System.out.print(item + "  ");
               }
               System.out.print("\t");
            }
            
            System.out.println();
        }
        
        return magic;
    }
}
