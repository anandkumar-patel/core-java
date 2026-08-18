package anand.string;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// find the positions of vowels in the given string
public class PositionOfVowels {
	public static void main(String[] args) {
		String input = "Hello World in java";
		List<Integer> data = getVowelsPosition(input);
		System.out.println(data);
		
	}
	
	public static void getVowels(String input) {
		Predicate<Character> isVowel = (c) -> {
			if (c == 'a' || c == 'A' || c == 'e' || c == 'e' || c == 'i' || c == 'i' || c == 'o' || c == 'O' || c == 'u'
					|| c == 'U') {
				return true;
			}
			return false;
		};
		List<Character> ls = input.chars().mapToObj(c -> (char) c).filter(isVowel).collect(Collectors.toList());
		System.out.println(ls);
	}
	
	public static List<Integer> getVowelsPosition(String input) {
		return IntStream.range(0, input.length()).filter(i-> "aeiouAEIOU".indexOf(input.charAt(i)) != -1).boxed().collect(Collectors.toList());
	}
}
