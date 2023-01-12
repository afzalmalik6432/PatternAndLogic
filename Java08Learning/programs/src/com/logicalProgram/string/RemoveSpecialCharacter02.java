package com.logicalProgram.string;

import java.util.Scanner;

public class RemoveSpecialCharacter02 {
    public static String removeChar(String s){
        return s.replaceAll("[^a-zA-Z0-9]", "");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeChar(str));
        sc.close();
    }
}
