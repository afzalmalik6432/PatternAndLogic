package com.logicalProgram.array;

import java.util.Scanner;

public class AddOneToArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int carry = 1;
        for (int i = arr.length-1; i >= 0; i--) {
            int sum = arr[i]+1;
            if(sum>9){
                carry = 1;
                arr[i] = 0;
            }
            else{
                carry = 0;
                arr[i] = sum;
                break;
            }
        }
        if(carry>0){
            System.out.print(carry+" ");
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
