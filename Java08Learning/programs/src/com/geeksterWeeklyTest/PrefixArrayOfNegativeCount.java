package com.geeksterWeeklyTest;

import java.util.Scanner;

/**
 * PrefixArrayOfNegativeCount
 */
public class PrefixArrayOfNegativeCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int newArray[] = new int[n];
        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i]<0){
                count++;
            }
            newArray[i] = count;
        }
        for(int num : newArray){
            System.out.print(num+" ");
        }
        sc.close();
    }
}