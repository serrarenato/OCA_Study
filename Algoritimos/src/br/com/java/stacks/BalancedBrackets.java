package br.com.java.stacks;

import java.util.Stack;

public class BalancedBrackets {
	public static boolean isBalanced(String expression) {

		// Must be even
		if ((expression.length() & 1) == 1)
			return false;
		else {
			char[] brackets = expression.toCharArray();
			Stack<Character> s = new Stack<>();
			for (char bracket : brackets)
				switch (bracket) {
				case '{':
					s.push('}');
					break;
				case '(':
					s.push(')');
					break;
				case '[':
					s.push(']');
					break;
				default:
					if (s.empty() || bracket != s.peek())
						return false;
					s.pop();
				}
			return s.empty();
		}

	}

	public static void main(String[] args) {
	        
	        int t = 3;
	        
	            String expression = "{[()]}";
	            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
	             expression = "{[(])}";
	            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
	             expression = "{{[[(())]]}}";
	            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
	            System.out.println((6 & 1));
	            System.out.println((16 & 1));
	            System.out.println((17 & 1));
	            System.out.println((7 & 1));
	            System.out.println((6 & 6));
	            System.out.println((6 & 7));
	            System.out.println((14 & 7)); //1110 - 111 -> 110
	            System.out.println((20 & 7)); // 10100 - 111 -> 100
	            System.out.println((21 & 7)); // 10101 - 111 -> 101
	    }

}
