package com.logicalProgram;

import java.util.Scanner;

public class MaxFrequencyOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int maxCount = 0;
        int ele = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>maxCount){
                maxCount = count;
                ele = arr[i];
            }
        }
        System.out.println(ele);
        sc.close();
    }
}
