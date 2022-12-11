package com.logicalProgram.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SameNumberSameFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n;i++){
            int key = arr[i];
            if(map.containsKey(key)){
                map.put(key, map.get(key) + 1);
            }
            else{
                map.put(key,1);
            }
        }
        System.out.println(map);
        int k=0; 
        while(k<255){
            char ch = (char) k;
            if(map.containsKey(ch-48)){
                if(map.get(ch-48)==k-48){
                    System.out.println(ch-48);
                }
            }
            k++;
        }
        sc.close();
    }
}
