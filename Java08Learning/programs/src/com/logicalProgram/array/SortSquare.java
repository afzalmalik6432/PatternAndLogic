package com.logicalProgram.array;
import java.util.*;

public class SortSquare {

    public static int[] sortedSquares(int[] nums) {
        int res[] = new int[nums.length];
        int i =0;
        int j = nums.length-1;
        int index = nums.length-1;
        while(i<=j){
            int v1 = nums[i]*nums[i];
            int v2 = nums[j]*nums[j];
            if(v1>v2){
                res[index]=v1;
                i++;
            }
            else{
                res[index]=v2;
                j--;
            }
            index--;
        }
        return res;
    }

    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
           arr[i] = sc.nextInt();
        int res[] = sortedSquares(arr);
         for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
         }
         sc.close();
     }
}







