package com.logicalProgram;

import java.util.Scanner;

public class IdenticalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        boolean ans = false;
        for(int i=0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }
        if(arr1.length == arr2.length){
            for(int i=0; i<arr1.length; i++){
                if(arr1[i]==arr2[i]){
                    ans = true;
                }
                else{
                    ans = false;
                }
            }
        }
        else{
            ans = false;
        }
        System.out.println(ans);
        sc.close();
    }
}
