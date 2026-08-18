package anand.java8.util.function;

import java.util.function.Function;

public class FunctionExp {
	public static void main(String[] args) {

		Function<String, Integer> lengthDouble = str -> str.length() * 2;
		System.out.println(lengthDouble.apply("Anand"));

		Function<Integer, Integer> doubleFunc = input -> input * 2;
		Function<Integer, Integer> qubeFunc = input -> input * input * input;

		System.out.println("doubleFunc.andThen(qubeFunc).apply(3) : " + doubleFunc.andThen(qubeFunc).apply(3)); // 216

		System.out.println("qubeFunc.andThen(doubleFunc).apply(3) : " + qubeFunc.andThen(doubleFunc).apply(3)); // 54
		System.out.println("doubleFunc.compose(qubeFunc).apply(3) : " + doubleFunc.compose(qubeFunc).apply(3)); // 54

		Function<String, String> identityFun = Function.identity();
		System.out.println(identityFun.apply("Anand"));
		
	}

}
