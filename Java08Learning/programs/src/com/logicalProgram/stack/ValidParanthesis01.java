package com.logicalProgram.stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis01 {

    public static boolean isValid(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='{' || ch=='[' || ch=='(') st.push(ch);
            else{
                if(st.size()==0) return false;
                else if(ch == '}' && st.peek()!='{') return false;
                else if(ch == ')' && st.peek()!='(') return false;
                else if(ch == ']' && st.peek()!=']') return false;
                else{
                    st.pop();
                }
            }
        }
        boolean ans = st.size()==0;
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isValid(str));
        sc.close();
    }
}
