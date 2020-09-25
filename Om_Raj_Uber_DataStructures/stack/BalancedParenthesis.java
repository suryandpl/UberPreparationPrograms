package com.wipro.stack;

import java.util.*;

public class BalancedParenthesis {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Stack<Character> stk = new Stack<Character>();
		System.out.println("Enter expression");
		String exp = scan.next();
		int len = exp.length();

		for (int i = 0; i < len; i++) {
			char ch = exp.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				stk.push(ch);
				continue;
			}
			if (stk.isEmpty()) 
                System.out.println("Unbalanced.");
			
			switch (ch) { 
            case ')': 
                stk.pop(); 
                if (ch == '{' || ch == '[') 
                	System.out.println("Unbalanced."); 
                break; 
  
            case '}': 
                stk.pop(); 
                if (ch == '(' || ch == '[') 
                	System.out.println("Unbalanced."); 
                break; 
  
            case ']': 
                stk.pop(); 
                if (ch == '(' || ch == '{') 
                	System.out.println("Unbalanced."); 
                break; 
            } 
		}
			if(stk.isEmpty()) {
				System.out.println("Balanced.");
			}
	}
}