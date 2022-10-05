package com.patterns;

import java.util.Scanner;

public class Demo {

    static boolean isPrime(int n){
        if(n==0 || n==1)
            return false;
        for(int i=2; i<=n/2; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1; i<=n; i++){
            if(n%i==0 && isPrime(i)){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
