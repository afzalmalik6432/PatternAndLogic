package com.patterns;

import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = n-i+1; j >=1; j--) {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
        sc.close();
    }
}
