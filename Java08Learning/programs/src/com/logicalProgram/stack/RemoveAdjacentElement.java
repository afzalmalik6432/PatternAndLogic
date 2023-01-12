package com.logicalProgram.stack;

import java.util.Scanner;
import java.util.Stack;

// leetcode 1047

public class RemoveAdjacentElement {

    static String removeDupicate(String str){
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char ch : str.toCharArray()){
            if(st.empty()) st.push(ch);
            else if(st.peek() == ch) st.pop();
            else st.push(ch);
        }
        while(!st.empty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeDupicate(str));
        sc.close();
    }    
}
