package anand.logical;

import java.util.Stack;
import java.util.StringTokenizer;

public class StringReverse {

	public static void main(String[] args) {
		String s = "Java technology blog for smart java concepts and coding practices";
		 
		// Put words from String in Stack
		Stack<String> myStack = new Stack<String>();
		StringTokenizer st = new StringTokenizer(s," ");
		 
		while (st.hasMoreTokens()) {
		    myStack.push(st.nextToken());
		}
		 
		// Build the reverse string
		StringBuilder reverseString = new StringBuilder();
		while (!myStack.empty()) {
		    reverseString.append(myStack.pop() + " ");
		}
		 
		System.out.println(reverseString.toString());
		 

	}

}
