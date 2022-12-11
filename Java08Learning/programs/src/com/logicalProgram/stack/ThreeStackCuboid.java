package com.logicalProgram.stack;

import java.util.Scanner;
import java.util.Stack;

public class ThreeStackCuboid {
    static int equalStacks(int[] arr1, int[] arr2, int[] arr3) {
 
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        Stack<Integer> s3 = new Stack<Integer>();
 
        int h1 = 0; 
        int h2 = 0; 
        int h3 = 0; 
 
        for(int i = arr1.length-1; i >= 0 ; i--){
            s1.push(arr1[i]);
            h1 = h1+arr1[i];
        }
        for(int i = arr2.length-1; i >= 0 ; i--){
            s2.push(arr2[i]);
            h2 = h2+arr2[i];
        }
        for(int i = arr3.length-1; i >= 0 ; i--){
            s3.push(arr3[i]);
            h3 = h3+arr3[i];
        }
        
        int minHeight = Math.min(h1,Math.min(h2,h3));
        while(h1 != h2 || h1 != h3){
            while(h1 > minHeight){
                h1 = h1-s1.pop();
            }
            minHeight = Math.min(h1,Math.min(h2,h3));
            while(h2 > minHeight){
                h2 = h2-s2.pop();
            }
            minHeight = Math.min(h1,Math.min(h2,h3));
            while(h3 > minHeight){
                h3 = h3-s3.pop();
            }
            minHeight = Math.min(h1,Math.min(h2,h3));
        }
        return minHeight;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        int arr3[] = new int[n3];
        for(int i=0; i<n1; i++)
            arr1[i]=sc.nextInt();
        for(int i=0; i<n2; i++)
            arr2[i]=sc.nextInt();
        for(int i=0; i<n3; i++)
            arr3[i]=sc.nextInt();
        System.out.println(equalStacks(arr1,arr2,arr3));
        sc.close();
    }
}

// Sample input
// 4 3 2
// 1 2 1 1
// 1 1 2
// 1 1
