package com.logicalProgram;

import java.util.Scanner;

public class MaxFrequencyElement {
    public static void findWindow(int[] arr, int size){
        
        int max = Integer.MIN_VALUE;
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(arr[j]>max){
                    max = arr[j];
                }
            }
        }
        System.out.print(max+" ");
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =  sc.nextInt();
        }
        int size = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=i; j<size+i; j++){
                findWindow(arr, size);
                break;
            }
        }
    }
}
