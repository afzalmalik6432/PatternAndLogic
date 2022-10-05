package com.patterns;
import java.util.Scanner;

public class Pattern08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        char d = sc.next().charAt(0);
        for (int i = d; i >=c; i--) {
            for (int j = d; j >= c; j--) {
                System.out.print((char)i);
            }
            System.out.println();
        }
        sc.close();
    }
}
