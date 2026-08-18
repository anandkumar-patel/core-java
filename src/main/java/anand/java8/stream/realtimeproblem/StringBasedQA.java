package anand.java8.stream.realtimeproblem;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringBasedQA {

	public static void main(String[] args) {

		// find the max length of world in a string
		String input = "I am a junior Tech Lead xba";
		int maxLength = Arrays.stream(input.split(" ")).mapToInt(String::length).max().orElse(0);
		System.out.println(maxLength);
		
		// find the max length world in a string
		String input1 = "I am a senior Tech Lead";
		String output1 = Arrays.stream(input1.split(" ")).max(Comparator.comparingInt(String::length)).orElse("");
		System.out.println(output1);

		// find the max length world in a string after removing the special characters
		String input2 = "I am a senior! Technical-Lead, and @experienced.";
		String output2 = Arrays.stream(input2.split(" ")).map(s-> s.replaceAll("[^a-zA-Z]", "")).max(Comparator.comparingInt(String::length)).orElse("");
		System.out.println(output2);
		
		
		List<String> list1 = Arrays.stream(input.split(" ")).toList();
		String max1 = Collections.max(list1); // // Lexicographical comparison
		System.out.println(max1);
		
		List<String> list2 = Arrays.stream(input.split(" ")).toList();
		String max2 = Collections.max(list2, Comparator.comparingInt(String::length));
		System.out.println(max2);
	}

}
