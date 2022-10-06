package com.patterns;
import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=65; i<65+n; i++){
            for(int j=65; j<=i; j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
        sc.close();
    }
}
