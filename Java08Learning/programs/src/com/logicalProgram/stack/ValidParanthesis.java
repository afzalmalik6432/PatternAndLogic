package com.logicalProgram.stack;
import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {

    static boolean checkParanthesis(String s) {
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (c == '(')
                st.push(')');
            else if (c == '{')
                st.push('}');
            else if (c == '[')
                st.push(']');
            else if (st.isEmpty() || st.pop() != c)
                return false;
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(checkParanthesis(str));
        sc.close();
    }
}
