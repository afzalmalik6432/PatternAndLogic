package com.logicalProgram.string;

import java.util.Scanner;

public class RemoveWhiteSpaceFromString {

    // static String removeSpace(String str){
    //     String res = "";
    //     for(int i=0; i<str.length(); i++){
    //         if(Character.isAlphabetic(str.charAt(i)) || Character.isDigit(str.charAt(i))){
    //             res+=str.charAt(i);
    //         }
    //     }
    //     return res;
    // }

    static String removeSpace(String str){
        // str.trim(); // this remove the leading and trailing spaces
        String res = str.replaceAll("\\s", "");
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeSpace(str));
        sc.close();
    }
}
