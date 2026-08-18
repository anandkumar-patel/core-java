package anand.java11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateNot {

	public static void main(String[] args) {
		List<String> list = Arrays.asList(" ", "\t", "\n", "One", "Two", "Three");
		//for getting all string which are empty
		List<String> output1 = list.stream().filter(String::isEmpty).collect(Collectors.toList());
		System.out.println(output1);
		
		List<String> output2 = list.stream().filter(str-> !str.isEmpty()).collect(Collectors.toList());
		//System.out.println(output2);
	}

}
