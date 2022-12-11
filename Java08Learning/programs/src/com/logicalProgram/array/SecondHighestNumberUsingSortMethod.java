package com.logicalProgram.array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondHighestNumberUsingSortMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = {a,b,c};
        Arrays.sort(arr);
        System.out.println(arr[1]);
        sc.close();
    }
}
