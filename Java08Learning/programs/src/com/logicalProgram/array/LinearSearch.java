package com.logicalProgram.array;

import java.util.Scanner;

/**
 * LinearSearch
 */
public class LinearSearch {

    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();
        int result = linearSearch(arr,target);
        if(result>=0){
            System.out.println("Element found at index: "+result);
        }
        else{
            System.out.println("Element not found");
        }
        sc.close();
    } 
}