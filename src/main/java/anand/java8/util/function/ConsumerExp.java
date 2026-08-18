package anand.java8.util.function;

import java.util.function.Consumer;

public class ConsumerExp {

	public static void main(String[] args) {
		Consumer<String> printNameConsumer = input-> System.out.println(input);
		//printNameConsumer.accept("anand kumar");
		
		Consumer<String> printName = input-> System.out.println(input.toUpperCase());
		
		printNameConsumer.andThen(printName).accept("ananya");
	
						
	}

}
