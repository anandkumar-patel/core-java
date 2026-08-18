package anand.tests.hackerrank;

import java.util.ArrayList;
import java.util.List;

/**
 * PROBLEM STATEMENT : Given a string str containing lowercase alphabet, the
 * task is to count the substring that contains all vowels atleasr once, and
 * there is no consonent present in the string.
 * 
 * @author anandpatel
 *
 */
public class SubStringContainsAllVowels {

	public static void main(String[] args) {

		String str1 = "aeoibsddaaeiouudb";
		// 4 output = "aaeiouu" , "aeiou", "aaeiou"

		String str2 = "aaeoisbddiouuaedf";
		// 1 output = "iouuae"

		String str3 = "aeouisddaaeeiouua";
		// 9 output = "aeoui", "aaeeiouua", "aaeeiou", "aeeiou", "eeiouua",
		// "eiouua", "aaeiouua", "aeiouua", "aaeioua", "aeioua"

	}

	public boolean isVowel(char chr) {
		return chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u';
	}

	public int countSubString(String str) {
		int count = 0;
		List<Character> charList = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			if (isVowel(str.charAt(i))) {
				charList.add(str.charAt(i));
			} else {
				if (charList.size() >= 5) {

				} else {
					charList.clear();
				}
			}
		}

		return count;
	}
}
