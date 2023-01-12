package com.logicalProgram.stack;


import java.util.*;
public class DeleteConsiquetive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        Stack<String>st=new Stack<>();
        for(int i=0;i<n;i++){
            String str=sc.next();
            if(st.size()>0 && st.peek().equals(str) )
                st.pop();
            else
                st.push(str);
        }
        System.out.println(st.size());
        sc.close();
    }
}