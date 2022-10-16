package com.geeksterWeeklyTest;

import java.util.Scanner;

public class ZigZagSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n>1){
            if(n%2==0){
                n-=3;
                count+=2;
            }
            else{
                n+=1;
                count+=1;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
