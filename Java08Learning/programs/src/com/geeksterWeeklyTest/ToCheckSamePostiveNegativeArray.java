package com.geeksterWeeklyTest;

import java.util.Scanner;

public class ToCheckSamePostiveNegativeArray {
    static boolean checkVal(int arr[]){
        int n = arr.length;
        int first = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                return true;
            }
             else if(arr[i] != first ){
                 return false; 
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean check = checkVal(arr);
        System.out.println(check);
        sc.close();
    }
}
