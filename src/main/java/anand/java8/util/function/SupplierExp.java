package anand.java8.util.function;

import java.util.function.Supplier;

public class SupplierExp {
	public static void main(String[] args) {
		Supplier<String> supplier1 = () -> "Hello";
		System.out.println(supplier1.get());
		
	}
}
