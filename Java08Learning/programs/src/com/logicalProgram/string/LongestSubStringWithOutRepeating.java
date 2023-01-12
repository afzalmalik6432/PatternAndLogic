package com.logicalProgram.string;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubStringWithOutRepeating {

    public static int subString(String str){
        int ans =0;
        int i=-1;
        int j=-1;
        HashMap<Character,Integer> map = new HashMap<>();
        while(true){
            Boolean flag1 = false;
            Boolean flag2 = false;
            //aquire
            while(i<str.length()-1){
                flag1 = true;
                i++;
                char ch = str.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0)+1);

                if(map.get(ch)==2){
                    break;
                }
                else{
                    int len = i-j;
                    if(len>ans){
                        ans=len;
                    }
                }
                
            }
            //release
            while(j<i){
                flag2=true;
                j++;
                char ch = str.charAt(j);
                map.put(ch, map.get(ch)-1);
                if(map.get(ch)==1){
                    break;
                }
            }
            if(flag1 == false && flag2 == false){
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(subString(str));
        sc.close();
    }
}
