package com.logicalProgram.array;

import java.util.Scanner;

public class PrimeInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean[] resultArray = checkPrime(arr);
        printArray(resultArray);
        sc.close();
    }

    private static void printArray(boolean[] resultArray) {
        for (boolean b : resultArray) {
            System.out.print(b+" ");
        }
    }

    private static boolean[] checkPrime(int[] arr) {
        int length = arr.length;
        boolean[] result = new boolean[length];
        for(int i=0; i<length; i++){
            result[i] = isPrime(arr[i]);
        }
        return result;
    }

    private static boolean isPrime(int num) {
        if(num == 0 || num == 1) return false;
        for(int i=2; i<num/2; i++) if(num%i==0) return false;
        return true;
    }

}
