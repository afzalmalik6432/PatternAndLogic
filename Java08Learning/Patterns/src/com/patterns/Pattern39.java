package com.patterns;

import java.util.Scanner;

public class Pattern39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1; i--){
            for(int j=n-1; j>=i; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.printf("%c", j+64);
            }
            System.out.println();
        }
        sc.close();
    }
}
