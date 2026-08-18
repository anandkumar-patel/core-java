package anand.java8.util.optional;

import java.util.Optional;

public class OptionalExp {

	public static void main(String[] args) {
		// creating empty optional
		Optional<String> obj1 = Optional.empty();
		obj1.ifPresent(val -> System.out.println("1-value is :" + val));

		Optional<String> obj2 = Optional.of("2-anand"); // passing null will throw exception
		obj2.ifPresent(System.out::println);

		Optional<String> obj3 = Optional.ofNullable(null); // passing null is ok
		obj3.ifPresent(val -> System.out.println("3-value is :" + val));

		// String[] words = new String[5];
		String[] words = { "Anand", "Kumar", null, "SURYA", "ananya" };
		Optional<String> checkNull = Optional.ofNullable(words[2]);
		if (checkNull.isPresent()) {
			String word = words[2].toLowerCase();
			System.out.print("4-"+word);
		} else {
			System.out.println("4-word is null");
		}
//		// explore these concepts...		
//		checkNull.map(String::toUpperCase);
//		checkNull.flatMap(null);
//		checkNull.filter(null);
//		checkNull.ifPresent(null);
//		checkNull.ifPresentOrElse(null, null);
//		checkNull.or(null);
//		checkNull.orElse(null);
//		checkNull.orElseGet(null);
//		checkNull.orElseThrow();
//		checkNull.orElseThrow(null);
//		checkNull.stream();
		

		// java-9 enhancement
		Optional<String> obj4 = Optional.ofNullable(null);
		// ifPresentOrElse()
		obj4.ifPresentOrElse(System.out::println, () -> System.out.println("9-Value not present"));
		// or()
		Optional<String> fallback = obj4.or(() -> Optional.of("10-and take this value"));

		fallback.ifPresent(System.out::println);
		// stream()
		fallback.stream().filter(value -> value.startsWith("an")).forEach(System.out::println);

		// java-10 enhancement
		// var
		var optional = Optional.of("Hello, Java 10!");
		optional.ifPresent(System.out::println);

		// java-11 enhancement
		// isEmpty()
		if (optional.isEmpty()) {
			System.out.println("11-Value is not present");
		} else {
			System.out.println("11-Value is present");
		}

	}

}
