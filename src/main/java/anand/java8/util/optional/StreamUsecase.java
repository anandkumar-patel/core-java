package anand.java8.util.optional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamUsecase {

	public static void main(String[] args) {
		List<Optional<String>> optionals = List.of(
				Optional.of("Java"), 
				Optional.empty(), 
				Optional.of("Stream"),
				Optional.empty(), 
				Optional.of("API"));

		// Converts each Optional to a Stream
		List<String> presentValues = optionals.stream().flatMap(Optional::stream) 
				.collect(Collectors.toList());

		presentValues.forEach(System.out::println);
	}

}
