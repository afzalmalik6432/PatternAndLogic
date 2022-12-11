package com.logicalProgram.array;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = selectionSort(arr,n);
        for (int i : result) {
            System.out.print(i+" ");
        }
        sc.close();
    }
    static int[] selectionSort(int[] arr, int n) {
        for(int i=0; i<arr.length-1;i++){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
