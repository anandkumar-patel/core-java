package anand.tests.codilty;

import java.util.Stack;

public class ExpressionCheckUsingStack {

	public static void main(String[] args) {

		String exp = "[{()}]";

		
		Boolean result = areParenthesisBalanced(exp);
		
		if (result) {
			System.out.println("expression " + exp + " is a valid expression");
		} else {
			System.out.println("expression " + exp + " is not a valid expression");
		}
	}
	
	public static boolean areParenthesisBalanced(String exp) {
		Stack<Character> st = new Stack<>();
		
		for (int i = 0; i < exp.length(); i++) {
			
			/*If the exp.charAt(i) is a starting parenthesis then push it
			 * else if exp.charAt(i) is an ending parenthesis then pop from stack and check
			 * if the popped parenthesis is a matching pair , 
			 * if it's other character return false
			 */
			if ('{' == exp.charAt(i) || '[' == exp.charAt(i) || '(' == exp.charAt(i)) {
				st.push(exp.charAt(i));
			} else if ('}' == exp.charAt(i) || ']' == exp.charAt(i) || ')' == exp.charAt(i)) {
				if (st.isEmpty()) {
					return false;
				}
				/*
				 * Pop the top element from stack, if it is not a pair
				 * parenthesis of character then there is a mismatch. This
				 * happens for expressions like {(})
				 */
				if (!isMatchingPair(st.pop(), exp.charAt(i))) {
					return false;
				}

			} else {
				return false;
			}

		}
		
		/*
		 * If there is something left in expression then there is a starting
		 * parenthesis without a closing parenthesis
		 */

		if (st.isEmpty()) {
			return true; /* balanced */
		} else { /* not balanced */
			return false;
		}
	}

	public static Boolean isMatchingPair(Character charA, Character charB) {
		boolean returnValue = false;
		if (charA == '[' && charB == ']') {
			returnValue = true;
		} else if (charA == '{' && charB == '}') {
			returnValue = true;
		} else if (charA == '(' && charB == ')') {
			returnValue = true;
		} else {
			returnValue = false;
		}
		return returnValue;
	}

}
