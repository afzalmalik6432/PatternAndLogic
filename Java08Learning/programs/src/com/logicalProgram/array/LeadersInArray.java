package com.logicalProgram.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// Given an array A of positive integers. Your task is to find the leaders in the array.
//  An element of array is leader if it is greater than or equal to all the elements to its right side.
//  The rightmost element is always a leader. 

public class LeadersInArray {

    static ArrayList<Integer> findLeaders(int[] arr){
        ArrayList<Integer> leadersArray = new ArrayList<>();
        leadersArray.add(arr[arr.length-1]);
        int max = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            if(max<arr[i]){
                max = arr[i];
                leadersArray.add(max);
            }
        }

        return leadersArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> leadersArray = findLeaders(arr);
        Collections.reverse(leadersArray);
        for(int x : leadersArray){
            System.out.print(x+" ");
        }
        sc.close();
    }
}
