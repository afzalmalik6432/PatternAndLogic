package com.logicalProgram.recursion;

import java.util.Scanner;

public class PrintOddNto1 {

    static void printOddNum(int n){
        if(n%2!=0 && n>=0){
            if(n==0){
                return;
            }
            System.out.print(n+" ");
            printOddNum(n-2);
        }
    }
    public static void main(String[] args) {
        // input odd number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printOddNum(n);
        sc.close();
    }
}
