package com.patterns;
import java.util.Scanner;

public class Pattern04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= 0; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
}
