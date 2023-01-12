package com.logicalProgram.string;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubStringWithOutRepeating03 {
    private static int subString(String str) {
        int left=0, right=0;
        int len =0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(right<str.length()){
            if(map.containsKey(str.charAt(right))){
                left=Math.max(map.get(str.charAt(right))+1,left);
            }
            map.put(str.charAt(right),right);
            len = Math.max(len, right-left+1);
            right++;
        }
        return len;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(subString(str));
        sc.close();
    }
}
