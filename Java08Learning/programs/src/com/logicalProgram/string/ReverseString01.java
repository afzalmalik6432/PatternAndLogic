package com.logicalProgram.string;

import java.util.Scanner;

public class ReverseString01 {

    public static String reverseString(String s){
        String ans = "";
        for(int i=s.length()-1; i>=0; i--){
            ans+=s.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseString(str));
        sc.close();
    }
}
