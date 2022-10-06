package com.logicalProgram;

import java.util.Scanner;

public class PrimeNumber{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n))
            System.out.println(" Not Prime Number");
        else
            System.out.println("Prime Number");
        sc.close();
    }

    private static boolean isPrime(int n) {
        int num=0;
        boolean flag = false;
        for (int i = 2; i < n/2; i++){
            if(n%i==0)
                num++;
        }
        if(num > 0)
            return !flag;
        else
            return flag;
    }
}