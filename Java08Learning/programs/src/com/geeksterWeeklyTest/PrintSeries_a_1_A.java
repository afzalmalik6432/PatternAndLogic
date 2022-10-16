package com.geeksterWeeklyTest;

import java.util.Scanner;

/**
 * PrintSeries_a_1_A
 */
public class PrintSeries_a_1_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.println((char)(96+i)+" "+i+" "+(char)(64+i));
        }
        sc.close();
    }
}