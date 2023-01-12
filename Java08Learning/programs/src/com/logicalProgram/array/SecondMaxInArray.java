package com.logicalProgram.array;

import java.util.Scanner;

public class SecondMaxInArray {

    public static int secondMax(int[] arr){

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if(secondLargest<arr[i] && secondLargest<firstLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(secondMax(arr));
        sc.close();
    }
}
