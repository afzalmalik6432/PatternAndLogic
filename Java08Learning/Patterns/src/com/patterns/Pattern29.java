package com.patterns;

import java.util.Scanner;

public class Pattern29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n; i++){
            for(int j=n-i; j>=1; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
        sc.close();
    }
}
