package com.logicalProgram.array;

import java.util.Scanner;

public class SecondHighestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c){
            if(b>c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }
        else if(b>c && b>a){
            if(a>c){
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }
        }
        else{
            if(b>a){
                System.out.println(b);
            }
            else{
                System.out.println(a);
            }
        }
        sc.close();
    }
}
