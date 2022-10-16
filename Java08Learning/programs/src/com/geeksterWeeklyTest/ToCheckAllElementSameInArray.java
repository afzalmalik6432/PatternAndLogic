package com.geeksterWeeklyTest;

import java.util.Scanner;

public class ToCheckAllElementSameInArray {

    static boolean checkVal(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[i]!=arr[j]){
                    return false;
                }
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
    }
}
