package com.logicalProgram.string;

import java.util.Scanner;

public class RemoveSpecialCharacter01 {

    public static String removeChar(String s){
        String ans = "";
        for(int i=0;i<s.length(); i++){
            if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeChar(str));
        sc.close();
    }
}
