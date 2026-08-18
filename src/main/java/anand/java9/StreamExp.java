package anand.java9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExp {

	public static void main(String[] args) {
		StreamExp obj = new StreamExp();
		obj.takeWhile();
		obj.dropWhile();
		obj.iterate();
	}

	// iterate until takeWhile condition is true and collect those values.
	public void takeWhile() {
		System.out.println("takeWhile method");
		List<Integer> list = Stream.of(2, 8, 3, 4, 5, 6, 7, 8, 9, 10).takeWhile(i -> (i % 2 == 0))
				.collect(Collectors.toList());
		System.out.println(list);
	}

	// iterate until dropWhile condition is true and drop those values.
	public void dropWhile() {
		System.out.println("dropWhile method");
		List<Integer> list = Stream.of(2, 8, 3, 4, 5, 6, 7, 8, 9, 10).dropWhile(i -> (i % 2 == 0))
				.collect(Collectors.toList());
		System.out.println(list);
	}

	public void ofNullable() {
		System.out.println("ofNullable method");

	}

	public void iterate() {
		System.out.println("iterate method");
		Stream.iterate(1, i -> i <= 10, i -> i * 3).forEach(System.out::println);
	}
}
