package com.logicalProgram.recursion;

import java.util.Scanner;

public class Print1toN {

    static void printNum(int n) {
        if(n==0){
            return;
        }
        printNum(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNum(n);
        sc.close();
    }
}
