package com.logicalProgram;

import java.util.Scanner;

public class functionUnderstaing {

    public static int add(byte b, int a) {  
        return a+b;
    }
    public static int add(int a, byte b) {
        return a*b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();
        int b = sc.nextInt();

        int result = add(a, b);
        System.out.print(result);
        sc.close();
    }
}
