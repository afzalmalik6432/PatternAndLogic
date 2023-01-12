package com.logicalProgram.string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubStringWithOutRepeating02 {

    private static int subString(String str) {
        int max=0;
        int left=0, right=0;
        Set<Character> set = new HashSet<>();
        while(right<str.length()){
            char ch = str.charAt(right);
            if(set.add(ch)){
                max = Math.max(max, right-left+1);
                right++;
            }
            else{
                while(str.charAt(left)!=ch){
                    set.remove(ch);
                    left++;
                }
                set.remove(ch);
                left++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(subString(str));
        sc.close();
    }

    
}
