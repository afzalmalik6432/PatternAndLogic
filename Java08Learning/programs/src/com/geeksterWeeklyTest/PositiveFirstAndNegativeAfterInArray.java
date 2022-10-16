package com.geeksterWeeklyTest;

import java.util.Scanner;

public class PositiveFirstAndNegativeAfterInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ans = false;
        for(int i=0; i<n-1; i++){
            if((arr[i]>0 && arr[i+1]>0) || (arr[i]<0 && arr[i+1] <0)){
                ans = true;
            }
                else{
                    ans = false;
                }
            }
        System.out.println(ans); 
        sc.close();
    }
}
