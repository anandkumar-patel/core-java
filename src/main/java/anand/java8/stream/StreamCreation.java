package anand.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {
	public static void main(String[] args) {

		System.out.println("*** 1. Stream from a Collection (e.g., List) ---");
		List<String> list = Arrays.asList("anand", "urmila","ananya","surya");
		Stream<String> stream1 = list.stream();
		stream1.forEach(System.out::println);
		
		
		System.out.println("*** 2. Stream from an array ---");
		IntStream stream2 = Arrays.stream(new int[]{11,13});
		stream2.forEach(System.out::println);

		System.out.println("*** 3. Stream from individual values (Stream.of) ---");
		Stream<String> stream3 = Stream.of("anand","urmila","ananya", "surya");
		stream3.forEach(System.out::println);		
		
		System.out.println("*** 4. Stream from a generator (infinite) ---");
		Stream<Double> stream4 = Stream.generate(Math::random).limit(5);
		stream4.forEach(System.out::println);
		
        // 5. Stream using Stream.iterate (infinite)
		Stream.iterate(10, null);
        // 6. Stream from a file (each line is one element)
        // 7. Stream from a primitive array (int[])
        // 8. Parallel Stream from a collection
	}

}
