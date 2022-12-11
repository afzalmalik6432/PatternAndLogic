package com.logicalProgram.array;

import java.util.Scanner;

public class CharFreqArray {
    static void checkFrequency(String str){
        str = str.toLowerCase();
        int n = str.length();
        int []freq = new int[26];
        for(int i=0; i<n; i++){
            int idx = str.charAt(i)-97;
            freq[idx]++;
        }
        for(int x : freq){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        checkFrequency(str);
        sc.close();
    }
}
