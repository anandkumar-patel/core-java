package anand.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MustKnow {

	public static void main(String[] args) {

		System.out.println("converting a int array to Integer List");
		int[] arr = { 11, 12, 13, 14, 15 };
		List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(list.size());

		System.out.println("converting string array to comma separated string");
		List<String> input = Arrays.asList("anand", "kumar", "patel");
		String output = String.join(",", input);
		System.out.println(output);

		System.out.println("creating a list with a default value and size");
		int size = 10;
		int defaultValue = 2;
		List<Integer> list1;
		Integer[] arr1 = new Integer[size];
		Arrays.fill(arr1, defaultValue);
		list1 = Arrays.asList(arr1);
		System.out.println(list1);

		System.out.println("remove duplicate elements from a list");
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
		List<String> output1 = listOfStrings.stream().distinct().collect(Collectors.toList());
		System.out.println(output1);

		System.out.println("find frequency of each character in a string");
		String inputString = "Java Concept Of The Day";
		Map<Character, Long> charCountMap = inputString.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c->c, Collectors.counting()));
		System.out.println(charCountMap);

		System.out.println("find frequency of each element in an array or a list");
		List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler",
				"Note Book", "Pencil");
		Map<String, Long> elementCountMap = stationeryList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(elementCountMap);

		System.out.println("sort the given list of decimals in reverse order");
		List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
		List<Double> sorted = decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sorted);

		System.out.println("join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter");
		List<String> listOfStrings1 = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		String joinedString = listOfStrings1.stream().collect(Collectors.joining(", ", "[", "]"));
		System.out.println(joinedString);

		List<Integer> ll = Arrays.asList(1, 4, 5, 6, 3, 4);
		// ll.stream().collect(Collectors.joining()); ?? how to do it??
		
		System.out.println("given list of integers, print the numbers which are multiples of 5");
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        List<Integer> multipleOf5 = listOfIntegers.stream().filter(i->i%5==0).collect(Collectors.toList());
        System.out.println(multipleOf5);

        System.out.println("Given a list of integers, find maximum and minimum of those numbers");
        List<Integer> listOfIntegers1 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer min = listOfIntegers1.stream().min(Comparator.naturalOrder()).get();
        Integer max = listOfIntegers1.stream().max(Comparator.naturalOrder()).get();
        System.out.println(" min : "+min+ " and max : "+max);
        
        
        System.out.println("merge two unsorted arrays into single sorted array");
        int[] a = new int[] {4, 2, 7, 1};
        int[] b = new int[] {8, 3, 9, 5,4};
        int[] result = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(result));
        
        System.out.println("merge two unsorted arrays into single sorted array without duplicates");
        int[] result1 = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(result1));
        
        System.out.println("get three maximum numbers and three minimum numbers from the given list of integers");
        List<Integer> listOfIntegers2 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        List<Integer> min3 = listOfIntegers2.stream().sorted().limit(3).toList();
        System.out.println(min3);
        List<Integer> max3 = listOfIntegers2.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println(max3);
        
		System.out.println("program to check if two strings are anagrams or not");
		String s1 = "RaceCar";
		String s2 = "CarRace";
		s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
//		System.out.println("s1 = "+s1);
//		System.out.println("s2 = "+s2);
		if (s1.equals(s2)) {
			System.out.println("Two strings are anagrams");
		} else {
			System.out.println("Two strings are not anagrams");
		}
				
		System.out.println("sum of all digits of a number");
		int num = 786543;
		int sum = Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));
		System.out.println(sum);
		
		System.out.println("second largest number in an integer array");
        List<Integer> listOfIntegers3 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer secondLargestNumber = listOfIntegers3.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondLargestNumber);
        
        System.out.println("list of strings, sort them according to increasing order of their length");
        List<String> listOfStrings2 = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        List<String> orderByLength = listOfStrings2.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(orderByLength);
        
        System.out.println("Given an integer array, find sum and average of all elements");
        int[] input1 = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        int sum1 = Arrays.stream(input1).sum();
        System.out.println("Sum = "+sum1);
        double average1 = Arrays.stream(input1).average().getAsDouble();
        System.out.println("Average = "+average1);
        
        System.out.println("find common elements between two arrays");
        List<Integer> list2 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list3 = Arrays.asList(12, 56, 17, 21, 94, 34);
        List<Integer> list4 = list2.stream().filter(list3::contains).collect(Collectors.toList());
        System.out.println(list4);
        
        System.out.println("find sum of first 10 natural numbers");
        int sum3 = IntStream.range(1, 11).sum();
        System.out.println(sum3);
        
        System.out.println("reverse an integer array"); //  ?????? find some other way
        int[] array = new int[] {5, 1, 7, 3, 9, 6};
        int[] reversedArray = IntStream.rangeClosed(1, array.length).map(i -> array[array.length - i]).toArray();
        
        int[] reversedArray1 = IntStream.rangeClosed(1, array.length).toArray();
        System.out.println(Arrays.toString(reversedArray1));
 
	}
}
