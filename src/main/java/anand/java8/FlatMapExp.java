package anand.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExp {
	public static void main(String[] args) {
		
		List<List<String>> nestedList = Arrays.asList(Arrays.asList("Anand", "Patel", "Two"),
				Arrays.asList("Urmila", "Nirmala", "SEVEN"), Arrays.asList("surya", "Sarojani", "Ten"));
		
		// Using flatMap to flatten the nested lists into a single stream of String
		List<String> flattenedList = nestedList.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println("Flattened List: " + flattenedList);

		//
		List<String> lower1 = nestedList.stream().flatMap(list -> list.stream().map(String::toLowerCase))
				.collect(Collectors.toList());
		System.out.println("Flattened List{ lower }: " + lower1);
		
		List<String> lower2 = nestedList.stream().flatMap(list -> list.stream())
				.map(s->s.toLowerCase()).collect(Collectors.toList());
		System.out.println("Flattened List{ lower }: " + lower2);
		
		
		Stream<Stream<String>> s = nestedList.stream().map(list -> list.stream());
		s.forEach(ls-> ls.forEach(System.out::println));
	}
}
