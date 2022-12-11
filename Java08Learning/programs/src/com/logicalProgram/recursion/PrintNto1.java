package com.logicalProgram.recursion;

import java.util.Scanner;

public class PrintNto1 {

    static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printNum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNum(n);
        sc.close();
    }
}
