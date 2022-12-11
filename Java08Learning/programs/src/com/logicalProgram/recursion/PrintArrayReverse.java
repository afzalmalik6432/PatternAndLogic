package com.logicalProgram.recursion;

import java.util.Scanner;

public class PrintArrayReverse {

    static void printReverse(int[] arr, int n){
        if(n==0){
            System.out.print(arr[0]+" ");
            return;
        }
        System.out.print(arr[n]+" ");
        printReverse(arr, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        printReverse(arr,n-1);
        sc.close();
    }
}
