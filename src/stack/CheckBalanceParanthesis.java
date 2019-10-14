package stack;

import java.util.Stack;

/**
 * Check Parathesis is balanced or not
 * @author shivamkumar
 */
public class CheckBalanceParanthesis {

	public static void main(String args[]) {
		
		String exp  = "[(])";
		System.out.println(areParanthesisBalanced(exp));
	}

	private static boolean areParanthesisBalanced(String exp) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<exp.length(); i++) {
			
			char c= exp.charAt(i);
			char x;
			if( c == '(' || c == '{' || c == '[') {
				stack.push(c);
				continue;
			}
			
			if(stack.isEmpty())
				return false;
			
			switch(c) {
				
				case ')':
					x= stack.pop();
					if(x == '[' || x  == '{')
						return false;
					break;
				case ']':
					x= stack.pop();
					if(x == '(' || x == '{')
						return false;
					break;
				case '}':
					x= stack.pop();
					if(x == '(' || x =='[')
						return false;
					break;
			}
			
		}
		
		return stack.isEmpty();
	}
	
}
