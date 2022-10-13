package com.logicalProgram;

import java.util.Scanner;

public class RepeatedAndMissing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int val = Math.abs(arr[i]);
            if(arr[val-1]>0) 
            {
                arr[val-1] = -arr[val-1];
            }
            else
            {
                System.out.println(val);
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]>0) 
            {
                System.out.println(arr[i+1]);
            }
        }
        sc.close();
    }
}

