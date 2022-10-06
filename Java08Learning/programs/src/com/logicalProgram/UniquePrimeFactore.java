package com.logicalProgram;

import java.util.Scanner;

public class UniquePrimeFactore {
    static boolean isPrime(int n){
        if(n==1 || n==0){
            return false;
        }
        for (int i = 2; i <=n/2; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0 && isPrime(i))
                System.out.println(i);
        }
        sc.close();
    }
}
