package com.geeksterWeeklyTest;

import java.util.Scanner;

public class UpperCaseLowerCaseXY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        char c = sc.next().charAt(0);

        if(Character.isUpperCase(c)){
            System.out.println(x+y);
        }
        else if(Character.isLowerCase(c)){
            System.out.println(x-y);
        }
        else{
            System.out.println(x%y);
        }

        sc.close();
    }
}
