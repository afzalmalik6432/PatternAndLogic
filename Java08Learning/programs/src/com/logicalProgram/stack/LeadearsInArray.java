package com.logicalProgram.stack;

import java.util.Scanner;
import java.util.Stack;

public class LeadearsInArray {

    static void findleaders(int[] arr){
        Stack<Integer> st = new Stack<>();

        st.push(arr[arr.length-1]);
        int max = st.peek();
        
        for(int i=arr.length-2; i>=0; i--){
            if(max<arr[i]){
                max = arr[i];
                st.push(max);
            }
        }
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        findleaders(arr);   
        sc.close(); 
    }
}
