package com.patterns;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
        sc.close();
    }
}
