package com.logicalProgram.array;

import java.util.Scanner;

/**
 * BublleSort
 */
public class BubbleSort {

    // TC O(n^2)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>=arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int num : arr) {
            System.out.print(num+" ");
        }
        sc.close();
    }
}
