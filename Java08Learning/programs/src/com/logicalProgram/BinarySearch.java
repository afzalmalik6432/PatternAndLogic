package com.logicalProgram;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int mid;
        while(low<=high){
            mid = (low+high)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(target < arr[mid]){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        System.out.println("************BinarySearch***********");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the element: ");
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value to search: ");
        int target = sc.nextInt();
        int result = binarySearch(arr,target);
        if(result>=0){
            System.out.println("Element fount at Index:"+result);
        }
        else{
            System.out.println("Element not found");
        }
        sc.close();
    }
}
