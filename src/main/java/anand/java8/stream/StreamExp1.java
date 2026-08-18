package anand.java8.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExp1 {

	public static void main(String[] args) {
		
		System.out.println("1- char stream");
		String str = "example";
		IntStream charStream = str.chars();
		List<Character> charList = charStream.mapToObj(ch-> (char)ch).collect(Collectors.toList());
		System.out.println("character list"+ charList);
		
		System.out.println("2.1- integer stream");
		Stream<Integer> intStream1 = Stream.iterate(100, x -> x + x).limit(5);
		intStream1.collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("2.2- double stream");
		Stream<Double> doubleStream1 = Stream.generate(() -> Math.random()).limit(6);
		doubleStream1.collect(Collectors.toList()).forEach(System.out::println);
		
		
		System.out.println("3- creating stream from string");
		Stream<String> strStream1 = Stream.of("data");
		strStream1.collect(Collectors.toList()).forEach(System.out::println);
		
		Stream<String> myStream3 = Stream.of("anand", "kumar", "patel");
		myStream3.collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("4- stream from collection");	
		
		System.out.println("4.1- creating stream from list");
		List<String> list = Arrays.asList("cherry", "banana", "apple", "mango");
		Stream<String> streamFromList = list.stream();
		streamFromList.collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("4.2- creating stream from set");
		Set<String> set = new HashSet<String>(list);
		Stream<String> streamFromSet = set.stream();
		streamFromSet.collect(Collectors.toSet()).forEach(System.out::println);
		
		System.out.println("4.3- creating stream from map");
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(Integer.valueOf(1), "one");
		map.put(Integer.valueOf(2), "two");
		map.put(Integer.valueOf(3), "three");
		
		Stream<Entry<Integer,String>> mapStream= map.entrySet().stream();

		
		System.out.println("4.4- creating stream from array");
		String[] array = {"a", "b", "c"};
		Stream<String> streamFromArray = Arrays.stream(array);
		streamFromArray.collect(Collectors.counting());
		

		
		System.out.println("7.1- Stream from file");
		try {
			Path path = Paths.get("/core/src/anand/java8/stream/test.txt");
			Stream<String> fileStream = Files.lines(path);	
		} catch(IOException ex) {
			
		}
		
		

	}

	public static void allCommonMethods() {

		List<Integer> collect = Stream.iterate(0, x -> x + 1).limit(101).skip(1).filter(x -> x % 2 == 0)
				.map(x -> x / 10).distinct().sorted().peek(x -> System.out.println(x)).collect(Collectors.toList());

		collect.forEach(System.out::println);

	}

}
