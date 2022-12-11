package com.logicalProgram.array;
import java.util.Scanner;

public class HighestDigitIndex {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int freq[] = new int[10];
        for(int i=0; i<arr.length; i++){
            char ch = (char)(arr[i]+'0');
            int idx = ch-48;
            freq[idx]+=1;
        }
        int max = Integer.MIN_VALUE;
        int fIdx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
                fIdx = i;
            }
        }
        System.out.println((char)(fIdx+48));
        sc.close();
    }
}




