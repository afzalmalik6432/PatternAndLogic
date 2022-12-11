package com.logicalProgram.recursion;

import java.util.Scanner;

public class Power {

    static int pow(int n, int num){
        if(n==0){
            return 1;
        }
        return num*pow(n-1,num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        System.out.println(pow(n,num));
        sc.close();
    }
}
