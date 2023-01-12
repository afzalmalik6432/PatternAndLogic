package com.logicalProgram.string;

import java.util.Scanner;

public class ReverseString02 {

    public static String rev(String s){
        StringBuffer str = new StringBuffer(s);
        // return str.reverse()+"";
        return str.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(rev(str));
        sc.close();
    }
}
