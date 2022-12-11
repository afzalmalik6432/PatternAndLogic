package com.logicalProgram.array;

import java.util.Scanner;

public class PrimeNumber{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n))
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
        sc.close();
    }

    public static boolean isPrime(int n) {
        boolean flag = true;
        for (int i = 2; i < n/2; i++){
            if(n%i==0){
                flag = false;
                break;
            }
                
        }
        return flag;
    }
}