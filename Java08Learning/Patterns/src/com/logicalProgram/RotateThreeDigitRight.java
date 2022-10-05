package com.logicalProgram;

import java.util.Scanner;

public class RotateThreeDigitRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=1; i<=3; i++){
            int digit = x%10;
            x/=10;
            x = digit*1000000 + x;
        }
        System.out.println(x);
        sc.close();
    }
}
