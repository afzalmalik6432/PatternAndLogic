package com.patterns;
import java.util.Scanner;

public class Pattern09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        char d = sc.next().charAt(0);
        for (int i = c; i >=d; i--) {
            for (int j = c; j >= d; j--) {
                System.out.print((char)j);
            }
            System.out.println();
        }
        sc.close();
    }
}
