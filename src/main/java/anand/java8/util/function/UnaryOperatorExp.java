package anand.java8.util.function;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorExp {

	public static void main(String[] args) {

		Function<String, String> toUpperFun = str-> str.toUpperCase();
		
		System.out.println(toUpperFun.apply("Uday Raj"));
		
		
		UnaryOperator<String> unaryToUpper = str-> str.toUpperCase();
		System.out.println(unaryToUpper.apply("Anand kumar"));
		// unaryOperator is used when input and return data type are Same
		UnaryOperator<String> subStr = str-> str.substring(2,7);
		System.out.println(subStr.apply("pratap singh kuwar"));
		// use of andThen() method **point** returns Function.
		Function<String, String> andThenUse = subStr.andThen(toUpperFun);
		System.out.println(andThenUse.apply("kaml naresah patel"));
	}
}
