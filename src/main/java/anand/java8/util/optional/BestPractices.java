package anand.java8.util.optional;

import java.util.Optional;

public class BestPractices {

	public static void main(String[] args) {
		Optional<String> optional = Optional.ofNullable(null);
		// Bad practice
		//String value1 = optional.get(); // May throw NoSuchElementException
		//System.out.println(value1);
		// Better
		String value2 = optional.orElse("Default Value");
		System.out.println(value2);
		
		// Use ifPresent and ifPresentOrElse for conditional execution
		optional.ifPresent(value -> System.out.println("Value: " + value));
		optional.ifPresentOrElse(
		    value -> System.out.println("Value: " + value),
		    () -> System.out.println("Value is not present")
		);


		// Use orElseGet and orElseThrow for fallback mechanisms
		String value3 = optional.orElseGet(() -> "Generated Default Value");
		System.out.println(value3);
		String value4 = optional.orElseThrow(() -> new IllegalArgumentException("No value present"));
		System.out.println(value4);
	}

}
