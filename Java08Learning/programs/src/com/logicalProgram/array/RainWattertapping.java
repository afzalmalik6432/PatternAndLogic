package com.logicalProgram.array;

import java.util.*;

public class RainWattertapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int water = 0;
        int totalWater = 0;
        for (int j = 0; j < arr.length; j++) {
            int maxl = arr[j];
            for(int i=0; i<j;i++){
                if(maxl<arr[i]){
                    maxl = arr[i];
                }
            }
            int maxr = arr[j];
            for(int i=j+1;i<n;i++){
                if(maxr<arr[i]){
                    maxr = arr[i];
                }
            }
        water = Math.min(maxl, maxr)-arr[j];
        totalWater+=water;
        }
        System.out.println(totalWater);
        sc.close();
    }
}

