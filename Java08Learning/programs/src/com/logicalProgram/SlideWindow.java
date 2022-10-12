package com.logicalProgram;

import java.util.Scanner;

public class SlideWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - k; i++) {
            for (int j = i; j < k+i; j++) {
                if(arr[j]>max){
                    max = arr[j];
                }
            }
            System.out.print(max+" ");
        }
        sc.close();
    }
}
