package com.patterns;

import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1; i<=n; i++){
            for (int j = n; j >=i; j--) {
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
        sc.close();
    }
}
