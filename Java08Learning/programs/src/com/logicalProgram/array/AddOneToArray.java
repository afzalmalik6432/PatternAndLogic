package com.logicalProgram.array;

import java.util.Scanner;


public class AddOneToArray {

    public static int[] addOne(int[] arr){
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] < 9){
                arr[i] += 1;
                return arr;
            }
            arr[i] = 0;
        }
        int[] nums = new int[arr.length+1];
        nums[0] = 1;
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = addOne(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" , ");
        }
        sc.close();
    }
}
