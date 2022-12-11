package com.logicalProgram.recursion;

import java.util.Scanner;

public class PrintArray {
    static void printArray(int arr[],int n){
        
        if(n==0){
            System.out.print(arr[0]+" ");
            return;
        }
        printArray(arr,n-1);
        System.out.print(arr[n]+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        printArray(arr,n-1);
        sc.close();
    }
}
