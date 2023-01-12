package com.logicalProgram.array;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatingMissing01 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int rep = Integer.MIN_VALUE;
        int mis = Integer.MIN_VALUE;
        for(int i=0; i<n-1; i++){
            if(arr[i]==arr[i+1]){
                rep=arr[i];
            }
            else if(arr[i]+1 != arr[i+1]){
                mis = arr[i]+1;
            }
        }
        if(arr[0]!=1)
            mis=1;
        else if(arr[n-1]!=n)
            mis=n;
        System.out.println(rep);
        System.out.println(mis);
        sc.close();
    }
}
