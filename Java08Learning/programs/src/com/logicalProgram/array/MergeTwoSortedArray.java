package com.logicalProgram.array;

import java.util.Scanner;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int []arr2 = new int[n];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] result = mergSortedArray(arr1,n,arr2,m);
        printArray(result);
        sc.close();
    }
    private static void printArray(int[] result) {
        for (int i : result) {
            System.out.print(i+" ");
        }
    }
    private static int[] mergSortedArray(int[] arr1, int n, int[] arr2, int m) {
        int p1=0;
        int p2=0;
        int p3=0;
        int[] arr3 = new int[n+m];
        while(p1<n && p2<m){
            if(arr1[p1]<arr2[p2]){
                arr3[p3] = arr1[p1];
                p1++;
                p3++;
            }
            else{
                arr3[p3] = arr2[p2];
                p2++;
                p3++;
            }
            
        }
        while(p1<n){
            arr3[p3] = arr1[p1];
            p1++;
            p3++;
        }
        while(p2<m){
            arr3[p3] = arr2[p2];
            p2++;
            p3++;
        }
        return arr3;
    }
}
