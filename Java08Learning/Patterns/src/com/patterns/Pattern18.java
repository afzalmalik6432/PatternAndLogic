package com.patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j=n-i; j>=1 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
